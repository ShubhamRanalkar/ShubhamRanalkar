package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {

	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement userID;
	@FindBy(xpath="//input[@placeholder='PAN']") private WebElement  PAN;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']") private WebElement Email;
	@FindBy(xpath="//button[@type='submit']") private WebElement Reset;
	@FindBy(xpath="//a[@class=\"text-xsmall text-light reset-account-button\"]") private WebElement BackToLogin;
	
   public ZerodhaForgotPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }

   public void enterUserID(String user) {
	   userID.sendKeys(user);
   }

   public void enterPAN(String pan) {
	   PAN.sendKeys(pan);
   }
   
   public void enterEmailID(String email) {
	   Email.sendKeys(email);
   }
   
   public void clickOnReset() {
	   Reset.click();
   }
   
   public void clickOnBackToLogin() {
	   BackToLogin.click();
   }
}
