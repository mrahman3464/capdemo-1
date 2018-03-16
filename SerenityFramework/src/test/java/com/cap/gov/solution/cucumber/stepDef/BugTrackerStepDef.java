package com.cap.gov.solution.cucumber.stepDef;

import com.cap.gov.solution.cucumber.pages.AdminPage;
import com.cap.gov.solution.cucumber.pages.BugTrackerHomePage;
import com.cap.gov.solution.cucumber.pages.BugTrackerLogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BugTrackerStepDef extends GenericDeclarationClass{
	BugTrackerLogInPage bugTrackerLogInPage;
	BugTrackerHomePage bugTrackerHomePage;
	AdminPage adminPage;
	
	@Given("^User navigate to Bug Tracker App Login Page$")
	public void user_navigate_to_Bug_Tracker_App_Login_Page() throws Throwable {
		bugTrackerLogInPage.openLogInPage();
	}

	@When("^User Sing In to Bug tracker with Valid Credentials$")
	public void user_Sing_In_to_Bug_tracker_with_Valid_Credentials() throws Throwable {
		bugTrackerLogInPage.performLogIn();
	}

	@Given("^User is logged in to the Bug Tracker Application As an Admin$")
	public void user_is_logged_in_to_the_Bug_Tracker_Application_As_an_Admin() throws Throwable {
		bugTrackerHomePage.click_on_admin_link();
	}

	@When("^Admin Add A New User$")
	public void admin_Add_A_New_User() throws Throwable {
		adminPage.addANewUser();
		adminPage.newUserInfo();
		
	}

	@Then("^a successful message will be displayed$")
	public void a_successful_message_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^Admin Logout form his account$")
	public void admin_Logout_form_his_account() throws Throwable {
		bugTrackerLogInPage.signOut();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
