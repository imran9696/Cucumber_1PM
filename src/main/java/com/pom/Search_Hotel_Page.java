package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public static WebDriver driver;

	@FindBy(id = "location")

	private WebElement location;

	@FindBy(id = "hotels")

	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")

	private WebElement room_Type;

	@FindBy(xpath = "//select[@name='room_nos']")

	private WebElement numer_Of_Rooms;

	@FindBy(xpath = "//input[@name='datepick_in']")

	private WebElement check_In;

	@FindBy(xpath = "//input[@name='datepick_out']")

	private WebElement check_Out;

	@FindBy(xpath = "//select[@name='adult_room']")

	private WebElement adult_Per_Room;

	@FindBy(xpath = "//select[@name='child_room']")

	private WebElement children_Per_Room;

	@FindBy(id = "Submit")

	private WebElement search;

     public Search_Hotel_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNumer_Of_Rooms() {
		return numer_Of_Rooms;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult_Per_Room() {
		return adult_Per_Room;
	}

	public WebElement getChildren_Per_Room() {
		return children_Per_Room;
	}

	public WebElement getSearch() {
		return search;
	}


}
