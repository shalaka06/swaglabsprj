package testcase;

import java.io.IOException;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Login;
import utility.ReadData;

public class LoginTest extends TestBase
{
	   Login lg;
	@BeforeMethod(alwaysRun = true)
	
	public void setup() throws IOException
	{
		initialiazation();
		lg=new Login();
		
	}
	@DataProvider(name="ValidationForLogin")

	public Object[][] getData()
	{
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"}
			
				};
	}
	@Test(dataProvider = "ValidationForLogin")
	public void verifyMultiUserTest(String un,String password)
	{
		SoftAssert as=new SoftAssert();
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=lg.verifyMultiUser(un,password);
		as.assertEquals(expURL,actURL);
		as.assertAll();
	}

	
	@Test
	public void verifyURLOFApplication() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcel(0,0);//"https://www.saucedemo.com/";
		String actURL=lg.verifyURLOFApplication();
		Assert.assertEquals(expURL, actURL);
	}
	@Test
	public  void loginToApplication() throws IOException
	{
		String expURL=ReadData.readExcel(1, 0);//"https://www.saucedemo.com/inventory.html";
		String actURL=lg.loginTOApllication();
		
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Login successful "+actURL);
		
	}
	@Test

	public void verifyTITLEOFApplication()
	{
		String expTitle="Swag Labs";
		String actTitle=lg.verifyTITLEOFApplication();
		Assert.assertEquals(expTitle,actTitle);
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(5000);
		//driver.wait(5000);
		driver.close();
	}
}
