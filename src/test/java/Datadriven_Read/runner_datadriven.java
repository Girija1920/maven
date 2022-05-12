package Datadriven_Read;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Maven_project.POM_manager;
import com.Maven_project.baseclass;

public class runner_datadriven extends baseclass{
	
    public static WebDriver driver = browserlaunch("chrome");
    
	public static POM_manager pom = new POM_manager(driver);
	
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
		
		launchurl(url);
		
		String username = File_reader_manager.getInstanceFRM().getInstanceCR().getusername();
		 passinput(pom.getInstanceLp().getUsername(), username);
		
		 String password = File_reader_manager.getInstanceFRM().getInstanceCR().getpassword();
		 passinput(pom.getInstanceLp().getPassword(), password);
		 
		 clickonelement(pom.getInstanceLp().getLogin());
		
		 dropdownValue(pom.getInstancea().getLocation1(), "Sydney");
			dropdownValue(pom.getInstancea().getHotel(),"Hotel Sunshine");
	        dropdownValue(pom.getInstancea().getRt(),"Double");
		    dropdownValue(pom.getInstancea().getRn(),"2");
		    dropdownValue(pom.getInstancea().getAr(),"2");
		    dropdownValue(pom.getInstancea().getCr(),"0");
		   
		    clickonelement(pom.getInstancea().getSub());      
	        
		    
		    clickonelement(pom.getInstancea1().getBut());

	         clickonelement(pom.getInstancea1().getCont());
	 
	         
	         String firstname = File_reader_manager.getInstanceFRM().getInstanceCR().getfirstname();
	         passinput(pom.getInstancea2().getFirst(), firstname);
		    
	         String lastname = File_reader_manager.getInstanceFRM().getInstanceCR().getlastname();
	         passinput(pom.getInstancea2().getLastn(), lastname);
		
	         String add = File_reader_manager.getInstanceFRM().getInstanceCR().getadd();
	         passinput(pom.getInstancea2().getAdd(), add);
		
	         String cc = File_reader_manager.getInstanceFRM().getInstanceCR().getcc();
	         passinput(pom.getInstancea2().getCc1(), cc);
	         
	         dropdownValue(pom.getInstancea2().getCc2(),"VISA");
	 		dropdownVisibletext(pom.getInstancea2().getCc3(),"April");
	 		dropdownValue(pom.getInstancea2().getCc4(),"2022");
            
	 		String cvv = File_reader_manager.getInstanceFRM().getInstanceCR().getcc();
	        passinput(pom.getInstancea2().getCc5(), cvv);
	        
	        clickonelement(pom.getInstancea2().getBookn());
	        
	        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	 		
	        clickonelement(pom.getInstancea7().getLogout());

	         

	 		
		
		
		
		
	}
	
	
	
	

}
