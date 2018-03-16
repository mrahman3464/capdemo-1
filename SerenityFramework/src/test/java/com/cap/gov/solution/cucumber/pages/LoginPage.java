package com.cap.gov.solution.cucumber.pages;

import com.cap.gov.solution.cucumber.model.DataGenerator;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends GenericPageObject {
 
	@FindBy(id="P101_USERNAME")
	private WebElementFacade userNameField;
	@FindBy(id="P101_PASSWORD")
	private WebElementFacade passworField;
	@FindBy(id="B5698501044727837")
	private WebElementFacade signInButton;
	
	
	public void openLogInPage_PO(){
		open();
	}
	
	
//	public void performLogIn(DataGenerator dataGenerator){
//		userNameField.sendKeys(dataGenerator.getUserName());
//		passworField.sendKeys(dataGenerator.getPassword());
//		signInButton.click();
//	}
	
	public void performLogIn(){
		userNameField.sendKeys("cggs");
		passworField.sendKeys("cggs");
		signInButton.click();
	}
	
	
}
