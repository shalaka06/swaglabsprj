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
import pages.inventoryPage;
import utility.ReadData;
import utility.Screenshot;

public class inventoryPageTest extends TestBase
{
	inventoryPage ip;
	Login lg;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialiazation();
	
		ip=new inventoryPage();
		lg=new Login();
	
		lg.loginTOApllication();
	}
	
	//loginTOApllication
	
	
	
	@Test
	public void testBackPackLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(3, 0);//"https://www.saucedemo.com/inventory-item.html?id=4";
		String actURL=ip.checkBackPackLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void checkBackPackImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(3, 0);//"https://www.saucedemo.com/inventory-item.html?id=4";
		String actURL=ip.checkBackPackImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  backpack "+actURL);
		
	} 
	@Test
	public void checkbikelightLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(4, 0);//"https://www.saucedemo.com/inventory-item.html?id=0";
		String actURL=ip.checkbikelightLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bikeLight "+actURL);
		
	} 
	@Test
	public void checkbikelightLImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(4, 0);//"https://www.saucedemo.com/inventory-item.html?id=0";
		String actURL=ip.checkbikelightLImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  Bikelight "+actURL);
		
	} 
	@Test
	public void checkboltTShirtLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(5, 0);//"https://www.saucedemo.com/inventory-item.html?id=1";
		String actURL=ip.checkboltTShirtLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checkboltTShirtImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(5, 0);//"https://www.saucedemo.com/inventory-item.html?id=1";
		String actURL=ip.checkboltTShirtImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checkfleecejacketLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(6, 0);//"https://www.saucedemo.com/inventory-item.html?id=5";
		String actURL=ip.checkfleecejacketLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checkfleecejacketImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(6, 0);//"https://www.saucedemo.com/inventory-item.html?id=5";
		String actURL=ip.checkfleecejacketImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checkonesieLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(7, 0);//"https://www.saucedemo.com/inventory-item.html?id=2";
		String actURL=ip.checkonesieLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checkonesieImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(7, 0);//"https://www.saucedemo.com/inventory-item.html?id=2";
		String actURL=ip.checkonesieImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	}
	
	@Test
	public void checktshirtRedLink() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(8, 0);//"https://www.saucedemo.com/inventory-item.html?id=3";
		String actURL=ip.checktshirtRedLink();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	@Test
	public void checktshirtRedImg() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(8, 0);//"https://www.saucedemo.com/inventory-item.html?id=3";

		String actURL=ip.checktshirtRedImg();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to sauce labs  bolt T_shirt page "+actURL);
		
	} 
	
	
	@Test
	public void verifyTwitterLogoTest()
	{
		Boolean result=ip.verifyTwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Twitter logo is present" +result);
		
	}
	@Test
	public void checkTwitterClickTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(10, 1);//"https://x.com/saucelabs";
		String actURL=ip.checkTwitterClick();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate twitter page "+actURL);
		
	} 
	
	@Test
	public void verifyfacebookLogoTest()
	{
		Boolean result=ip.verifyfacebookLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Facebook logo is present" +result);
		
	}
	
	public void checkfacebookClickTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(10, 2);//"https://www.facebook.com/saucelabs";
		String actURL=ip.checkFacebookClick();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate facebook page "+actURL);
		
	} 
	
	@Test
	public void verifyLinkedInLogoTest()
	{
		Boolean result=ip.verifyLinkedInLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Linkedin logo is present" +result);
		
	}
	public void checkLinkedInClickTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(10, 3);//"https://www.linkedin.com/authwall?trk=bf&trkInfo=AQGt3_4tanLr1AAAAZVGpb2wwXcJQCbQkL2OljfqT8Yn8NMsE-l9u7fmdeo8SOB_5gv5knQHGcUDfpEEts4iYggVsnhCV-XIy_BDi7zXp4fHtsVxSVHkgDRSDtBVs61jt1ZbDhQ=&original_referer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
		String actURL=ip.checkLinkedInClick();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate LinkedIn page "+actURL);
		
	} 
	@Test
	public void addToCartProducts() throws EncryptedDocumentException, IOException
	{
		String expCnt="4";//ReadData.readExcel(12, 1);//"6";
		String actCnt=ip.addToCartProducts();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product added" +actCnt);
	}
	@Test
	
	public void select6ProductsTest() throws EncryptedDocumentException, IOException
	{
		String expCnt=ReadData.readExcel(12, 1);//"6";
		String actCnt=ip.select6Products();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product added" +actCnt);
	}
	@Test
	public void RemoveProductCartTest() throws EncryptedDocumentException, IOException
	{
	
	
		String expCnt="5";//ReadData.readExcel(12, 2);//("4");
		String actCnt=ip.RemoveProductCart();
		Assert.assertEquals(expCnt, actCnt);
		Reporter.log("total product deleted" +actCnt);
	}
	@Test
	
	public void verifyFooterTextTest()
	{
		String text=ip.verifyFooterText();
		Reporter.log(text);
		
	}
	@Test
	public void CheckOpenMenu() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(1, 0);//"https://www.saucedemo.com/inventory.html";
		String actURL=ip.CheckOpenMenu();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to all items page "+actURL);
		
	}
	@Test
	public void abtusmenutest() throws EncryptedDocumentException, IOException
	{
		CheckOpenMenu();
		String expURL=ReadData.readExcel(0, 6);//"https://saucelabs.com/";
		String actURL=ip.abtusmenu();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("navigate to about us page "+actURL);
		
	}
	@Test
	public void logoutclickTest() throws EncryptedDocumentException, IOException
	{
		ip.CheckOpenMenu();
		String expURL=ReadData.readExcel(0, 0);//"https://www.saucedemo.com/";
		String actURL=ip.logoutclick();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("logout click "+actURL);
	}
	@Test
	public void resetclickTest() throws EncryptedDocumentException, IOException 
	{
		CheckOpenMenu();
		String expURL=ReadData.readExcel(1, 0);//"https://www.saucedemo.com/";
		String actURL=ip.resetclick();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("reset app click "+actURL);
	
	}
	@Test
	public void verifycartLinkTest()
	{
		String expURL="https://www.saucedemo.com/cart.html";
		String actURL=ip.verifycartLink();
		Assert.assertEquals(expURL, actURL);
	}
	
	@AfterMethod
	public void closebrowser(ITestResult it) throws InterruptedException, IOException 
	{
		if(it.FAILURE==it.getStatus())
		{
			Screenshot.sc(it.getName());
			
		}
		Thread.sleep(5000);
		//driver.wait(5000);
		driver.close();
	}
}
