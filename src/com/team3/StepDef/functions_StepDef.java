package com.team3.StepDef;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.team3.Utility.PropertiesFileReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class functions_StepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^open sample app$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
	  
		Properties properties=obj.getProperty();   
		 
		System.setProperty("webdriver.chrome.driver", "C:\\capstone\\Team3_capstone\\Driver\\CHROME\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();			
		//driver.get(properties.getProperty("browser.baseURL"));
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div[2]/h3/a")).click();
	}

	@And("^enter user name and password$")
	public void fill_details() throws Throwable 
	{
		driver.findElement(By.name("UserName")).sendKeys("XYZ",Keys.ENTER);	
	}
	
	@And("^click on login$")
	public void login() throws Throwable 
	{
		driver.findElement(By.id("login")).click();

	}


	@Then("^check response$")
	public void validate_user() throws Throwable 
	{
		String expectedtitle = "Invalid username/password";
     	String actualtitle= driver.findElement(By.xpath("/html/body/section/div/div[1]/div/label")).getText();
     	Assert.assertEquals(" sample app is not avilable", expectedtitle, actualtitle);
	}


}
