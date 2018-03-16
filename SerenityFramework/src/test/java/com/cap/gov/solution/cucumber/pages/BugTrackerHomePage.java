package com.cap.gov.solution.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class BugTrackerHomePage extends GenericPageObject {
	
	@FindBy(xpath="//*[@id='L1437747608131390060']/span[2]")
	private WebElementFacade current_user;
	@FindBy(id="L1437747608131390060")
	private WebElementFacade user_icon;
	@FindBy(linkText="Administration")
	private WebElementFacade administration_link;
	
	                           
	                                            
	
	
	public void click_on_admin_link() throws InterruptedException{
		
		administration_link.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	

}
