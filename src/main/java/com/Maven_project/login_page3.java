package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page3 {
	
	public WebDriver driver;

	
	@FindBy(id = "radiobutton_0")
	private WebElement but;
	
	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getCont() {
		return cont;
	}

	

	public WebDriver getDriver() {
		return driver;
	}

	public login_page3(WebDriver driver4) {
		
        this.driver = driver4;
		
		PageFactory.initElements(driver, this);

	
	}

	public WebElement getBut() {
		return but;
	}
	
	
	
	
	
	
	
	

}
