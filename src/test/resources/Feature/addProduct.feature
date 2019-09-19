Feature: AddCustomerList 

Background: 
	Given User should be in the telecom home pages 
	And click add customer buttons 
	
@smoke
Scenario: 
	When User enter all the data. 
		| karthi | rajan | rajan@gmail.com | chennai | 6030025890 |
	And click on submit buttons 
	Then user should be displayed customer id is enteredd 
	
Scenario: 
	When User enter all the data for map. 
		| fname   | karthi          |
		| lname   | rajan           |
		| email   | rajan@gmail.com |
		| address | chennai         |
		| phno    |      6030025890 |
	And click on submit buttons 
	Then user should be displayed customer id is enteredd 
	