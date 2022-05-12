package com.Maven_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class runner_class extends baseclass{
	
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		
		
		launchurl("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		passinput(username,"girijavetrivel");
		
		
		WebElement pass = driver.findElement(By.id("password"));

		passinput(pass,"Giri@2019");
		
		WebElement login = driver.findElement(By.id("login"));
		
		clickonelement(login);
       
		WebElement loc = driver.findElement(By.id("location"));

		dropdownValue(loc, "Sydney");
		
		WebElement ht = driver.findElement(By.id("hotels"));
       
		dropdownValue(ht, "Hotel Sunshine");
		
		WebElement rt = driver.findElement(By.id("room_type"));

		dropdownValue(rt, "Double");
		
		WebElement rn = driver.findElement(By.id("room_nos"));

       dropdownValue(rn, "2");
       
		WebElement ar = driver.findElement(By.id("adult_room"));
        
		dropdownValue(ar, "2");
		
		WebElement cr = driver.findElement(By.id("child_room"));
       
		dropdownValue(cr, "0");
		
		WebElement sb = driver.findElement(By.id("Submit"));
		
		clickonelement(sb);
		
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		
		clickonelement(button);
		
		WebElement click = driver.findElement(By.id("continue"));
		
		clickonelement(click);
		
		WebElement fn = driver.findElement(By.id("first_name"));
		
		passinput(fn, "girija");
		
		WebElement ln = driver.findElement(By.id("last_name"));
		
		passinput(ln, "vetrivel");
		
		WebElement add = driver.findElement(By.id("address"));
		
		passinput(add, "abc nagar");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		
		passinput(cc, "3742454554001261");
		
        WebElement ct = driver.findElement(By.id("cc_type"));
        dropdownValue(ct, "VISA");
        
        WebElement et = driver.findElement(By.id("cc_exp_month"));
        dropdownVisibletext(et, "April");
        
        WebElement ey = driver.findElement(By.id("cc_exp_year"));
        dropdownValue(ey, "2022");
        
        WebElement last = driver.findElement(By.id("cc_cvv"));
        passinput(last, "1234");
        
        WebElement bn = driver.findElement(By.id("book_now"));
        clickonelement(bn);
        
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        
        WebElement logout = driver.findElement(By.id("logout"));
        clickonelement(logout);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
