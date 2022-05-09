package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.New_Base_Class;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com/adactin//feature",
glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
plugin = {"html:Report/Cucumber_Html_Report",
		"pretty",
		"json:Report/Cucumber.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"		
})
public class Runner_Class {
	
	public static WebDriver driver; // --> null
	
	@BeforeClass
	public static void setUp() throws IOException {

		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		driver = New_Base_Class.getBrowser(browser);
		
	}
	
	@AfterClass
	public static void tearDown() {

		driver = New_Base_Class.close();
	}

}
