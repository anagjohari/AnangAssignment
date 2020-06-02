package CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Helper {
	
	private static WebElement ElementByLocator(WebDriver driver,String elementType,String locator)
	{
		WebElement element=null;
		try
		{
		   String ElementLocator=elementType.toLowerCase();
		   WebDriverWait wait=new WebDriverWait(driver, 20);
		   switch (ElementLocator) {
		case "id":
			element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			break;
			
		case "xpath":
			element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
            break;
            
		default:
			break;
		}
		   
		return element;
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
		
		
	}
	
	public static void Click(WebDriver driver,String elementIdentity,String locator)
	{
		try
		{
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			element.click();
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}
	
	public static void InputText(WebDriver driver,String elementIdentity,String locator,String inputText)
	{
		try
		{
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			element.sendKeys(inputText);
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}
	
	public static String GetText(WebDriver driver,String elementIdentity,String locator)
	{
		String innerText=null;
		try
		{
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			innerText=element.getText();
			return innerText;
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}
	
	public static void ClearText(WebDriver driver,String elementIdentity,String locator)
	{
		
		try
		{
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			element.clear();
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}
	
	public static boolean FinishLoading(WebDriver driver) {

	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    JavascriptExecutor js =(JavascriptExecutor) driver;

	    // wait for jQuery to load
	    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        try {
	          return ((Long)js.executeScript("return jQuery.active") == 0);
	        }
	        catch (Exception e) {
	          return true;
	        }
	      }
	    };

	 
	    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	        return js.executeScript("return document.readyState")
	            .toString().equals("complete");
	      }
	    };

	  return wait.until(jQueryLoad) && wait.until(jsLoad);
	}
	
    public static void MoveToElement(WebDriver driver,String elementIdentity,String locator)
	{
		try
		{
			Actions actions = new Actions(driver);
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			actions.moveToElement(element).perform();	
		}
		catch(Exception ex)
		{
			
			
		}
		
		
	}
    
	public static void NavigateURL(WebDriver driver,String url)
    {
		try
		{
		 driver.manage().window().maximize();
		 driver.navigate().to(url);
		 
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
    	
    	
    
}

	public static void RefreshPage(WebDriver driver)
	{
		
		try
		{
			driver.navigate().refresh();
			
			
		}
		catch(Exception ex)
		{
			
			throw ex;
		}
		
		
		
	}
	
	public static Boolean isElementAvailable(WebDriver driver,String elementIdentity,String locator)
	{
		Boolean flag=false;
		try
		{
			WebElement element=ElementByLocator(driver, elementIdentity, locator);
			if(element.isDisplayed())
			{
				flag=true;
				
			}
			else 				
				{
					flag=false;
					
				}
			
			return flag;
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}
	
	public static void ClickThroughJavaScript(WebDriver driver,String elementIdentity,String locator)
	{
		try
		{
			 WebElement element=ElementByLocator(driver, elementIdentity, locator);
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", element);
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
		
	}
	
    public static int GetElementsCount(WebDriver driver,String elementIdentity,String locator)
	{
		int count=0;
		try
		{
			String ElementLocator=elementIdentity.toLowerCase();
		
			 switch (ElementLocator) {
				case "id":
					count=driver.findElements(By.id(locator)).size();
					break;
					
				case "xpath":
					count=driver.findElements(By.xpath(locator)).size();
		            break;
		            
				default:
					count=0;
					break;
			 }
			 
			 return count;
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
		
	}
	
	

}
