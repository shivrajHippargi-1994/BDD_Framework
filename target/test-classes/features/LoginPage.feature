Feature: Login to Application 

Scenario: Successful Login with valid Credentials
		Given User Launch Chrome Browser
		When User open URL "https://admin-demo.nopcommerce.com/login"
		And User enters Email as "admin@yourstore.com" and password as "admin"
		And Click on Login 
		Then Page Title Should be "Dashboard / nopCommerce administration"
		When User click on Logout link
		Then page Title should be "Your store. Login"
		And Close browser
          |