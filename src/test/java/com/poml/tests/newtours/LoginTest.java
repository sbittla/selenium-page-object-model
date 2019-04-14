package com.poml.tests.newtours;

//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.poml.newtours.base.BaseTest;
//import com.poml.newtours.pages.Home;
import com.poml.newtours.pages.Login;

public class LoginTest extends Login{

	//LoginTest ln;
	String browserProperties = "firefox_mac64.properties";
	Login ln;
	public LoginTest() {		
		super("firefox_mac64.properties");
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		ln = new Login(browserProperties);
		//ln.initialization();		
	}
	
	@Test(priority=1)
	public void verifyPageTitle() {
		Assert.assertEquals("Welcome: Mercury Tours", ln.getHomePageTitle());
	}
	
	@Test(priority=1)
	public void testLogin() {
		ln.validateLogin();
		//Assert.assertEquals("Welcome: Mercury Tours", getHomePageTitle());
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
