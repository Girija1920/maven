package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_project.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.defination",
                 plugin = {"html:Report"})

public class Test_runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = baseclass.browserlaunch("chrome");
		
	}
	@AfterClass
	public void tear_down() {
      baseclass.closebrowser();
      
	}
	

}
