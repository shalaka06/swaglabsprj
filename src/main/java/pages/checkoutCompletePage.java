package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class checkoutCompletePage extends TestBase
{
		//object Repository
	@FindBy(xpath = "//button[@id='back-to-products']")private WebElement backHomeBtn;
	@FindBy(xpath = "//span[@class='title']")private WebElement pageTitle;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement cartIcon;
	@FindBy(xpath = "//img[@alt='Pony Express']")private WebElement ponnyIcon;
	@FindBy(xpath = "//h2[Text()='Thank you for your order!']")private WebElement thankYouTxt;
	
	@FindBy(xpath = "//div[@class='complete-text']")private WebElement cmpleteText ;
	
	public boolean ponnyicondisplayed()
	{
		return ponnyIcon.isDisplayed();
	}
	
	
	public checkoutCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String backHomeBtnClick()
	{
		backHomeBtn.click();
		return driver.getCurrentUrl();
	}
	public String PageTitleCheck()
	{
		return pageTitle.getText();
	}
	public String carticonClick()
	{
		cartIcon.click();
		return driver.getCurrentUrl();
	}
}
