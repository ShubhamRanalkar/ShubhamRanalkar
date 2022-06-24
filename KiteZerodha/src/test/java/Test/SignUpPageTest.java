package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser;
import POM.ZeodhaSingUpPage;
import Utility.Parametrization;

public class SignUpPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void Browser() {
		driver= Browser.openBrowser();
	}
	
	@Test
	public void validSignUpClick() throws EncryptedDocumentException, IOException {
		ZeodhaSingUpPage signUpCreateAcc = new ZeodhaSingUpPage(driver);
		signUpCreateAcc.clickOnSignUp();//it is to open on sign up page
		
		ArrayList<String> list = new ArrayList<String> (driver.getWindowHandles());
		list.get(0);//this index for login page
		
		driver.switchTo().window(list.get(1));//this index for signup page
		
		String name = Parametrization.getData(6, 1);
		signUpCreateAcc.entermoNumber(name);
		signUpCreateAcc.cliclOnContinue();
	}
}
