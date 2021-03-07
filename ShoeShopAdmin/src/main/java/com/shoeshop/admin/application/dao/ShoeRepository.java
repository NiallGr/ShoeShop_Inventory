package com.shoeshop.admin.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoeshop.admin.application.entity.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Integer> {

}
