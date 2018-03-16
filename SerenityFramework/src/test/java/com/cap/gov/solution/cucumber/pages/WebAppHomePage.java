package com.cap.gov.solution.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class WebAppHomePage extends GenericPageObject{

	@FindBy(xpath="//*[@id='websheets_menubar_4']/span/span")
	private WebElementFacade admin;
	@FindBy(id="websheets_menubar_4_0i")
	private WebElementFacade dashbord;
	@FindBy(id="P1_TIMEFRAME")
	private WebElementFacade timeframe;
	@FindBy(linkText="Reset")
	private WebElementFacade resetButtom;
	@FindBy(xpath="//*[@id='wwvFlowForm']/div[2]/div[2]/div[2]/div[1]/div[2]/h2/a/img")
	private WebElementFacade applicationDetails;
	
	@FindBy(xpath="//*[@id='wwvFlowForm']/div[2]/div[2]/div[2]/div[1]/div[3]/h2/a/img")
	private WebElementFacade recentChanges;
	@FindBy(xpath="//*[@id='wwvFlowForm']/div[2]/div[2]/div[2]/div[1]/div[4]/h2/a/img")
	private WebElementFacade topUser;
	@FindBy(xpath="//*[@id='wwvFlowForm']/div[2]/div[2]/div[2]/div[1]/div[5]/h2/a/img")
	private WebElementFacade topPage;
	  
	  
	 
	 public void dashbordAdmin(){
	    admin.click();
	    dashbord.click();
	    timeframe.selectByValue("30 minutes");
	    resetButtom.click();
	    applicationDetails.click();
	    recentChanges.click();
	    topUser.click();
	    topPage.click();
	    admin.click();
	 }
	
	
}
