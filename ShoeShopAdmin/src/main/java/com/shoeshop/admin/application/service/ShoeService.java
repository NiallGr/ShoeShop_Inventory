package com.shoeshop.admin.application.service;

import java.util.List;

import com.shoeshop.admin.application.entity.Shoe;

public interface ShoeService {

		public List<Shoe> findAll();
		
		public Shoe findById(int theId);
		
		public void save(Shoe theShoe);
		
		public void deleteById(int theId);
}
