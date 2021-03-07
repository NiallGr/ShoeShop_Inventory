package com.shoeshop.admin.application.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoeshop.admin.application.entity.Shoe;
import com.shoeshop.admin.application.service.ShoeService;


@Controller
@RequestMapping("/shoes")
public class ShoeController {

	private ShoeService shoeService;
	
	public ShoeController(ShoeService theShoeService) {
		shoeService = theShoeService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listShoes(Model theModel) {
		
		// get employees from db
		List<Shoe> theShoes = shoeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("shoes", theShoes);
		
		return "shoes/inventoryShoe";
	}
	
	@GetMapping("/showAddShoeForm")
	public String addShoe(Model theModel) {
		
		// create model attribute
		Shoe theShoe = new Shoe();
		
		theModel.addAttribute("shoe", theShoe);
		
		return "shoes/addShoe";
	}
	
	@GetMapping("/showUpdateShoeForm")
	public String showUpdateShoeForm(@RequestParam("shoeId") int theId, Model theModel) {
		
		 // get the employee from the service
		Shoe theShoe = shoeService.findById(theId);
		
		// set employee as a model attrubute to pre-pop the form 
		theModel.addAttribute("shoe", theShoe);
		
		// send over to the form
		return "shoes/addShoe";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("shoe") Shoe theShoe) {
		
		// save the Shoe
		shoeService.save(theShoe);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/shoes/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("shoeId") int theId) {
		
		// delete the employee
		shoeService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/shoes/list";
		
	}
}



