package com.poml.newtours.pages;

import com.poml.newtours.base.BaseTest;

public class CarRentals extends BaseTest {

	public CarRentals(String browserProperties) {
		super(browserProperties);
		// TODO Auto-generated constructor stub
	}

	public String getHomePageTitle(){
		return driver.getTitle();
	}
}
