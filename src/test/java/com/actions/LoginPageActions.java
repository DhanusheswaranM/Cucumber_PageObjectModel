package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPage;
import com.utilities.HelperClass;

public class LoginPageActions {
	
	LoginPage objLoginPage = null ;
	String strUserName ,strPassword ;
	
	public LoginPageActions() {
		this.objLoginPage = new LoginPage();
		PageFactory.initElements(HelperClass.getDriver(), objLoginPage);
	}
	
	public void setUsername(String strUserName) {
		objLoginPage.userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		objLoginPage.passWord.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		objLoginPage.login.click();
	}
	
	public void login() {
		File file = new File("D:/CucumberPageObjectModel/src/test/resources/testData.properties");
		
		FileInputStream fileInput = null ;
		try {
			fileInput = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	strUserName = prop.getProperty("username");
	strPassword = prop.getProperty("password");
	
	this.setUsername(strUserName);
	this.setPassword(strPassword);
	this.clickLogin();
	}
}
