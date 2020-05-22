package CommonClass;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
	
	private static WebElement ElementByLocator(WebDriver driver,String elementType,String locator)
	{
		WebElement element=null;
		try
		{
			if(elementType.toLowerCase().equals("id"))
			{
				element=driver.findElement(By.id(locator));
				
			}
			if(elementType.toLowerCase().equals("xpath"))
			{
				element=driver.findElement(By.xpath(locator));
				
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
	public static void Wait(int miliseconds)
	{
		try
		{
			Thread.sleep(miliseconds);
			
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

}
