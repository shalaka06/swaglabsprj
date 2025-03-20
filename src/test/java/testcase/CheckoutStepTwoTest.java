package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckoutStepTwo;
import pages.Login;
import pages.cartPage;
import pages.checkoutStepOne;
import pages.inventoryPage;

public class CheckoutStepTwoTest extends TestBase
{
	cartPage cp;
	inventoryPage ip;
	Login lg;
	checkoutStepOne chk;
	CheckoutStepTwo chk2;
	
	@BeforeMethod
	public void setup() throws IOException
	{
	
		initialiazation();
		ip=new inventoryPage();
		lg=new Login();
		cp=new cartPage();
		chk=new checkoutStepOne();
		chk2=new CheckoutStepTwo();
		
		lg.loginTOApllication();
		ip.addToCartProducts();
		ip.verifycartLink();
		cp.checkoutclick();
	
		chk.verifyContinueBtn();
			
	}
	@Test
	
	public void verifyTitle()
	{
		String text=chk2.verifyTitle();
		Reporter.log("title of page"+text);
	}
	@Test
	public void verifyDescriptionLable()
	{
		String text=chk2.verifyDescriptionLable().toString(true);
		Reporter.log("lable is displayed "+text);
	}
	@Test
	
	public void verifycartQtyLable()
	{
		String text=chk2.verifycartQtyLable().toString(true);
		Reporter.log("lable is displayed "+text);
	}
	@Test
	
	public void cancelBtnClickTest()
	{
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = chk2.cancelBtnClick();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("cancel button clicked"+actUrl);
	}
	@Test
	public void FinishbtnTest()
	{
		String expUrl = "https://www.saucedemo.com/checkout-complete.html";
		String actUrl = chk2.finishbtnClick();
		
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("finish button clicked"+actUrl);
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
}
