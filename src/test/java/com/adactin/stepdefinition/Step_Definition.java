package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.New_Base_Class;
import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.Runner_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends New_Base_Class {
	
	public static WebDriver driver = Runner_Class.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		getUrl(url);
	    
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	   
		inputValueElement(pom.getInstanceHp().getUsername(), "imran9696");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceHp().getPass(), "123456789");
		
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	    
		clickOnElement(pom.getInstanceHp().getLogin_Button());
		
	}
	
	@When("^user Select Location In Location Field$")
	public void user_Select_Location_In_Location_Field() throws Throwable {
	    
		dropDown(pom.getInstanceFhp().getLocation(), "byValue", "Sydney");	
	}

	@When("^user Slect Hotel In Hotel Field$")
	public void user_Slect_Hotel_In_Hotel_Field() throws Throwable {
	 
		dropDown(pom.getInstanceFhp().getHotel(), "byVisibleText", "Hotel Sunshine");
		
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
	    
		dropDown(pom.getInstanceFhp().getRoom_Type(), "byValue", "Deluxe");
		
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
	    
		dropDown(pom.getInstanceFhp().getNumer_Of_Rooms(), "byValue", "2");
		
	}

	@When("^user Enter The Date Check In Date Field$")
	public void user_Enter_The_Date_Check_In_Date_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceFhp().getCheck_In(), "05/05/2022");
		
	}

	@When("^user Enter The Date Check Out Date Field$")
	public void user_Enter_The_Date_Check_Out_Date_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceFhp().getCheck_Out(), "06/05/2022");
		
	}

	@When("^user Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
		
		dropDown(pom.getInstanceFhp().getAdult_Per_Room(), "byValue", "2");
		
	}

	@When("^user Select Children Per Room$")
	public void user_Select_Children_Per_Room() throws Throwable {
		
		dropDown(pom.getInstanceFhp().getChildren_Per_Room(), "byValue", "0");
	    
	}

	@Then("^user Click Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		
		clickOnElement(pom.getInstanceFhp().getSearch());
	    
	}

	@When("^user Select Hotel By Click The Radio Button$")
	public void user_Select_Hotel_By_Click_The_Radio_Button() throws Throwable {
	    
		clickOnElement(pom.getInstanceShp().getSelect());
		
	}

	@Then("^user Click Continue Button And It Navigates To Book Hotel Page$")
	public void user_Click_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
	   
		clickOnElement(pom.getInstanceShp().getContinues());
		
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceBhp().getFname(), "Mohamed");
		
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceBhp().getLname(), "Imran");
		
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceBhp().getBilling_Add(), "123, Abc Street Sydney-12345");
		
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceBhp().getCredit_Card(), "6418923746509601");
		
	}

	@When("^user Select Credit Card Type$")
	public void user_Select_Credit_Card_Type() throws Throwable {
	   
		dropDown(pom.getInstanceBhp().getCredit_Type(), "byValue", "AMEX");
		
	}

	@When("^user Select Expiry Month In Expiry Date Field$")
	public void user_Select_Expiry_Month_In_Expiry_Date_Field() throws Throwable {
	    
		dropDown(pom.getInstanceBhp().getExpiry_Month(), "byValue", "9");
		
	}

	@When("^user Select Expiry Year In Expiry Date Field$")
	public void user_Select_Expiry_Year_In_Expiry_Date_Field() throws Throwable {
	    
		dropDown(pom.getInstanceBhp().getExpiry_Year(), "byValue", "2022");
		
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
	    
		inputValueElement(pom.getInstanceBhp().getCvv(), "581");
		
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Confirm Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirm_Page() throws Throwable {
	   
		clickOnElement(pom.getInstanceBhp().getBook_Now());
		
	}
	
	@Then("^user Click Logout Button And It Successfully Logged Out$")
	public void user_Click_Logout_Button_And_It_Successfully_Logged_Out() throws Throwable {
	    
		implicitlyWaitMethod(30);
		clickOnElement(pom.getInstanceBcp().getLogout());
		
	}

}
