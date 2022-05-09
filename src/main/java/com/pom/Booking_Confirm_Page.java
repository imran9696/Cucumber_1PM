package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm_Page {
	
public static WebDriver driver;
	
	@FindBy(id = "logout")

	private WebElement logout;
	
    public Booking_Confirm_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
