package pageFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement usernameTxtBox;
	@FindBy(id = "password")
	WebElement passwordTxtBox;
	@FindBy(id = "login-button")
	WebElement loginButton;
	@FindBy(className ="app_logo")
	WebElement landingPageLogo;
	

	public void enterUsername(String username) {
		usernameTxtBox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void isLandingPageLogoDisplayed() {
		landingPageLogo.isDisplayed();
	}

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
