package practiceFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements Constatnts
{
	WebDriver driver;
   @BeforeMethod
  public void beforeMethod() 
   {
	   driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--start-maximized");
	  driver=new ChromeDriver();
	 
  }

  @AfterClass
  public void afterClass() {
  }

}
