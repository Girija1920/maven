package com.Maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Datadriven_Read.File_reader_manager;

public class manager_runnerclass extends baseclass{
	
	public static WebDriver driver = browserlaunch("chrome");
    
	public static POM_manager pom = new POM_manager(driver);
	

	
public static void main(String[] args) throws Throwable {
		
		
		//launchurl("https://adactinhotelapp.com/");
	
	String url = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
	
	launchurl(url);
        
		//login_page lp= new login_page(driver);
		
		passinput(pom.getInstanceLp().getUsername(), "girijavetrivel");
		
		passinput(pom.getInstanceLp().getPassword(), "Giri@2019");
		
		clickonelement(pom.getInstanceLp().getLogin());
		
//		login_page2 a = new login_page2(driver);
	
		
		dropdownValue(pom.getInstancea().getLocation1(), "Sydney");
		dropdownValue(pom.getInstancea().getHotel(),"Hotel Sunshine");
        dropdownValue(pom.getInstancea().getRt(),"Double");
	    dropdownValue(pom.getInstancea().getRn(),"2");
	    dropdownValue(pom.getInstancea().getAr(),"2");
	    dropdownValue(pom.getInstancea().getCr(),"0");
	   
	    clickonelement(pom.getInstancea().getSub());      
        
        
        
       
//		login_page3 a1 = new login_page3(driver);
	    
	    clickonelement(pom.getInstancea1().getBut());

         clickonelement(pom.getInstancea1().getCont());
 

       

       
//		login_page4 a2 = new login_page4(driver);
         
        passinput(pom.getInstancea2().getFirst(),"girija");
        passinput(pom.getInstancea2().getLastn(),"vetrivel");
        passinput(pom.getInstancea2().getAdd(),"abc nagar");
        passinput(pom.getInstancea2().getCc1(),"3742454554001261");
       
		dropdownValue(pom.getInstancea2().getCc2(),"VISA");
		dropdownVisibletext(pom.getInstancea2().getCc3(),"April");
		dropdownValue(pom.getInstancea2().getCc4(),"2022");

       passinput(pom.getInstancea2().getCc5(),"1234");
	
       clickonelement(pom.getInstancea2().getBookn());
      
       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
//		login_page5 a7 = new login_page5(driver);
       
       clickonelement(pom.getInstancea7().getLogout());
}
}