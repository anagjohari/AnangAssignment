package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.Driver;
import POM.*;

public class ShoppingCartTestCases {
	
	WebDriver driver;
  @Test
  public void EmptyCart() {
	  
	  try
	  {
	  Driver objDriver=new Driver("chrome");
	  driver=objDriver.GetDriver();
	  ShoppingCartPage page=HomePage.CheckShoppingCart(driver);
	  String message=page.VerifyEmptyCart(driver);
	  Assert.assertEquals(message,"Your cart is empty!");
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
