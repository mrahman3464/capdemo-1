package com.cap.gov.solution.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class OrangeHRMHomePage extends GenericPageObject {

	@FindBy(id="menu_admin_viewAdminModule")
	private WebElementFacade adminLink;
	@FindBy(id="searchSystemUser_userName")
	private WebElementFacade useNameField;
	@FindBy(id="searchBtn")
	private WebElementFacade searchButton;
	
	
	public void searchUser(String username){
		adminLink.click();
		useNameField.sendKeys(username);
		searchButton.click();
	}
	
	
}
