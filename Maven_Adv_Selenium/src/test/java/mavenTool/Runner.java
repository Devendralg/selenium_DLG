package mavenTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner extends BaseClass
{
	@Test (dataProvider = "login details" )
	public void acion(String un, String pwd)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		POM_Class p=new POM_Class(driver);
		p.unSet().sendKeys(un);
		p.pwdSet().sendKeys(pwd,Keys.ENTER);
	}
	@DataProvider (name = "login details")
	public Object[][] data()
	{
		Object data[][]=new Object[1][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		return data;
		
			
		
	}
}

