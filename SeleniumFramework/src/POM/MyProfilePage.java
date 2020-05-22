package POM;

import org.openqa.selenium.WebDriver;

import CommonClass.Helper;
import CommonClass.UserDetails;
import Utility.ElementsLoc;

public class MyProfilePage {
	
	
	
	public String VerifyUpdatedProfile(WebDriver driver)
	{
		String profileName="NoMessage";
		try
		{
	     UserDetails details=new UserDetails();
	     details=details.GetUserDetails();
		Helper.Click(driver, "xpath",ElementsLoc.lnkEdit);
		Helper.Wait(2000);
		Helper.ClearText(driver, "xpath",ElementsLoc.txtUserFirstName);
		Helper.InputText(driver, "xpath", ElementsLoc.txtUserFirstName,details.firstName);
		Helper.ClearText(driver, "xpath",ElementsLoc.txtUserLastName);
		Helper.InputText(driver, "xpath", ElementsLoc.txtUserLastName,details.lastName);
		Helper.Wait(2000);
		Helper.Click(driver, "xpath",ElementsLoc.btnSaveProfile);
		Helper.Wait(2000);
		profileName=Helper.GetText(driver,"xpath",ElementsLoc.lnkDisplayUser);
		return profileName;
		}
		catch(Exception ex)
		{
		 
			return profileName;
			
		}
		
	}
	
	

}
