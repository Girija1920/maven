package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class login_page4 {
	
public WebDriver driver;

	
	@FindBy(id = "first_name")
	private WebElement first;
	
	@FindBy(id = "last_name")
	private WebElement lastn;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id = "cc_num")
	private WebElement cc1;
	
	@FindBy(id = "cc_type")
	private WebElement cc2;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cc3;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cc4;
	
	@FindBy(id = "cc_cvv")
	private WebElement cc5;
	
	@FindBy(id = "book_now")
	private WebElement bookn;
	
	
	public login_page4(WebDriver driver6) {
		this.driver = driver6;
		
		PageFactory.initElements(driver, this);

		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLastn() {
		return lastn;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc1() {
		return cc1;
	}

	public WebElement getCc2() {
	
		return cc2;
	}

	public WebElement getCc3() {
		
		return cc3;
	}

	public WebElement getCc4() {
		
		return cc4;
	}

	public WebElement getCc5() {
		return cc5;
	}

	public WebElement getBookn() {
		return bookn;
	}

	
	
	
	
	
	
	
	

}
