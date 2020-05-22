package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.Driver;
import CommonClass.ExcelReader;
import POM.HomePage;
import POM.LoginPage;

public class LoginTestCases {
  
	final WebDriver driver=Driver.GetDriver();
	
  @Test
  public void LoginFlipkart() {
	  
	  try
	  {
	  
	  HomePage homePage=LoginPage.LogintoFlipkart(driver);
	  String displayUser=homePage.VerifyHomePage(driver);
	  System.out.println(displayUser);
	  Assert.assertEquals(displayUser,"Testing");
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
