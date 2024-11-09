package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactor.LoginPageFactory;

public class PageFactoryLoginStepsDefinition {
	static WebDriver driver;
	LoginPageFactory loginPageFactory;

	@Given("User on login page")
	public void user_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enter valid {string} and {string}")
	public void user_ente_valid_username_and_password(String username, String password) {
		loginPageFactory = new LoginPageFactory(driver);
		loginPageFactory.enterUsername(username);
		loginPageFactory.enterPassword(password);

	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() throws InterruptedException {
		Thread.sleep(30);
		loginPageFactory.clickOnLoginButton();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(30);
		loginPageFactory.isLandingPageLogoDisplayed();
	}

	@And("Close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(30);
		driver.close();
	}

	@When("User enter invalid {string} and {string}")
	public void user_enter_invalid_username_and_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Click on login Button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(30);
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User should stay in login page")
	public void user_should_stay_in_login_page() throws InterruptedException {
		Thread.sleep(30);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	}

	@And("Error message should promtted")
	public void error_message_should_promtted() {
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(),"Epic sadface: Username and password do not match any user in this service");
	}
	
	@AfterMethod
	public void tearMethod() {
		driver.quit();
	}

}
