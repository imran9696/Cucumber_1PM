package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")

	private WebElement fname;

	@FindBy(xpath = "//input[@name='last_name']")

	private WebElement lname;

	@FindBy(id = "address")

	private WebElement billing_Add;

	@FindBy(xpath = "//input[@name='cc_num']")

	private WebElement credit_Card;

	@FindBy(xpath = "//select[@name='cc_type']")

	private WebElement credit_Type;

	@FindBy(xpath = "//select[@name='cc_exp_month']")

	private WebElement expiry_Month;

	@FindBy(xpath = "//select[@name='cc_exp_year']")

	private WebElement expiry_Year;

	@FindBy(xpath = "//input[@name='cc_cvv']")

	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")

	private WebElement book_Now;

	public Book_Hotel_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilling_Add() {
		return billing_Add;
	}

	public WebElement getCredit_Card() {
		return credit_Card;
	}

	public WebElement getCredit_Type() {
		return credit_Type;
	}

	public WebElement getExpiry_Month() {
		return expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return expiry_Year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}

}
