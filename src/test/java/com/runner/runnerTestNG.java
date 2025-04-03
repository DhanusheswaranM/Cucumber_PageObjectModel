package com.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {
				"pretty" , 
				"json:target/cucumberReport.json" , 
				"html:target/cucumberReport.html" , 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features="src/test/resources/features/LoginPage.feature",
		glue="com.definitions",
		monochrome=true
		)
public class runnerTestNG extends AbstractTestNGCucumberTests{

}