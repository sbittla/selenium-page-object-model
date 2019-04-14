package com.poml.tests.newtours;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.poml.newtours.pages.FindAFlight;
//import com.poml.newtours.base.BaseTest;
import com.poml.newtours.pages.Home;

public class HomeTest extends Home{

	Home ht;
	String browserProperties = "firefox_mac64.properties";
	public HomeTest() {		
		super("firefox_mac64.properties");
	}

	@BeforeMethod
	public void setUp() {
		initialization();	
		ht = new Home(browserProperties);
	}
	
	@Test(priority=1)
	public void verifyPageTitle() {
		Assert.assertEquals("Welcome: Mercury Tours", ht.getHomePageTitle());		
	}
	
	@Test(priority=1)
	public void verifyCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		Date date = new Date();
		String strDate = String.valueOf(dateFormat.format(date));
		System.out.println("The current date is : "+ strDate);
		Assert.assertEquals(strDate, ht.getCurrentDate());
	}
	
	@Test(priority=1)
	public void verifyArubaImage() {
		System.out.println("The Aruba Image caption is : "+ ht.getArubaImage());
		Assert.assertEquals("", ht.getArubaImage());
		//Featured Destination: Aruba
	}
	
	@Test(priority=1)
	public void verifyClickOnHomeLink() {
		Home hm = ht.clickOnHomeLink(browserProperties);
		//hm.initialization();
		Assert.assertEquals("Welcome: Mercury Tours", hm.getHomePageTitle());
	}
	
	@Test(priority=1)
	public void verifyClickOnFlightsLink() {
		FindAFlight ff = ht.clickOnFlightsLink(browserProperties);
		//hm.initialization();
		Assert.assertEquals("Welcome: Mercury Tours", ff.getHomePageTitle());
	}	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
