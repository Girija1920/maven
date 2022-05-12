package com.Maven_project;

import org.openqa.selenium.WebDriver;

public class POM_manager {
	
	//private datatype variable;
	//private Webelement refname;
	//private classname obj;
	
   public WebDriver driver;
	
	private login_page lp; //null
	private login_page2 a;
	private login_page3 a1;
    private login_page4 a2;
    private login_page5 a7;
	
	
	public POM_manager(WebDriver driver9) {
		
		this.driver = driver9;
	}

	public login_page getInstanceLp() {
		
		if(lp==null) {
		
		lp= new login_page(driver);
        
		}
		
		return lp;
	}

public login_page2 getInstancea() {
		
		if(a==null) {
		
		a= new login_page2(driver);
        
		}
		
		return a;
	
	
}
	
public login_page3 getInstancea1() {
	
	if(a1==null) {
	
	a1= new login_page3(driver);
    
	}
	
	return a1;


}	
public login_page4 getInstancea2() {
	
	if(a2==null) {
	
	a2= new login_page4(driver);
    
	}
	
	return a2;


}	
	
public login_page5 getInstancea7() {
	
	if(a7==null) {
	
	a7= new login_page5(driver);
    
	}
	
	return a7;


}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
