package mavenTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class 
{
	@FindBy (name="username") private WebElement un;
	@FindBy (name="password") private WebElement pwd;
	@FindBy (xpath = "//p[text()='George Mathew']") private WebElement dd;
	@FindBy (xpath = "//a[text()='Logout']") private WebElement logout;
	
	public POM_Class(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement unSet()
	{
		return un;
	}
	public WebElement pwdSet()
	{
		return pwd;
	}
	public void lgt()
	{
		dd.click();
		logout.click();
	}
	
}
