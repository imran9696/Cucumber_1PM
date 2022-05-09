package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")

	private WebElement select;
	
	@FindBy(id = "continue")

	private WebElement continues;
	
    public Select_Hotel_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinues() {
		return continues;
	}


}
