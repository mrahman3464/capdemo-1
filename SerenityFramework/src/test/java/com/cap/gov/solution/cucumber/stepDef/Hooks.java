package com.cap.gov.solution.cucumber.stepDef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.serenitybdd.core.Serenity;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks extends GenericDeclarationClass{

	@Before
	public void beforeTest(Scenario scenario) throws FileNotFoundException, IOException{
		for(String s:scenario.getSourceTagNames()){
			System.out.println("Tag:" +s);
		}
		
		prop=new Properties();
		prop.load(new FileInputStream(Configpath));
		
		FirefoxProfile myprofile=new ProfilesIni().getProfile("default");
		Serenity.useFirefoxProfile(myprofile);
		
	}
}
