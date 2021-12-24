package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Login {
	WebDriver driver;
	
	@Before("@ninja")
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	 @Given("^I navigates to login page of the application$")
	    public void i_navigates_to_login_page_of_the_application()  {
		 
		 driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	 
	 }
	 
	 @When("^I enter Username \"([^\"]*)\" and Password \"([^\"]*)\"into the fields$")
	    public void i_enter_username_something_and_password_somethinginto_the_fields(String emailadress, String password)  {
		 
		 driver.findElement(By.id("input-email")).sendKeys(emailadress);
		 driver.findElement(By.id("input-password")).sendKeys(password);
		 
	 }
		 
	  @And("^I Click on the Login button$")
	    public void i_click_on_the_login_button() {
	      
		  driver.findElement(By.cssSelector("input[value='Login']")).click();
		  
	    }
		 
	  @Then("^I the User should successfully login$")
	    public void i_the_user_should_successfully_login() {
	        
		  WebElement accountBreadcrumb = null;
		  
		  try {
		  accountBreadcrumb = driver.findElement(By.xpath("//*[@class='breadcrumb']//a[text()='Account']"));
		  
		  }catch(Exception e) {
			  
			  System.out.println("Login has failed");
		  }
		  
		 // Assert.assertNotNull("Login has failed", accountBreadcrumb);
		  Assert.fail();
		  
	    }

		 
		 
		 
		 
		 
		 
		 
		 
	 }
	       