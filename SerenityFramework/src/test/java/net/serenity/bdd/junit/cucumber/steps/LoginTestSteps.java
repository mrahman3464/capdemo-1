package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.DataGenerator;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
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
