package com.cap.gov.solution.cucumber.steps;

import com.cap.gov.solution.cucumber.model.DataGenerator;
import com.cap.gov.solution.cucumber.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestSteps extends ScenarioSteps {

	LoginPage loginPage;
	@Step
	public void openLogInPage(){
		loginPage.openLogInPage_PO();
	}
//	public void performLogIn(DataGenerator dataGenerator) {
//		// TODO Auto-generated method stub
//		//loginPage.performLogIn(dataGenerator);
//	}
	
	public void performLogIn() {
		// TODO Auto-generated method stub
		loginPage.performLogIn();
	}
	
}
