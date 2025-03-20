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
import pages.checkoutCompletePage;
import pages.checkoutStepOne;
import pages.inventoryPage;

public class checkoutCompletePageTest extends TestBase
{
	cartPage cp;
	inventoryPage ip;
	Login lg;
	checkoutStepOne chk;
	CheckoutStepTwo chk2;
	checkoutCompletePage chkfin;
	
	@BeforeMethod
	public void setup() throws IOException
	{
	
		initialiazation();
		ip=new inventoryPage();
		lg=new Login();
		cp=new cartPage();
		chk=new checkoutStepOne();
		chk2=new CheckoutStepTwo();
		chkfin=new checkoutCompletePage();
		
		
		lg.loginTOApllication();
		ip.addToCartProducts();
		ip.verifycartLink();
		cp.checkoutclick();
		chk.verifyContinueBtn();
		chk2.finishbtnClick();
			
	}
	@Test
	
	public void backHomeBtnClick()
	{
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = chkfin.backHomeBtnClick();	
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("finish button clicked"+actUrl);
	}
	@Test
	public void getTitleofPage()
	{
		String text=chkfin.PageTitleCheck();
		Reporter.log(text);
	}
	@Test
	
	public void cartIconClick()
	{
		String expValue="https://www.saucedemo.com/cart.html";
		 String actValue=chkfin.carticonClick();
		 Assert.assertEquals(expValue, actValue);
			Reporter.log("finish button clicked"+actValue);
	}
	@Test
	public void ponnyicondisplayed()
	{
		boolean txt=chkfin.ponnyicondisplayed();
		Reporter.log("icon present"+txt);
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
