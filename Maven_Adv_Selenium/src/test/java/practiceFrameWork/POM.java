package practiceFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	@FindBy (name = "email")
	private WebElement password;
	
	public POM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(WebElement username) {
		this.username = username;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}



}
