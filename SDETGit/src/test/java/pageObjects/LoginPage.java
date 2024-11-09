package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By userNameTxtBox = By.id("user-name");
	By passwordTxtBox = By.id("password");
	By loginButton = By.id("login-button");
	By landingPageLogo = By.className("app_logo");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {
		driver.findElement(userNameTxtBox).clear();
		driver.findElement(userNameTxtBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTxtBox).clear();
		driver.findElement(passwordTxtBox).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void isLandingPageLogoPresent() {
		driver.findElement(landingPageLogo);
	}
	
	public void loginUser(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLoginButton();
		
	}
	

}
