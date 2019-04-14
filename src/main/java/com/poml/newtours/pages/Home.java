package com.poml.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.poml.newtours.base.BaseTest;

public class Home extends BaseTest{

	public Home(String browserProperties) {
		super(browserProperties);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//td/font/b")
	//@FindBy(css = "table:nth-child(2) > tbody > tr > td > font > b")
	WebElement currentDate;
	
	@FindBy(css="tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td > font")
	WebElement signInObject;
	
	@FindBy(css="tr:nth-child(3) > td:nth-child(2) > font")
	WebElement tourTip;
	
	// Image objects	
	@FindBy(css="tr:nth-child(2) p > img")
	WebElement arubaImage;
	
	@FindBy(css="table:nth-child(2) tr:nth-child(1) img")
	WebElement spcialsTable;
	
	@FindBy(css="table:nth-child(2) tr:nth-child(1) img")
	WebElement tourTipsTable;
	
	@FindBy(css="form tr:nth-child(3) > td:nth-child(1) > img")
	WebElement findAFlightTable;
	
	@FindBy(css="table:nth-child(3) > tbody > tr:nth-child(5) > td:nth-child(1) > img")
	WebElement destinationsTable;
	
	@FindBy(css="tr:nth-child(7) > td:nth-child(1) > img")
	WebElement vacationsTable;
	
	@FindBy (css="tr:nth-child(9) > td:nth-child(1) > img")
	WebElement registerTable;
	
	@FindBy(css="tr:nth-child(11) > td:nth-child(1) > img")
	WebElement linksTable;
	
	//Link objects
	//@FindBy(linkText="Home")
	//@FindBy(css = ".mouseOver a")
	//@FindBy(xpath="//a[contains(text(),'Home')]")
	@FindBy(xpath="//a[contains(@href, 'mercurywelcome.php')]")
	WebElement homeLink;
	
	@FindBy(linkText="Flights")
	WebElement flightsLink;
	
	@FindBy(linkText="Hotels")
	WebElement hotelsLink;
	
	@FindBy(linkText="Car Rentals")
	WebElement carRentalsLink;
	
	@FindBy(linkText="Cruises")
	WebElement cruisesLink;
	
	@FindBy(linkText="Destinations")
	WebElement destinationsLink;
	
	@FindBy(linkText="Vacations")
	WebElement vacationsLink;	
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public String getCurrentDate() {
		sleep(2000);
		return this.currentDate.getText();
	}
	
	public String getArubaImage() {
		sleep(2000);
		return this.arubaImage.getText();
	}
	
	public Home clickOnHomeLink(String browserProperties) {
		sleep(2000);
		this.homeLink.click();
		return new Home(browserProperties);
	}
	
	public FindAFlight clickOnFlightsLink(String browserProperties) {
		this.flightsLink.click();
		return new FindAFlight(browserProperties);
	}
	
	public CarRentals clickOnCarRentalsLink(String browserProperties) {
		carRentalsLink.click();
		return new CarRentals(browserProperties);
	}
	
	public Cruises clickOnCruisesLink(String browserProperties) {
		cruisesLink.click();
		return new Cruises(browserProperties);
	}
	
	public Destinations clickOnDestinations(String browserProperties) {
		destinationsLink.click();
		return new Destinations(browserProperties);
	}
	
	public Vacations clickOnVacations(String browserProperties) {
		vacationsLink.click();
		return new Vacations(browserProperties);
	}
	
	

}
