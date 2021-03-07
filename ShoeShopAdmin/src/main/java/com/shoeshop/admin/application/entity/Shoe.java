package com.shoeshop.admin.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoe_inventory")
public class Shoe {

		// define fields
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="shoe_name")
		private String shoeName;
		
		@Column(name="shoe_price")
		private String shoePrice;
		
		@Column(name="shoe_description")
		private String shoeDescription;
		
		@Column(name="img_url")
		private String imgUrl;
		
		
		// define constructors
		
		// no arg constructor is need for hibernate 
		public Shoe() {
			
		}

		public Shoe(String shoeName, String shoePrice, String shoeDescription, String imgUrl) {
			this.shoeName = shoeName;
			this.shoePrice = shoePrice;
			this.shoeDescription = shoeDescription;
			this.imgUrl = imgUrl;
		}
		
		// define getter and setter

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getShoeName() {
			return shoeName;
		}

		public void setShoeName(String shoeName) {
			this.shoeName = shoeName;
		}

		public String getShoePrice() {
			return shoePrice;
		}

		public void setShoePrice(String shoePrice) {
			this.shoePrice = shoePrice;
		}

		public String getShoeDescription() {
			return shoeDescription;
		}

		public void setShoeDescription(String shoeDescription) {
			this.shoeDescription = shoeDescription;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		// define toString
		
		@Override
		public String toString() {
			return "Shoe [id=" + id + ", shoeName=" + shoeName + ", shoePrice=" + shoePrice + ", shoeDescription="
					+ shoeDescription + ", imgUrl=" + imgUrl + "]";
		}
	
	
		
		
		
		
		
}
