package com.cap.gov.solution.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminPage extends GenericPageObject {

	
	@FindBy(xpath="//*[@id='t_TreeNav_10']/span")
	private WebElementFacade access_control;
	@FindBy(linkText="Users")
	private WebElementFacade user;
	@FindBy(id="B3463953788046039308")
	private WebElementFacade addUser;	
	                        	                                
//-----------------New User Info-----------------------------------------------------------------------------------------
	@FindBy(tagName="iframe")
	private WebElementFacade newUserIFrame;
	@FindBy(xpath=".//*[@id='P54_USERNAME']")
	private WebElementFacade userNameField;
	@FindBy(xpath="//*[@id='P54_ACCESS_LEVEL_ID']/label[3]")
	private WebElementFacade accesslavel;
	@FindBy(id="P54_FIRST_NAME")
	private WebElementFacade first_name;
	@FindBy(id="P54_LAST_NAME")
	private WebElementFacade lAST_NAME;
	@FindBy(id="P54_EMAIL")
	private WebElementFacade email;                                 
	@FindBy(id="P54_WORK_PHONE")
	private WebElementFacade phone;                              
	@FindBy(id="B3804644194737414592")
	private WebElementFacade addUserButton;                                 
	@FindBy(id="t_Alert_Success")
	private WebElementFacade successMessage;
	@FindBy(id="B3804644592805414592")
	private WebElementFacade closeButton; 
	
	
public void addANewUser() throws InterruptedException{
		
		access_control.click();
		Thread.sleep(5000);
		user.click();
		Thread.sleep(5000);
		addUser.click();
	}
	





public void newUserInfo() throws InterruptedException{
	    getDriver().switchTo().frame(newUserIFrame);
	     //To switch to the main frame again, you can use:
		//getDriver().switchTo().defaultContent();
	    userNameField.sendKeys("User1"); 
	    Thread.sleep(2000);
	    accesslavel.click();
	    Thread.sleep(2000);
	    first_name.sendKeys("Mike");
	    Thread.sleep(2000);
	    lAST_NAME.sendKeys("Pance");
	    Thread.sleep(2000);
	    email.sendKeys("abc@example.com");
	    Thread.sleep(2000);
	    phone.sendKeys("202550000");
	    Thread.sleep(2000);
	    closeButton.click();
}





}
