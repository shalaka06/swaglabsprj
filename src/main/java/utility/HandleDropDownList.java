package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList 
{
	public static void HandleDropDown(WebElement ele, String Value) 
	{
		Select sc=new Select(ele);
			sc.selectByVisibleText(Value);	
			
	}
}
