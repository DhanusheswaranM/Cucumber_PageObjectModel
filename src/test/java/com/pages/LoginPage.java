package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "username")
	public WebElement userName ;
	
	@FindBy(name = "password")
	public WebElement passWord ;
	
	@FindBy(xpath = "//div[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement login ;
}
