package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
               
	           public static WebDriver openBrowser () {
			
	       // 	 WebdriverManager.chromedriver().Setup();
	        
	        	   WebDriverManager.chromedriver().setup();
	    //       System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   driver.get("https://kite.zerodha.com/");
			   driver.manage().window().maximize();
			   return driver;
			   
				}
}
