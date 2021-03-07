package com.shoeshop.admin.application.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("Niall").password("test123").roles("MANAGER", "ADMIN"))
			.withUser(users.username("Sean").password("test123").roles("EMPLOYEE"))
			.withUser(users.username("Pete").password("test123").roles("EMPLOYEE", "MANAGER"))
			.withUser(users.username("Jake").password("test123").roles("EMPLOYEE", "ADMIN"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
			// What parts of the site user have access to based on their role 
		http.authorizeRequests()
			.antMatchers("/shoes/list*").hasAnyRole("MANAGER", "ADMIN","EMPLOYEE" )
			.antMatchers("/shoes/save*").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/shoes/delete").hasRole("ADMIN")
			.antMatchers("/resources/**").permitAll()
			.and()
			.formLogin()
				.loginPage("/LoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
			.and()
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
		
	}
		
}