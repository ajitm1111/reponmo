package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {
	
	WebDriver driver;
	
	@Before("@login")
	public void setup() {
		
		
		
	}
	
	@Given("^I navigate to the application URL$")
	public void I_navigate_to_the_application_URL() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		
	}
	
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void I_enter_Username_as_username_and_Password_as_password_into_the_fields(String username,String password){
		
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		
	}
    @And("^I click on Login button$")
	public void I_click_on_Login_button() {
    	
    	driver.findElement(By.cssSelector("input[value='Login']")).click();
    	
    }
	
	@Then("^User should login based on \"([^\"]*)\" login status$")
	public void User_should_login_based_on_expected_login_status(String expectedResult) {
		
		String actualResult = null;
		
		try {
		Alert alert = driver.switchTo().alert();
		
		
		if(alert.getText().contains("Error Password or Username")) {
			
			actualResult = "failure";
			
		}
		}catch(Exception e ) {
			
			actualResult = "success";
		
		}
		Assert.assertEquals(expectedResult, actualResult);
		
		driver.quit();
	}
    @After("@login")
	public void tearDown() {
		
		
		
	}
	
	
	
}
