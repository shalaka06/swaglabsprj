package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import utility.HandleDropDownList;

public class inventoryPage extends TestBase
{
	//object repository
	//@FindBy(xpath = "//input[@id='user-name']")private WebElement userNameTextBox; 
	@FindBy(xpath = "//div[@class='bm-menu']")private WebElement cntainer;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement openMenuBtn;
	@FindBy(xpath = "//a[@id='inventory_sidebar_link']")private WebElement allItemmenu;
	@FindBy(xpath = "//a[@id='about_sidebar_link']")private WebElement abtusmenu;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement logoutclick;
	@FindBy(xpath = "//a[@id='reset_sidebar_link']")private WebElement resetclick;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement cartLinkbtn;
	@FindBy(xpath = "//span[@class='title']")private WebElement productText;
	@FindBy(xpath = "//select[@class='product_sort_container']")private WebElement prodSortListBox;
	@FindBy(xpath = "//a[text()='Twitter']")private WebElement twitterswaglabPageLink;
	@FindBy(xpath = "//a[text()='Facebook']")private WebElement fbswaglabpageLink;
	@FindBy(xpath = "//a[text()='LinkedIn']")private WebElement linkinsaglabLink;
	@FindBy(xpath = "//div[@class='footer_copy']")private WebElement footerText;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement cartcount;
	
	@FindBy(xpath = "//a[@id='item_4_title_link']")private WebElement backpackLink;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backpackAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")private WebElement backpackImg;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement bikelightLink;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikelightAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bike Light']")private WebElement bikelightImg;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement boltTShirtLink;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement boltTShirtAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bolt T-Shirt']")private WebElement boltTShirtImg;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")private WebElement fleecejacketLink;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement fleecejacketAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Sauce Labs Fleece Jacket']")private WebElement fleecejacketImg;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")private WebElement onesieLink;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement onesieAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Sauce Labs Onesie']")private WebElement onesieImg;
	
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement tshirtRedLink;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirtRedAddtoCartBTN;
	@FindBy(xpath = "//img[@alt='Test.allTheThings() T-Shirt (Red)']")private WebElement tshirtRedImg;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")private WebElement bpremovebtn;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement fjRemovebtn;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement tshirtRedRemovebtn;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement bolttshirtRemovebtn;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")private WebElement onesieRemovebtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLightRemovebtn;
	public inventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyURLOFInventoryPage()
	{
		return driver.getCurrentUrl();
	}
	
	public String checkBackPackLink()
	{
		
		backpackLink.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	public String checkBackPackImg()
	{
		
		backpackImg.click();
		// driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
		 return driver.getCurrentUrl();
	}
	
	public String checkbikelightLink()
	{
		
		bikelightLink.click();
		
		 return driver.getCurrentUrl();
	}
	public String checkbikelightLImg()
	{
		
		bikelightImg.click();
		
		 return driver.getCurrentUrl();
	}
	
	public String checkboltTShirtLink()
	{
		
		boltTShirtLink.click();
		
		 return driver.getCurrentUrl();
	}
	public String checkboltTShirtImg()
	{
		
		boltTShirtImg.click();
		
		 return driver.getCurrentUrl();
	}
	
	public String checkfleecejacketLink()
	{
		
		fleecejacketLink.click();
		
		 return driver.getCurrentUrl();
	}
	public String checkfleecejacketImg()
	{
		
		fleecejacketLink.click();
		
		 return driver.getCurrentUrl();
	}
	
	public String checkonesieLink()
	{
		
		onesieLink.click();
		
		 return driver.getCurrentUrl();
	}
	public String checkonesieImg()
	{
		
		onesieImg.click();
		
		 return driver.getCurrentUrl();
	}
	
	public String checktshirtRedLink()
	{
		
		tshirtRedLink.click();
		
		 return driver.getCurrentUrl();
	}
	public String checktshirtRedImg()
	{
		
		tshirtRedImg.click();
		
		 return driver.getCurrentUrl();
	}
	//footer check links presents
	public Boolean verifyTwitterLogo()
	{
		return twitterswaglabPageLink.isDisplayed();
	}
	public String checkTwitterClick()
	{
		
		twitterswaglabPageLink.click();
		
		 return driver.getCurrentUrl();
	}
	
	
	public Boolean verifyfacebookLogo()
	{
		return fbswaglabpageLink.isDisplayed();
	}
	public String checkFacebookClick()
	{
		
		fbswaglabpageLink.click();
		
		 return driver.getCurrentUrl();
	}
	
	public Boolean verifyLinkedInLogo()
	{
		return linkinsaglabLink.isDisplayed();
	}
	public String checkLinkedInClick()
	{
		
		linkinsaglabLink.click();
		
		 return driver.getCurrentUrl();
	}
	
	
	public String addToCartProducts()
	{
		HandleDropDownList.HandleDropDown(prodSortListBox, "Price (low to high)");
		backpackAddtoCartBTN.click();
		bikelightAddtoCartBTN.click();
		
		onesieAddtoCartBTN.click();
		tshirtRedAddtoCartBTN.click();
		return cartcount.getText();
	}
	
	public String select6Products()
	{
		HandleDropDownList.HandleDropDown(prodSortListBox, "Price (low to high)");
		//Select sc=new Select(prodSortListBox);
		//sc.selectByVisibleText("Price (low to high)");
		backpackAddtoCartBTN.click();
		bikelightAddtoCartBTN.click();
		
		fleecejacketAddtoCartBTN.click();
		boltTShirtAddtoCartBTN.click();
		onesieAddtoCartBTN.click();
		tshirtRedAddtoCartBTN.click();
		
		return cartcount.getText();
		
		
	}
	
	
	public String RemoveProductCart()
	{
		
		//bpremovebtn.click();
		//tshirtRedRemovebtn.click();
		onesieRemovebtn.click();
		return cartcount.getText();
	}
	
	
	
	public String CheckOpenMenu()
	{
		openMenuBtn.click();
		
		
		
		return driver.getCurrentUrl();
	}
	
	public String abtusmenu()
	{ 
		abtusmenu.click();
		return driver.getCurrentUrl();
	}
	
	public String logoutclick()
	{
		logoutclick.click();
		return driver.getCurrentUrl();
	}
	public String resetclick()
	{
		resetclick.click();
		return driver.getCurrentUrl();
	}
	
	public String verifyTITLEOFInventoryPage()
	{
		return productText.getText();
	}

	public String verifyFooterText()
	{
		return footerText.getText();
	}
	public String verifycartLink()
	{
		cartLinkbtn.click();
		return driver.getCurrentUrl();
	}
}
