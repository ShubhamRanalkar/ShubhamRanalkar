package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	 @FindBy(xpath="//input[@id='userid']") private WebElement UserID;
	 @FindBy(xpath="//input[@id='password']") private WebElement password;
	 @FindBy(xpath="//button[@type='submit']") private WebElement Login;
	 @FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	 @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUP;
	 

     public ZerodhaLoginPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
    	 }

     public void enterUserID (String user) {
    	 UserID.sendKeys(user);
     }
     
     public void enterPassword (String pass) {
    	 password.sendKeys(pass);
     }
     
     public void clickOnLogin() {
    	 Login.click();
     }
     
     public void clickOnForgt() {
    	 forgot.click();
     }
     
     public void clickOnsignUp() {
    	 signUP.click();
     }
     
}

















