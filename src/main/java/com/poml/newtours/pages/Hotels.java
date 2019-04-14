package com.poml.newtours.pages;

import com.poml.newtours.base.BaseTest;

public class Hotels extends BaseTest{

	public Hotels(String browserProperties) {
		super(browserProperties);
		// TODO Auto-generated constructor stub
	}

	public String getHomePageTitle(){
		return driver.getTitle();
	}
}
