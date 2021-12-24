Feature: Register for Tuutorialsninja 

@register
Scenario: Register an account with valid details
	Given I navigates to Registration page
	When I provies the following details into the input fields 
		|firstName|arun											|
		|lastName |motoori									|
		|email		|arun.motoori@yahoo.co.in	|
		|Telephone|12345678							    |
		|password	|SeleniumTester$					|
	And I Selects the privacy policy option
	#And I Clicks on Continue button
	#Then I should get successfully registered