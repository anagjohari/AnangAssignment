package POM;


import org.openqa.selenium.WebDriver;

import CommonClass.Helper;
import Utility.ElementsLoc;


public class HomePage {
	
	
public String VerifyHomePage(WebDriver driver)
{
	try
	{
		
	Helper.Wait(2000);
	String displayName=Helper.GetText(driver,"xpath",ElementsLoc.lnkDisplayUser);
	return displayName;
	}
	catch(Exception ex)
	{
	 throw ex;	
		
	}
	
}

public static ShoppingCartPage CheckShoppingCart(WebDriver driver)
{

	try
	{   
		
		if(LoginPage.Login(driver))
		{
		
		Helper.Wait(2000);
	    Helper.Click(driver,"xpath",ElementsLoc.lnkMyCart);
		return new ShoppingCartPage();
		
		}
		
	}
	catch(Exception ex)
	{
		return null;
		
	}
	return null;
	
	
}

public static MyProfilePage MyProfileLandingPage(WebDriver driver)
{

	try
	{
		if(LoginPage.Login(driver))
		{
		Helper.Wait(2000);
		Helper.Click(driver,"xpath",ElementsLoc.lnkDisplayUser);
		Helper.Click(driver,"xpath",ElementsLoc.lnkDisplayUser);
		Helper.Click(driver, "xpath",ElementsLoc.lnkMyProfile);
		Helper.Wait(2000);
		return new MyProfilePage();
		
		}
		
	}
	catch(Exception ex)
	{
		return null;
		
	}
	return null;
	
	
}

	
	
}
