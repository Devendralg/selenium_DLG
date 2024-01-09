package com.orangehrm.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pom.POM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class implements Framework_Constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Base_URL);
		POM p=new POM(driver);
		p.getUn().sendKeys(username);
		p.getPwd().sendKeys(password,Keys.ENTER);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
