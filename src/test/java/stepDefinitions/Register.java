package stepDefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	
	
     WebDriver driver;
	
	@Before("@register")
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
		
	 @Given("^I navigates to Registration page$")
	    public void i_navigates_to_registration_page()  {
	        
		 driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	    }
	 
	 @When("^I provies the following details into the input fields$")
	    public void i_provies_the_following_details_into_the_input_fields(DataTable data){
		 
		 Map<String, String> dataMap = data.asMap(String.class,String.class);
	 
	        
		 driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
		 driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
		 driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
		 driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("Telephone"));
		 driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
		 driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
		 
		 
	    }
	 
	 @And("^I Selects the privacy policy option$")
	    public void i_selects_the_privacy_policy_option()  {
	      
		 driver.findElement(By.name("agree")).click();
	    }

	// @And("^I Clicks on Continue button$")
	   // public void i_clicks_on_continue_button() {
		 
		// driver.findElement(By.cssSelector("input[value='Continue'][class='btn btn-primary']")).click();
	 //}


	   // @Then("^I should get successfully registered$")
	  //  public void i_should_get_successfully_registered() {
	    	
	    	
	    	
	   // }
}
