package testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login;
import pages.cartPage;
import pages.inventoryPage;
import utility.ReadData;
import utility.Screenshot;

public class cartPageTest extends TestBase
{
	cartPage cp;
	inventoryPage ip;
	Login lg;
	inventoryPageTest ipt;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws IOException
	{
	
		initialiazation();
		ip=new inventoryPage();
		lg=new Login();
		cp=new cartPage();
		lg.loginTOApllication();
		ip.addToCartProducts();
		ip.verifycartLink();
		
	}
	@Test
	public void continueBtnTest()
	{
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = cp.continueBtnClick();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("navigate to inventery page to continue shopping"+actUrl);
	}
	@Test
	public void checkoutTest()
	{
		String expUrl = "https://www.saucedemo.com/checkout-step-one.html";
		String actUrl = cp.checkoutclick();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("navigate to logout"+actUrl);
	}
	@Test
	public void removeBackpackBtnclickTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeBackpackBtnclick();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removebackpackTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeBackLight();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removebikeLightTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.BackLightLink();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removeOneSieTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeOneSie();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removeFleeceJacketTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeFleeceJacket();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removeBoltTshirtTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeBoltTshirt();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void removeRedTshirtTest()
	{
		//ip.select6Products();
		String expCnt=("3");
		String actCnt=cp.removeRedTshirt();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	public void testBackPackLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=4";
		String actURL=ip.checkBackPackLink();
		Assert.assertEquals(expURL, actURL);
		String expcnt="3";
		String actcnt=cp.removeBackpackBtnclick();
		Assert.assertEquals(expcnt, actcnt);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void backLightLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=0";
		String actURL=cp.BackLightLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void onrsieLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=2";
		String actURL=cp.onesieLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void boltTshirtLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=1";
		String actURL=cp.boltTshirtLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void fleeseJacketLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=5";
		String actURL=cp.fleecejacketLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void tshitrRedLink() throws EncryptedDocumentException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory-item.html?id=3";
		String actURL=cp.tshirtRedLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void returntoproduct()
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=cp.backtoProduct();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("return to product"+actURL);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser () throws InterruptedException
	{

	
		Thread.sleep(5000);
		driver.close();
	}
}
