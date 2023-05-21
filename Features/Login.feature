Feature: Login

Scenario: Successful Login with Valid Credentials
	Given User Launch chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User click on Log out link
	Then Page title should be "Your store. Login"
	And close browser
	




	
	