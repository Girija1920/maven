package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class login_page2 {
	
	public WebDriver driver;

	
	@FindBy(id = "location")
	private WebElement location1;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement rt;
	
	@FindBy(id = "room_nos")
	private WebElement rn;
	
	@FindBy(id = "adult_room")
	private WebElement ar;
	
	@FindBy(id = "child_room")
	private WebElement cr;
	
	@FindBy(id = "Submit")
	private WebElement sub;
	
	public WebElement getSub() {
	
		return sub;
	}

	public void setSub(WebElement sub) {
		this.sub = sub;
	}


	public WebElement getLocation1() {
		return location1;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRt() {
		return rt;
	}

	public WebElement getRn() {
		return rn;
	}

	public WebElement getAr() {
		return ar;
	}

	public WebElement getCr() {
		return cr;
	}

	public login_page2(WebDriver driver1) {
		
      this.driver = driver1;
		
		PageFactory.initElements(driver, this);
		
		//PageFactory- initialization of Page objects
		//initElements- initialize web elements
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
