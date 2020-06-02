package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.Driver;
import POM.*;
public class MyProfileTestCases {
	
  WebDriver driver;
  @Test
  public void UpdateMyProfile() {
	  
	  try
	  {
	  Driver objDriver=new Driver("chrome");
	  driver=objDriver.GetDriver();
	  MyProfilePage myProfile=HomePage.MyProfileLandingPage(driver);
	  String updatedProfileName=myProfile.VerifyUpdatedProfile(driver).trim(); 
	  System.out.println(updatedProfileName);
	  Assert.assertEquals(updatedProfileName,"Demo Larson");
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