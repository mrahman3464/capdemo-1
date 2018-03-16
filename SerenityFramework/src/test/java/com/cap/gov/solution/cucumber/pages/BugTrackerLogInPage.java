package com.cap.gov.solution.cucumber.pages;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BugTrackerLogInPage extends GenericPageObject {

	//"http://apex.oracletool.com:4565/apex/f?p=101:1"
	@FindBy(id="P101_USERNAME")
	private WebElementFacade userNameField;
	@FindBy(id="P101_PASSWORD")
	private WebElementFacade passworField;
	@FindBy(id="B4337572105263491706")
	private WebElementFacade signInButton;
	
	
	
	
	
	
	
	public void openLogInPage(){
		getDriver().get("http://apex.oracletool.com:4565/apex/f?p=101:1");
		getDriver().manage().window().maximize();;
	}
	
	
	
	public void performLogIn(){
		userNameField.sendKeys("cggs");
		passworField.sendKeys("cggs");
		signInButton.click();
	}
	
	  //element(:closeSuccessMessage) {|b| b.button(title:"Close Notification")}
	

	@FindBy(using="Close Notification")
	private WebElementFacade closeSuccessMessage;
	@FindBy(id="L1437747608131390060")
	private WebElementFacade loggedInUserIcon;
	@FindBy(id="menu_L1437747608131390060_4i")
	private WebElementFacade signOutLink;
	
	
	public void signOut(){
		  //closeSuccessMessage.click();
		  loggedInUserIcon.click();
		  signOutLink.click();
	}
	

	
	
	
	
}
