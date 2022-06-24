package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class ScreenShot {

        public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser();

//	       public static void main(String[] args) throws IOException {
//		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
//		   WebDriver driver = new ChromeDriver();//up casting Chrome driver class to WebDriver
//		   driver.get("https://vctcpune.com/selenium/practice.html");
	
	
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //getScen is method for  scht....temporary storage
		
		File desination = new File("C:\\Users\\Admin\\Documents\\Screenshot\\vct1.jpg");//temporary storage...permanent location given by us
		
		FileHandler.copy(source, desination);
		
		
		
		
	}
}
