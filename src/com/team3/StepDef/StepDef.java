package com.team3.StepDef;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.team3.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();  
    
	@Given("^open chrome browser and enter URL$")
	public void open_chrome_browser_and_enter_url() throws Throwable 
	{
	  
		Properties properties=obj.getProperty();   
		 
		System.setProperty("webdriver.chrome.driver", "C:\\capstone\\Team3_capstone\\Driver\\CHROME\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();			
		//driver.get(properties.getProperty("browser.baseURL"));
		driver.get("http://uitestingplayground.com/");
		Thread.sleep(3000);	 	   
	}

	@When("^opens website$")
	public void get_title() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate title$")
	public void validate_title() throws Throwable 
	{
		String expectedtitle = "UI Test Automation Playground";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals(" UI Test automation  play ground page is not available", expectedtitle, actualtitle);
	}

	
	
	@Given("^click on dynamic id$")
	public void click_dynamic() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[1]/h3/a")).click();
	}

	@When("^opens page$")
	public void open_page() throws Throwable 
	{
		 driver.getTitle();
	
	}

	@Then("^validate page title$")
	public void validate_page_title() throws Throwable 
	{
		String expectedtitle = "Dynamic ID";
	  	String actualtitle= driver.getTitle();
	  	
	  	Assert.assertEquals("Dynamic ID page  is not available", expectedtitle, actualtitle);
	  	driver.navigate().back();
	}

	
	@Given("^click on ClassAttribute$")
	public void click_classattribute() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/h3/a")).click();
	}

	@When("^opens page ClassAttribute$")
	public void open_page_classattribute() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate page title of ClassAttribute and button$")
	public void validate_page_title_classattribute() throws Throwable 
	{
		String expectedtitle = "Class Attribute";
	  	String actualtitle= driver.getTitle();
		Assert.assertEquals("Class Attribute page is not availble", expectedtitle, actualtitle);
		driver.findElement(By.className("btn-primary")).click();
		driver.switchTo().alert().accept();
	  	driver.navigate().back();
	}
	
	@Given("^click on HiddenLayer$")
	public void click_hiddenlayer() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[3]/h3/a")).click();
	}

	@When("^opens page HiddenLayer$")
	public void open_page_hiddenlayer() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^validate page title of HiddenLayer and button testing$")
	public void validate_page_title_hiddenlayer() throws Throwable 
	{
		String expectedtitle = "Hidden Layers";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals("Hidden Layers page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-success")).click();
	   	driver.navigate().back();
	}


	@Given("^click on LoadDelay$")
	public void click_localdelay() throws Throwable 
	{
	  
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[4]/h3/a")).click();
		Thread.sleep(3000);	
	}

	@When("^opens page LoadDelay$")
	public void open_page_loaddelayr() throws Throwable 
	{
		 driver.getTitle();
	}

	@Then("^test the button after delay$")
	public void test_the_delay() throws Throwable 
	{
		String expectedtitle = "Load Delays";
	  	String actualtitle= driver.getTitle();
	  	Assert.assertEquals(" Load Delays page  is not avilable", expectedtitle, actualtitle);
	  	driver.findElement(By.className("btn-primary")).click();
	  	driver.navigate().back();
	}

}
