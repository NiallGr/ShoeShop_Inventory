package com.shoeshop.admin.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoeshop.admin.application.dao.ShoeRepository;
import com.shoeshop.admin.application.entity.Shoe;

@Service
public class ShoeServiceImpl implements ShoeService {

		private ShoeRepository shoeRepository;
		
		@Autowired
		public ShoeServiceImpl(ShoeRepository theShoeRepository) {
			shoeRepository = theShoeRepository;
		}
	// Show all	
	@Override
	public List<Shoe> findAll() {
		return shoeRepository.findAll();
	}
	// Find (For testing) 
	@Override
	public Shoe findById(int theId) {
		Optional<Shoe> result = shoeRepository.findById(theId);
		
		Shoe theShoe = null;
		if(result.isPresent()) {
			theShoe = result.get();
		} else {
			throw new RuntimeException("did not find employee id -" + theId);
		}
		return theShoe;
	}
	// Save
	@Override
	public void save(Shoe theShoe) {
		shoeRepository.save(theShoe);

	}
	// Delete
	@Override
	public void deleteById(int theId) {
		shoeRepository.deleteById(theId);
	}

}
