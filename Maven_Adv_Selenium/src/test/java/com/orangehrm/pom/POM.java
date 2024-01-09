package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
	@FindBy (name = "username") private WebElement un;
	@FindBy (name = "password") private WebElement pwd;
	
	public POM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUn() {
		return un;
	}


	public WebElement getPwd() {
		return pwd;
	}



}
