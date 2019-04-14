package com.poml.newtours.pages;

import com.poml.newtours.base.BaseTest;

public class Vacations extends BaseTest{

	public Vacations(String browserProperties) {
		super(browserProperties);
		// TODO Auto-generated constructor stub
	}

	public String getHomePageTitle(){
		return driver.getTitle();
	}
}
