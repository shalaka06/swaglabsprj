package pages;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class checkoutStepOne extends TestBase
{
	//object repository
	@FindBy(xpath = "//button[@id='cancel']")private WebElement cancelBtn;
@FindBy(xpath = "//input[@id='continue']")private WebElement continueBtn;
	@FindBy(xpath = "//input[@id='first-name']")private WebElement FirstnameTxtBox;
	@FindBy(xpath = "//input[@id='last-name']")private WebElement LastnameTxtBox;
	@FindBy(xpath = "//input[@id='postal-code']")private WebElement postalcodeTxtBox;
	
	//error message
	@FindBy(xpath = "//h3[text()='Error: First Name is required']")private WebElement errormsgFirstname; 
	@FindBy(xpath = "//h3[text()='Error: Last Name is required']")private WebElement errmsgLastname;
	@FindBy(xpath = "//div[@class='checkout_info']//div[1]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")private WebElement firstnameerr;
	@FindBy(xpath = "//div[@class='checkout_info']//div[2]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")private WebElement lastnameerr; 
	@FindBy(xpath = "//div[@id='checkout_info_container']//div[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")private WebElement postalcodeErr;
	@FindBy(xpath = "//h3[text()='Error: Last Name is required']")private WebElement errmsgPostalCode;
	
public  checkoutStepOne()
{
	PageFactory.initElements(driver, this);
}
public String verifyCancelBtn()
{
	cancelBtn.click();
	return driver.getCurrentUrl();
}


public String verifyFirstName()
{
	
	continueBtn.click();
	return errormsgFirstname.getText();
}
public String verifyLastName()
{
	FirstnameTxtBox.sendKeys("anuja");
	continueBtn.click();

	return errmsgLastname.getText();
}
public String verifyPostalCode()
{
	FirstnameTxtBox.sendKeys("anuja");
	LastnameTxtBox.sendKeys("gurav");
	continueBtn.click();
	return  errmsgPostalCode.getText();
}
public String verifyAllFields()
{
	
		continueBtn.click();
		//errormsg.sendKeys("Error:first name required");

	return errormsgFirstname.getText();
}

/*public String VerifyallFields() throws EncryptedDocumentException, IOException
{
	if(FirstnameTxtBox..isEmpty())
	{
		continueBtn.click();
		//errormsg.sendKeys("Error:first name required");
	}
	else if(LastnameTxtBox.getText().isEmpty())
	{
		continueBtn.click();
		//errormsg.sendKeys("Error:enter last name");
	}
	else if(postalcodeTxtBox.getText().isEmpty())
	{
		continueBtn.click();
		//errormsg.sendKeys("Postal code required");
	}
	else
	{
		
		continueBtn.click();
	}
		return driver.getCurrentUrl();
}*/

public String verifyContinueBtn() throws EncryptedDocumentException, IOException
{
	//VerifyallFields();
	
	FirstnameTxtBox.sendKeys(ReadData.readExcel(14, 0));//("sfdgja");
	LastnameTxtBox.sendKeys(ReadData.readExcel(14, 1));//("pdoudsh");
	postalcodeTxtBox.sendKeys(ReadData.readExcel(14, 2));//("83487"); 
	continueBtn.click();
	return driver.getCurrentUrl();
}

}