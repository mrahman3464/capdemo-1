package com.cap.gov.solution.cucumber.pages;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class SeleniumGrid {

	
	public void grid() throws MalformedURLException{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("version","");
		cap.setPlatform(Platform.UNIX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://54.144.57.103:4446/wd/hub"),cap);
		driver.get("www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}
	
	
	public void grid1() throws MalformedURLException{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("version","");
		cap.setPlatform(Platform.UNIX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://54.144.57.103:4446/wd/hub"),cap);
		driver.get("www.yahoo.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
}
