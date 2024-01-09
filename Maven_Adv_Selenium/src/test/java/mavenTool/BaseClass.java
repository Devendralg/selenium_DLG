package mavenTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements Constants 
{
	WebDriver driver;
	@BeforeClass
	
	public void lauchChrome()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void launchURL()
	{
		driver.get(Url);
	}
	@AfterMethod
	public void logout()
	{
		POM_Class p=new POM_Class(driver);
		p.lgt();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
