package CommonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	static WebDriver driver;
	
	public  Driver(String browserName) 
	{
		try
		{
			String _browserName=browserName.toLowerCase();
			   switch (_browserName) {
				case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
				 driver=new ChromeDriver();	
				break;
							            
				default:
					break;
				}
				   
			 
			 	 
			
		}
		catch(Exception ex)
		{
			throw ex;
			
		}

	}
	
	public WebDriver GetDriver()
	{
		
		return driver;
		
		
	}

	




}
