Feature: Login to the omayo application

@All
Scenario Outline: User should only be able to login with valid credentials
Given I navigate to the application URL
When I enter Username as "<username>" and Password as "<password>" into the fields
And I click on Login button 
Then User should login based on "<expected>" login status
Examples:
|username		    |password	|expected	|
|arun    		    |1234 	  |failure   	|
|SeleniumByArun	|Test143$	|success	|
|motoori		    |pswd2		|failure 		|
