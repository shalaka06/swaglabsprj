package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutStepTwo extends TestBase
{
	//object Repository
	@FindBy(xpath = "//button[@id='finish']")private WebElement finishBtn;
	@FindBy(xpath = "//button[@id='cancel']")private WebElement cancelBtn;
	@FindBy(xpath = "//span[@class='title']")private WebElement pageTitle;
	@FindBy(xpath = "//div[@class='cart_desc_label']")private WebElement decriptionLable;
	@FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement cartQtyLable;
	@FindBy(xpath = "//div[normalize-space()='Payment Information:']")private WebElement payInfoLable;
	@FindBy(xpath = "//div[normalize-space()='SauceCard #31337']")private WebElement cartInfoLable;
	@FindBy(xpath = "//div[normalize-space()='Shipping Information:']")private WebElement shipInfoLable;
	@FindBy(xpath = "//div[normalize-space()='Free Pony Express Delivery!']")private WebElement ponnyDeliveryinfo;
	
	@FindBy(xpath = "//div[normalize-space()='Price Total']")private WebElement priceTotalLable;
	@FindBy(xpath = "//div[@class='summary_subtotal_label']")private WebElement itemTotal;
	@FindBy(xpath = "//div[@class='summary_tax_label']")private WebElement taxtotal;
	@FindBy(xpath = "//div[@class='summary_total_label']")private WebElement total;
	@FindBy(xpath = "//div[@class='inventory_item_price'][normalize-space()='$29.99']")private WebElement itempricebackpack;
	@FindBy(xpath = "//div[@class='inventory_item_price'][normalize-space()='$9.99']")private WebElement itempricebikelight;
	@FindBy(xpath = "//div[@class='inventory_item_price'][normalize-space()='$7.99']")private WebElement itemPriceOnesie;
public CheckoutStepTwo()
{
	PageFactory.initElements(driver, this);
}
public String cancelBtnClick()
{
	cancelBtn.click();
	return driver.getCurrentUrl();
		
}
public String verifyTitle()
{
	return pageTitle.getText();
}
public String finishbtnClick()
{
	
	finishBtn.click();
	return driver.getCurrentUrl();

}
public Boolean verifyDescriptionLable()
{
	return decriptionLable.isDisplayed();
	
}
public Boolean verifycartQtyLable()
{
	return cartQtyLable.isDisplayed();
	
}
}
