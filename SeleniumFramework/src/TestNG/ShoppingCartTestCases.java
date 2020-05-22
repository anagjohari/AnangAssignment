package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonClass.Driver;
import POM.*;

public class ShoppingCartTestCases {
	
	final WebDriver driver=Driver.GetDriver();
  @Test
  public void EmptyCart() {
	  
	  try
	  {
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
