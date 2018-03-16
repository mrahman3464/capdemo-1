package com.cap.gov.solution.cucumber.stepDef;

import com.cap.gov.solution.cucumber.model.DataGenerator;
import com.cap.gov.solution.cucumber.pages.LoginPage;
import com.cap.gov.solution.cucumber.pages.WebAppHomePage;
import com.cap.gov.solution.cucumber.steps.LoginTestSteps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebSheetStepDef extends GenericDeclarationClass {

	DataGenerator dataGenerator=new DataGenerator();
	@Steps
	LoginTestSteps loginTestSteps;
	LoginPage loginPage;
	WebAppHomePage webAppHomePage;
	@Given("^User navigate to Simple Web Sheet Login Page$")
	public void user_navigate_to_Simple_Web_Sheet_Login_Page() throws Throwable {
		loginTestSteps.openLogInPage();
		
	}

//	@When("^User Sing In with Valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
//	public void user_Sing_In_with_Valid_and_valid(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new PendingException();
//		dataGenerator.setAll(arg1,arg2);
//	}
	
	@When("^User Sing In with Valid user name and valid password$")
	public void user_Sing_In_with_Valid__valid() throws Throwable {
	  
		loginPage.performLogIn();
	}

	@Then("^User do some administrative work on Dashbord$")
	public void user_do_some_administrative_work_on_Dashbord() throws Throwable {
		webAppHomePage.dashbordAdmin();
	}
	
	
	
	
}
