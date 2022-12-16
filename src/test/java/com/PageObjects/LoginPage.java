package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(id = "Email")
	WebElement txtUserName;
	
	@FindBy(id = "Password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement logoutBtn;
	
	
	public void setUserName(String username) {
		txtUserName.clear();
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}
	

}
