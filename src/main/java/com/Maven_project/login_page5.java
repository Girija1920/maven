package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page5 {
	
public WebDriver driver;

	
	@FindBy(id = "logout")
	private WebElement logout;


	public login_page5(WebDriver driver9) {
		
		this.driver = driver9;
		PageFactory.initElements(driver, this);

	}


	public WebElement getLogout() {
		
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
