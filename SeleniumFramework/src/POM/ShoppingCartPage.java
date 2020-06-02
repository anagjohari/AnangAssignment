package POM;

import org.openqa.selenium.WebDriver;

import CommonClass.Helper;
import Utility.ElementsLoc;

public class ShoppingCartPage {

	public String VerifyEmptyCart(WebDriver driver)
	{
		String cartMessage="NoMessage";
		try
		{
		if(Helper.FinishLoading(driver))
		{
		cartMessage=Helper.GetText(driver,"xpath",ElementsLoc.msgMyCart);
		}
		return cartMessage;
		
		}
		catch(Exception ex)
		{
			return cartMessage;
			
		}
		
	}
	
}
