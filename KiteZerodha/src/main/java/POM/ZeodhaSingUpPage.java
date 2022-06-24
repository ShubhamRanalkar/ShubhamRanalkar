package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeodhaSingUpPage {
 
	@FindBy(xpath="//a[@class='text-light']") private WebElement SignUp;
	@FindBy(xpath="//input[@id='user_mobile']") private WebElement moNumber;
	@FindBy(xpath="//button[@type='submit']") private WebElement submit;
	
	public ZeodhaSingUpPage(WebDriver driver) {
		PageFactory.initElements (driver , this);
	}
	
	public void clickOnSignUp() {
		SignUp.click();
	}

	public void entermoNumber(String mobile) {
		moNumber.sendKeys(mobile);
	}
	
    public void cliclOnContinue() {
    	submit.click();
    }
	
}
