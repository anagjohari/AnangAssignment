package POM;

import org.openqa.selenium.WebDriver;


import CommonClass.*;
import Utility.*;


public class LoginPage {
	
	
	public static boolean Login(WebDriver driver)
	{
		String url="https://www.flipkart.com";
		try
		{   UserDetails details=new UserDetails();
		    details=details.GetUserDetails();
			Helper.NavigateURL(driver, url);
			Helper.InputText(driver,"xpath",ElementsLoc.txtUserName,details.userName);
			Helper.InputText(driver,"xpath",ElementsLoc.txtPassword,details.password);
			Helper.Click(driver, "xpath",ElementsLoc.btnLogin);
			return true;		
		}
		catch(Exception ex)
		{
			return false;
			
		}
		
	}
	
	public static HomePage LogintoFlipkart(WebDriver driver)
	{
		
		try
		{
			if(Login(driver))
			{
				
				return new HomePage();
					
			}
			
		}
		catch(Exception ex)
		{
			throw ex;
		 
		}
		return null;
		
	}
	


}
