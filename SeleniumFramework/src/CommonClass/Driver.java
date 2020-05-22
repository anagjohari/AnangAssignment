package CommonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static WebDriver GetDriver()
	{
	
		try
		{
			  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  return driver;
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}
		
		
	
	}

}
