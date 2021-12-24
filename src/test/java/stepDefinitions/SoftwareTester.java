package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" software tester$")          //dont give space bet $ and text
	 public void I_am_a_good_software_tester(String testerType) {
		
		System.out.println(">> - I am a "+testerType+" software tester");
		
		
	}
	 @When("^I go to work$")
	    public void i_go_to_work()  {
		 
			System.out.println(">> - I go to work");

	 }

	 @And("^I \"([a-zA-Z]{1,})\" with it$")
	    public void i_involve_with_it(String workType)  {
	       
			System.out.println(">> - I "+workType+"  with it");
           
	    }
	 
	 @Then("^My boss \"([a-zA-Z]{1,})\" me$")
	    public void my_boss_loves_me(String bossReaction)  {
	      
			System.out.println(">>My boss - I "+bossReaction+"  me");

		 
	    }
	 
	 
	 
	 
	 
}
