package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login;
import pages.cartPage;
import pages.checkoutStepOne;
import pages.inventoryPage;
import utility.ReadData;

public class checkoutStepOneTest extends TestBase
{
	cartPage cp;
	inventoryPage ip;
	Login lg;
	checkoutStepOne chk;
	
	@BeforeMethod
	public void setup() throws IOException
	{
	
		initialiazation();
		ip=new inventoryPage();
		lg=new Login();
		cp=new cartPage();
		chk=new checkoutStepOne();
		
		lg.loginTOApllication();
		ip.addToCartProducts();
		ip.verifycartLink();
		cp.removeBackLight();
		cp.checkoutclick();
			
	}
	@Test
	public void verifyFirstName() throws EncryptedDocumentException, IOException
	{
		String expUrl = "Error: First Name is required";
		String actUrl = chk.verifyFirstName();
		
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("continue button clicked go to next step"+actUrl);
	}
	@Test
	public void verifyLastNametest() throws EncryptedDocumentException, IOException
	{
		String expUrl ="Error: Last Name is required" ;//ReadData.readExcel(13, 1);//"https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = chk.verifyLastName();
		
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("continue button clicked go to next step"+actUrl);
		
	}
	@Test
	public void verifyPostalcode() throws EncryptedDocumentException, IOException
	{
		String expUrl = "Error: Postal Code is required";//ReadData.readExcel(13, 1);//"https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = chk.verifyPostalCode();
		
		Assert.assertEquals(expUrl, actUrl);
		//Reporter.log("continue button clicked go to next step"+actUrl);
	}
	
	
	@Test
	public void verifyAllFieds() throws EncryptedDocumentException, IOException
	{
		String expUrl = "Error: First Name is required";//ReadData.readExcel(13, 1);//"https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = chk.verifyAllFields();
		
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("continue button clicked go to next step"+actUrl);
	}
	@Test
	
	public void verifyCancelBtnTest() throws EncryptedDocumentException, IOException
	{
		String expUrl = ReadData.readExcel(13, 0);//"https://www.saucedemo.com/cart.html";
		String actUrl = chk.verifyCancelBtn();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("cancel button clicked"+actUrl);
	}
	
	@Test
	public void verifyContinueBtn() throws EncryptedDocumentException, IOException
	{
		
		String expUrl = ReadData.readExcel(13, 1);//"https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = chk.verifyContinueBtn();
		
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("continue button clicked go to next step"+actUrl);
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
