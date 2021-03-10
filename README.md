# ShoeShop Inventory 

Shoe Shop Inventory Site - CRUD functionality, User Authentication, Role Based Access :
- Agile Scrum Development Cycle
- Eclipse EE
-	Maven
-	Java 1.8
- SpringBoot
-	Thymeleaf
-	CSS & Bootstrap
-	MySQL


# Video Tour: https://www.youtube.com/watch?v=ZGzmF8sl0U0

# Test the Application
1. Download project, Inport as Maven project (Eclipse)

2. Run the Spring Boot application: ShoeShopAdminApplication.java

3. Open a web browser for the app: http://localhost:2023

4. Log in using one of the accounts (These are all configurable in the "SecurityConfig.java" file.)


| user id       | password      |   roles               |
| ------------- |:-------------:| ---------------------:|
| Niall         | test123       | "MANAGER", "ADMIN"    |
| Sean          | test123       | "EMPLOYEE"            |
|  Pete         | test123       | "EMPLOYEE", "MANAGER" |
| Jake          | test123       | "EMPLOYEE", "ADMIN"   |

5. Confirm that you can login and access data based on the roles.


# Prebuild  
Created a workflow using the Scrum methodology: This workflow was spread out of 3 sprints, with a duration of one long sprint (2 weeks) followed by two short springs(1 week). (4 weeks total dev cycle)
This is captured in "img: 1.1"

"img: 1.1" Click on images to see more clearly. 
]![ShoeShop_Inventory_Scrum](https://user-images.githubusercontent.com/62908390/110228564-00a72100-7eb7-11eb-9908-0de660cfcb0e.JPG)


# Build
## Sprint 1 (week 1 - 2) Backend Focus
### Project Set Up 
 - Created a visual diagram with the files, class’s & method's that I intended to use in the project. (Check Img 1.2)

 - Create MySQL Database (IMG 1.3) Files to create Database in MySQL are above in repository (Schema: shoe_shop_inventory)
 - 
![MySQL_Structure_Shoe 2](https://user-images.githubusercontent.com/62908390/110228559-fd139a00-7eb6-11eb-9b0e-143dfaacfd0e.JPG)
![MySQL_Structure_Shoe](https://user-images.githubusercontent.com/62908390/110228563-fedd5d80-7eb6-11eb-98a7-9bbc7b08862c.JPG)

 - Create Project structure and add dependencies using SpringInitalizr https://start.spring.io/ 
![Phase3-Setup](https://user-images.githubusercontent.com/62908390/110228692-f6d1ed80-7eb7-11eb-9998-23e39739c9ad.JPG)

### Packages (Java files & Interfaces) ###

1.  com.shoeshop.admin.application (Main java class to start application)
       -  ShoeShopAdminApplication.java
        
2.	com.shoeshop.admin.application.config (Security Config, Store passwords and assign user restrictions) 
       -	SecurityConfig.java
3.	com.shoeshop.admin.application.controller (processing incoming requests) 
       -	LoginController.java
       -  ShoeController.java

4.	com.shoeshop.admin.application.dao (logic required to access data sources)
       -	ShoeRepository.java 
       
5.	com.shoeshop.admin.application.entity (representing data that can be persisted to the database)
       -	Shoe.java 
       
6.	com.shoeshop.admin.application.service  (Bussiness logic and CRUD functionality) 
       -	ShoeService.java 
       -  ShoeService.lmpl.java

         




IMG 1.2 Click on images to see more clearly. 

![ShoeShop_Inventory_WorkFlow](https://user-images.githubusercontent.com/62908390/110228566-0270e480-7eb7-11eb-962a-ab0e7cb10a26.jpg)


## Sprint 2 (Week 3) Front-end Focus


      
-	Create Administration login.

- Create shoe inventory page.
 
-	Create shoe add page.

- Style pages.
  



## Sprint 3 (Week 4) Testing With Users

- User Test
- Fixes Bugs
