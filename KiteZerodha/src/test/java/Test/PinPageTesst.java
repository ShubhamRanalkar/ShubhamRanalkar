package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTesst 

    {      
		WebDriver driver;
	    
	@BeforeMethod
	public void Browser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void loginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username = Parametrization.getData(0, 1);
		String password = Parametrization.getData(1, 1);
		zerodhaLoginPage.enterUserID(username);
		zerodhaLoginPage.enterPassword(password);
	    zerodhaLoginPage.clickOnLogin();
	
	
		Thread.sleep(3000);
		
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		
		String pin = Parametrization.getData(2, 1);
	//	System.out.println(pin);
		zerodhaPinPage.enterPin(pin);
		zerodhaPinPage.clickOnContinue();
	}	
}
