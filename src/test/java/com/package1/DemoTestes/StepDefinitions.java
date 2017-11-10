package com.package1.DemoTestes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	WebElement RegisterLink;	
	
	

@Given("^The user is on the \"([^\"]*)\" page$")
public void the_user_is_on_the_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dínamo-TI\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

}

@When("^I click on register link$")
public void i_click_on_register_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	RegisterLink = driver.findElement(By.linkText("REGISTER"));
	RegisterLink.click();
	

}

@Then("^The register new  user page is displayed$")
public void the_register_new_user_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.quit();
	

}



}
