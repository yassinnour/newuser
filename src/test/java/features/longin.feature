Feature: Validate login functionality 
Background: 
	Given  User is On the Techfios Login Page  
Scenario: User should be able to login with valid credentials 
	When User inters username as 
	And User enters password 
	And User clicks on login button     
	Then User should be landing on dashboard page     