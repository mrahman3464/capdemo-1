package com.cap.gov.solution.cucumber;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",plugin={"pretty","html:target/cucumber","json:target/json/cucumber.json"})
public class Runner {

	
	
	
}
