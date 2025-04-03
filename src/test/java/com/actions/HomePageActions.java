package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.HomePage;
import com.utilities.HelperClass;

public class HomePageActions {
	
	HomePage objHomePage = null ;
	
	public HomePageActions() {
		this.objHomePage = new HomePage();
		PageFactory.initElements(HelperClass.getDriver(), objHomePage);
	}
	
	public String getHomePageText() {
		return objHomePage.homePageUserName.getText();
	}
}
