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
		Helper.ClearText(driver, "xpath",ElementsLoc.txtUserFirstName);
		Helper.InputText(driver, "xpath", ElementsLoc.txtUserFirstName,details.firstName);
		Helper.ClearText(driver, "xpath",ElementsLoc.txtUserLastName);
		Helper.InputText(driver, "xpath", ElementsLoc.txtUserLastName,details.lastName);
		Helper.Click(driver, "xpath", ElementsLoc.btnSaveProfile);
		if(Helper.isElementAvailable(driver, "xpath", ElementsLoc.successSaveProfile))
		{
		profileName=Helper.GetText(driver,"xpath",ElementsLoc.profileFullName);
		}	
		
		return profileName;
		}
		catch(Exception ex)
		{
		 
			return profileName;
			
		}
		
	}
	
	

}
