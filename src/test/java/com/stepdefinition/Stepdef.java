package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	static WebDriver driver;
	@Given("use should be in facebook login page")
	public void A() {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	}

	@When("user should enter the name and user password")
	public void B() {
	driver.findElement(By.id("email")).sendKeys("vanithamanthiribe1@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("vanitha");
	   
	}

	@When("user should select the login button")
	public void C() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should successful verify login is succcessful")
	public void D() {
	    System.out.println("verify login is sucessfully");
	}
}
