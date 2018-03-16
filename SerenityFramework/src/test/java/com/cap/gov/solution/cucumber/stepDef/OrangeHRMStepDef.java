package com.cap.gov.solution.cucumber.stepDef;

import com.cap.gov.solution.cucumber.pages.OrangeHRMHomePage;
import com.cap.gov.solution.cucumber.pages.OrangeHRMLogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMStepDef extends GenericDeclarationClass {

	OrangeHRMLogInPage orangeHRMLogInPage;
	OrangeHRMHomePage orangeHRMHomePage;
	
	@Given("^User Navigate to the OrangeHRM login Page$")
	public void user_Navigate_to_the_OrangeHRM_login_Page() throws Throwable {
		orangeHRMLogInPage.openOrangeHRMLogInPage_PO();
	}

	@When("^User Login to the Application$")
	public void user_Login_to_the_Application() throws Throwable {
		orangeHRMLogInPage.logInToOrangeHRM();
	}

	@Then("^User Should be able to perform Multiple Task$")
	public void user_Should_be_able_to_perform_Multiple_Task() throws Throwable {
		orangeHRMHomePage.searchUser("john.smith");
	}
	
	
}
