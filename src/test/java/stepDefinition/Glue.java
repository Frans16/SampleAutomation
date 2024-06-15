package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Glue {
	static WebDriver driver;
	
	@Given("User is on login site {string}")
	public void user_is_on_login_site(String siteUrl) {
		//System.setProperty("webdriver.edge.driver","src\\test\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		//important step
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		
		driver.navigate().to(siteUrl);
	}
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		WebElement inputUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
		inputUsername.sendKeys(username);
	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
		inputPassword.sendKeys(password);
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@id='login-button']"));
		buttonLogin.click();
	}
	@Then("User has successfully logged in")
	public void user_has_successfully_logged_in() {
	   System.out.println("User has successfully logged in");
	   driver.close();
	   driver.quit();
	}
}
