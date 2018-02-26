package ParellelBrows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalDriverManager {
	private static ThreadLocal<WebDriver> webDriver=new ThreadLocal<WebDriver>();
	private static WebDriver driver = null;
	private LocalDriverManager()
	{
		
	}
	
	public static void initilize(String browser)
	{		
		 WebDriver dr = LocalDriverManager.createInstance(browser);
		 setWebDriver(dr);
	
	}
	public static WebDriver getDriver() 
	{
		if(driver==null)
		{
         driver= webDriver.get();
		}
		return driver;
    }
 
	public static void setWebDriver(WebDriver driver) {
		webDriver.set(driver);
    }
	public static WebDriver createInstance(String browserName) 
	 {
	       
	        if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
	        if (browserName.equalsIgnoreCase("firefox")) 
	        {
	        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\geckodriver.exe");
	        	driver=new FirefoxDriver(); 
	        	return driver;
	        }
	        if (browserName.equalsIgnoreCase("ie")) {
	        	System.setProperty("webdriver.ie.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\IEDriverServer.exe");
	        	driver=new InternetExplorerDriver(); 
	        	return driver;
	        }
	        return driver;
	    }
}
