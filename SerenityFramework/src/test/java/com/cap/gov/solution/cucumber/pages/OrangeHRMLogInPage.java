package com.cap.gov.solution.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHRMLogInPage extends GenericPageObject {

	
	@FindBy(id="txtUsername")
	private WebElementFacade userNameField;
	@FindBy(id="txtPassword")
	private WebElementFacade passworField;
	@FindBy(id="btnLogin")
	private WebElementFacade signInButton;
	
	
	public void openOrangeHRMLogInPage_PO(){
		open();
	}
	
	
	public void logInToOrangeHRM(){
		userNameField.sendKeys("Admin");
		passworField.sendKeys("admin");
		signInButton.click();
	}
	
}
