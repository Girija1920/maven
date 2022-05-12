package com.Maven_project;

import java.util.concurrent.TimeUnit;

public class runner_loginpage extends baseclass{
	
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		
		launchurl("https://adactinhotelapp.com/");
        
		login_page lp= new login_page(driver);
		
		passinput(lp.getUsername(), "girijavetrivel");
		
		passinput(lp.getPassword(), "Giri@2019");
		
		clickonelement(lp.getLogin());
		
		login_page2 a = new login_page2(driver);
		
        dropdownValue(a.getLocation1(), "Sydney");	
	
        dropdownValue(a.getRt(), "Double");
        
        dropdownValue(a.getRn(), "2");

        dropdownValue(a.getAr(), "2");

        dropdownValue(a.getCr(), "0");
        
        a.getSub().click();
        
		login_page3 a1 = new login_page3(driver);

        a1.getBut();
        
		clickonelement(a1.getBut());

        a1.getCont();
        
		clickonelement(a1.getCont());

        
		login_page4 a2 = new login_page4(driver);
		
		passinput(a2.getFirst(), "girija");
		 
		passinput(a2.getLastn(), "vetrivel");
        
		passinput(a2.getAdd(), "abc nagar");

		passinput(a2.getCc1(), "3742454554001261");
		
		
        dropdownValue(a2.getCc2(), "VISA");	

        dropdownVisibletext(a2.getCc3(), "April");	

        dropdownValue(a2.getCc4(), "2022");	

	    passinput(a2.getCc5(), "1234");
		
		a2.getBookn();
		clickonelement(a2.getBookn());

		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		login_page5 a7 = new login_page5(driver);
		
		a7.getLogout();
		clickonelement(a7.getLogout());


		
		
		
		

		
		

        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
