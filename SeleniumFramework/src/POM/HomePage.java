package POM;

import org.openqa.selenium.WebDriver;
import CommonClass.Helper;
import Utility.ElementsLoc;

public class HomePage {
		
public String VerifyHomePage(WebDriver driver)
{
	String displayName="Unknown";
	try
	{
	
	if(Helper.FinishLoading(driver))
	{
		 if(ExpendMenuBar(driver))
		 {
	      displayName=Helper.GetText(driver,"xpath",ElementsLoc.lnkDisplayUser);
		 }
	}
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
	    if(Helper.FinishLoading(driver))
	    {
	    
	    	Helper.ClickThroughJavaScript(driver, "xpath",ElementsLoc.lnkMyCart);
	   
	    }
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
       
		
		if(Helper.FinishLoading(driver))
		{

        if(ExpendMenuBar(driver))
        {
		Helper.Click(driver, "xpath",ElementsLoc.lnkMyProfile);
        }
		return new MyProfilePage();
		}
		}
		
	}
	catch(Exception ex)
	{
		return null;
		
	}
	return null;
	
	
}

public static Boolean ExpendMenuBar(WebDriver driver)
{
	Boolean flag=false;
	int _retry=0;
	try
	{
		
		int count=Helper.GetElementsCount(driver, "xpath", ElementsLoc.menuBar);
	    while(count<1)
	    {
	    	Helper.MoveToElement(driver, "xpath",ElementsLoc.lnkDisplayUser);
	    	count=Helper.GetElementsCount(driver, "xpath", ElementsLoc.menuBar);
	    	_retry++;
	    	if(_retry==3)
	    	{
	    		break;
	    		
	    	}	    	    	
	    }
	    if(count>0)
	    {
	    	flag=true;
	    	
	    }
		
	    return flag;
	}
	catch(Exception ex)
	{
		throw ex;
		
	}
	}

	
}
	
	

