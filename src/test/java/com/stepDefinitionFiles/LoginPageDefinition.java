package com.stepDefinitionFiles;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjects.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageDefinition {
	
	public WebDriver driver;
	public LoginPage lp;
		
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		lp = new LoginPage(driver);		    
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
	    lp.setUserName(username);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
	   lp.clickLoginBtn();
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String title) {
	    
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title,driver.getTitle());
		}		
	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
	   
		lp.clickLogoutBtn();
		
	}
		
	@Then("Page Title Should be {string}")
	public void Page_title_should_be(String title) {
		if(driver.getPageSource().contains("Your store. Login")) {
			driver.close();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}	
		
	}

	@Then("Close browser")
	public void close_browser() {
	    driver.quit();
	}

}
