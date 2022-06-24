package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class LoginPageTest {

	WebDriver driver;
	
  @BeforeMethod
  public void browser() {
	  driver=Browser.openBrowser();
  }
  @Test
  public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
	  ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	  String userName = Parametrization.getData(1, 0);
	  String password = Parametrization.getData(1, 1);
	  zerodhaLoginPage.enterUserID(userName);
	  zerodhaLoginPage.enterPassword(password);
	  zerodhaLoginPage.clickOnLogin();
  }
  
  @Test
  public void forgotPasswordLinkTest() {
	  ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	  zerodhaLoginPage.clickOnForgt();
  }
  @Test
  public void signupLinkTest()
     {
	  ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	  zerodhaLoginPage.clickOnsignUp();
  }
}
