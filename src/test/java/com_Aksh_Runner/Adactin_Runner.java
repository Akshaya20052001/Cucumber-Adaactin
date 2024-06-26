package com_Aksh_Runner;

import org.Base.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\Demo.feature", glue = "com_Demo_Aksh_StepDefinition",
monochrome = true,dryRun = false,publish = true)




public class Adactin_Runner   {

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
		driver = Base_Class.launch_Browser();
		
//		launch_Browser();
		driver.manage().window().maximize();
//		maximize();
		
		
	}

	@AfterClass
	public static void end() {
		driver.quit();

	}






}
