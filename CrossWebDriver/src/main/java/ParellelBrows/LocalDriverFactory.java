package ParellelBrows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalDriverFactory {

	public static WebDriver createInstance(String browserName) 
	 {
	        WebDriver driver = null;
	        if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
	        if (browserName.toLowerCase().contains("firefox")) 
	        {
	        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\geckodriver.exe");
	        	driver=new FirefoxDriver(); 
	        	return driver;
	        }
	        if (browserName.toLowerCase().contains("ie")) {
	        	System.setProperty("webdriver.ie.driver", "C:\\Users\\yogeshsolanki\\Desktop\\Selenium Test Setup\\drivers\\IEDriverServer.exe");
	        	driver=new InternetExplorerDriver(); 
	        	return driver;
	        }
	        return driver;
	    }
}
