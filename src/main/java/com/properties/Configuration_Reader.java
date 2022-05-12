package com.properties;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\vgirija\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\properties\\Adactin.properties");
		 
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
	    
		p.load(fis);
	}
		
	public String geturl() {
		
		String url = p.getProperty("url");
		
		return url;
		
		

	}	
   
    public String getusername() {
		
		String username = p.getProperty("username");
		
		return username;
	
	
	
	}
    public String getpassword() {
		
		String password = p.getProperty("password");
		
		return password;
	
    
    
}
    
    public String getfirstname() {
    	
    	String firstname = p.getProperty("firstname");
    	return firstname;

	}
   public String getlastname() {
    	
    	String lastname = p.getProperty("lastname");
    	return lastname;

	}

     public String getadd() {
	
	String add = p.getProperty("address");
	return add;

}
     public String getcc() {
 	
	String cc = p.getProperty("ccnum");
	return cc;

}
     
     public String getcvv() {
    	 	
    		String cvv = p.getProperty("ccnum");
    		return cvv;
}	

}
	


	
 

