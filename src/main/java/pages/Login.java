package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class Login extends TestBase
{
	//object repository
	
	@FindBy(xpath = "//input[@id='user-name']")private WebElement userNameTextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTestBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMultiUser(String us,String pass)
	{
		userNameTextBox.sendKeys(us);
		passwordTestBox.sendKeys(pass);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	public  String loginTOApllication() throws IOException
	{
		userNameTextBox.sendKeys(ReadData.readPropertyFile("UserName"));
		passwordTestBox.sendKeys(ReadData.readPropertyFile("Password"));
		loginBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifyURLOFApplication()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTITLEOFApplication()
	{
		return driver.getTitle();
	}
}
