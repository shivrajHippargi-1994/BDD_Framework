Feature: Login to Application 

Scenario: Successful Login with valid Credentials
		Given User Launch Chrome Browser
		When User open URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and password as "admin"
		And Click on Login 
		Then Page Title Should be "Dashboard / nopCommerce administration"
		When User click on Logout link
		Then Page URL should contains "login"
		And Close browser

Scenario Outline: Login Test with Data Driven
		Given User Launch Chrome Browser
		When User open URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as <email> and password as <password>
		And Click on Login 
		Then Page Title Should be "Dashboard / nopCommerce administration"
		When User click on Logout link
		Then Page URL should contains "login"
		And Close browser
		
		Examples:
				| email | password |
				| admin@yourstore.com | admin |
				| admin@mystore	|	shiv123 |
		