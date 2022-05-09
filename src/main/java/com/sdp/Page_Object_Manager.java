package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel_Page;
import com.pom.Booking_Confirm_Page;
import com.pom.Home_Page;
import com.pom.Search_Hotel_Page;
import com.pom.Select_Hotel_Page;

public class Page_Object_Manager {

public static WebDriver driver;
	
	private Home_Page hp;
	
	private Search_Hotel_Page fhp;
	
	private Select_Hotel_Page shp;
	
	private Book_Hotel_Page bhp;
	
	private Booking_Confirm_Page bcp;
	
	public Page_Object_Manager(WebDriver driver) {

		this.driver = driver;

	}
	
	public Home_Page getInstanceHp() {

		hp = new Home_Page(driver);

		return hp;

	}
	
	public Search_Hotel_Page getInstanceFhp() {

		fhp = new Search_Hotel_Page(driver);
		
		return fhp;
		
	}
	
	public Select_Hotel_Page getInstanceShp() {

		shp = new Select_Hotel_Page(driver);
		
		return shp;
		
	}
	
	public Book_Hotel_Page getInstanceBhp() {

		bhp = new Book_Hotel_Page(driver);
		
		return bhp;
		
	}
	
	public Booking_Confirm_Page getInstanceBcp() {

		bcp = new Booking_Confirm_Page(driver);
		
		return bcp;
		
	}

	
}
