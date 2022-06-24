package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaForgotPage;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class ForgotPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void Browser() {
		driver= Browser.openBrowser();
	}
	
	@Test
	public void LoginValidCredential() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage Login = new ZerodhaLoginPage(driver);
		String userName = Parametrization.getData(0, 1);
		String password = Parametrization.getData(1, 1);
		Login.enterUserID(userName);
		Login.enterPassword(password);
		Login.clickOnLogin();
	}
	
	@Test
	public void forgotPasswordTest() throws InterruptedException, EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage =new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgt();
		
		Thread.sleep(3000);
		
		ZerodhaForgotPage zerodhaForgotPage = new ZerodhaForgotPage(driver);
		String userName= Parametrization.getData(3, 1);
		String pan = Parametrization.getData(4, 1);
		String Email = Parametrization.getData(5, 1);
		zerodhaForgotPage.enterUserID(userName);
		zerodhaForgotPage.enterPAN(pan);
		zerodhaForgotPage.enterEmailID(Email);
	//	zerodhaForgotPage.clickOnBackToLogin();
	}
	
}



