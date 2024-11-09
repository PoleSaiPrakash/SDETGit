package BackgroundStepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDefinitions {
//	static WebDriver driver;
//	String itemName;
//	
//	@Given("User on login page")
//	public void user_on_login_page() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	}
//
//	@Then("user should see the landing page")
//	public void user_should_see_the_landing_page() throws InterruptedException {
//		Thread.sleep(30);
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@When("User clicks on three menu bar")
//	public void user_clicks_on_three_menu_bar() {
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//	}
//
//	@Then("User should see the menu items")
//	public void user_should_see_the_menu_items() {
//		driver.findElement(By.id("react-burger-cross-btn")).click();
//	}
//
//	@When("User clicks on add to cart button")
//	public void user_clicks_on_add_to_cart_button() {
//		itemName = driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).getText();
//		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//	}
//
//	@Then("Item should be added to the cart")
//	public void item_should_be_added_to_the_cart() {
//		driver.findElement(By.id("shopping_cart_container")).click();
//		Assert.assertEquals(itemName,driver.findElement(By.className("inventory_item_name")).getText());
//	}

}
