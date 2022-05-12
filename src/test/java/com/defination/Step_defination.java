package com.defination;

import com.Maven_project.POM_manager;
import com.Maven_project.baseclass;

import Datadriven_Read.File_reader_manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination extends baseclass{
	
	public static POM_manager pom = new POM_manager(driver);
	
	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
		
		String url = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
		
		launchurl(url);
	}
	

	
	@When("^enter the \"([^\"]*)\" in username field$")
	public void enter_the_in_username_field(String username) throws Throwable {
		
		passinput(pom.getInstanceLp().getUsername(), username);

	}

	@When("^enter the \"([^\"]*)\" in pass field$")
	public void enter_the_in_pass_field(String password) throws Throwable {
		
		passinput(pom.getInstanceLp().getPassword(), password);

	}

	@Then("^login button$")
	public void login_button() throws Throwable {
		
		clickonelement(pom.getInstanceLp().getLogin());

	}

}
