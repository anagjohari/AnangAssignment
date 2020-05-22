package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.Driver;
import CommonClass.UserDetails;
import POM.*;
public class MyProfileTestCases {
	
final WebDriver driver=Driver.GetDriver();
  @Test
  public void UpdateMyProfile() {
	  
	  try
	  {
	  
	  MyProfilePage myProfile=HomePage.MyProfileLandingPage(driver);
	  String updatedProfileName=myProfile.VerifyUpdatedProfile(driver); 
	  System.out.println(updatedProfileName);
	  Assert.assertEquals(updatedProfileName,"Testing");
	  }
	  catch(Exception ex)
	  {
		  Assert.fail();
		  
	  }
	  finally {
		
		driver.close();  
	  
	}
	  
  }
}
