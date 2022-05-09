package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public static WebDriver driver;

	@FindBy(id = "username")

	private WebElement username;

	@FindBy(id = "password")

	private WebElement pass;

	@FindBy(id = "login")

	private WebElement login_Button;

    public Home_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}


}
