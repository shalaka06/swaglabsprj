package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class cartPage extends TestBase
{
	//object repository
	@FindBy(xpath = "//span[@class='title']")private WebElement pageTitle;
	@FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement qtyLable;
	@FindBy(xpath = "//div[@class='cart_desc_label']")private WebElement descLable;
	@FindBy(xpath = "//button[@id='checkout']")private WebElement checkoutBtn;
	@FindBy(xpath = "//button[@id='continue-shopping']")private WebElement continueBtn;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement cartcount;
	
	//remove items from cart
	@FindBy(xpath = "//button[@id='remove']")private WebElement removeBackPackBtn;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")private WebElement removeBackPack;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")private WebElement removeOnesie;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")private WebElement removeBikeLight;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removeBoltTshirt;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement removeFleeceJacket;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement removeRedTshirt;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")private WebElement backPackItem;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement bikelightItem;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement boltTshirt;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")private WebElement fleecejacket;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")private WebElement onesie ;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement Redtshirt;
	
	@FindBy(xpath = "//button[@id='back-to-products']")private WebElement returntoproductBtn;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]")private WebElement priceBoltTshirt;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]")private WebElement priceFleeceJacket;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[2]/div[2]/div[1]")private WebElement priceOnesie;
	public cartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String checkoutclick()
	{
		checkoutBtn.click();
		return driver.getCurrentUrl();
		
	}
	public String continueBtnClick()
	{
	
		continueBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String removeBackpackBtnclick()
	{
		backPackItem.click();
		removeBackPackBtn.click();
		return cartcount.getText();
	}
	
	public String BackPackLink()
	{
		
		backPackItem.click();
		removeBackPackBtn.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeBackPack()
	{
		
		removeBackPack.click();
		return cartcount.getText();
	}
	public String BackLightLink()
	{
		
		bikelightItem.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeBackLight()
	{
		
		removeBikeLight.click();
		return cartcount.getText();
	}
	public String onesieLink()
	{
		
		onesie.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeOneSie()
	{
		
		removeOnesie.click();
		return cartcount.getText();
	}
	public String boltTshirtLink()
	{
		
		boltTshirt.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeBoltTshirt()
	{
		
		removeBoltTshirt.click();
		return cartcount.getText();
	}
	
	public String fleecejacketLink()
	{
		
		fleecejacket.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeFleeceJacket()
	{
		
		removeFleeceJacket.click();
		return cartcount.getText();
	}
	public String tshirtRedLink()
	{
		
		Redtshirt.click();
	
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String removeRedTshirt()
	{
		
		removeRedTshirt.click();
		return cartcount.getText();
	}
	
	public String backtoProduct()
	{
		tshirtRedLink();
		//removeitembtn();
		returntoproductBtn.click();
		return driver.getCurrentUrl();
	}
}


