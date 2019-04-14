package com.poml.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.poml.newtours.base.BaseTest;

public class Login extends BaseTest{	
	//initialize the page objects
	public Login(String browserProperties) {
		super(browserProperties);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}

	
	public void validateLogin() {
		String uname = prp.getProperty("username");
		String pwd = prp.getProperty("password");
		sleep(3000);
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
}
