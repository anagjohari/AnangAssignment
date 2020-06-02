package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import CommonClass.Driver;
import POM.HomePage;
import POM.LoginPage;

public class LoginTestCases {
  
	WebDriver driver;
		
  @Test
  public void LoginFlipkart() {
	  
	  try
	  {
	  Driver objDriver=new Driver("chrome");
	  driver=objDriver.GetDriver();
	  HomePage homePage=LoginPage.LogintoFlipkart(driver);
	  String displayUser=homePage.VerifyHomePage(driver);
	  System.out.println(displayUser);
	  Assert.assertEquals(displayUser,"James");
	  }
	  catch(Exception ex)
	  {
		  Assert.fail();
	  }
	  finally
	  {
		 driver.close();
		  
	  }
	 
	  
	  
	  
  }
}
