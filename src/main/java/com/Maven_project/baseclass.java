package com.Maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class baseclass {
	
	public static WebDriver driver;

	public static WebDriver browserlaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
 
		driver.manage().window().maximize();
		
		
		
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.geko.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		
		driver = new FirefoxDriver();
 
		driver.manage().window().maximize();
		
		
	}
		
		return driver;
		
	}	
	
	//get url
	
	public static void launchurl(String url) {
		
		driver.get(url);

	}
	
	//close
	
	public static void closebrowser() {
		
		driver.close();

	}
	
	//quit
	public static void quitbrowser() {
		
		driver.quit();

	}
	
	//sendkeys
	
	public static void passinput(WebElement element, String input) {
		
		element.sendKeys(input);

	}
	
	//click
	
	public static void clickonelement(WebElement element) {
		
		element.click();
	}

	//dropdown
	
	public static void dropdownValue(WebElement element, String value) {
		
		Select s = new Select(element);
		
		s.selectByValue(value);
		
	}
	
    public static void dropdownIndex(WebElement element, int index) {
		
		Select s = new Select(element);
		
		s.selectByIndex(index);

    }
    


   public static void dropdownVisibletext(WebElement element, String text) {
		
		Select s = new Select(element);
		
		s.selectByVisibleText(text);

	
	 	
}	
}
	
		
		

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



