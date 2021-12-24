Feature: Login into TutorialsNinja application 


@All @ninja
Scenario: Login to the application using valid credentials

	Given I navigates to login page of the application
	When I enter Username "ajitmulik23@gmail.com" and Password "Ajit%1111"into the fields
	And  I Click on the Login button
	Then I the User should successfully login