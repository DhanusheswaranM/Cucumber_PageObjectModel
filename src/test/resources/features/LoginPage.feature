Feature: Login to HRM application

@ValidCredentials
Scenario: Login with valid credentials

	Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	When User enters username and password
	Then User should be able to login successfully and new page open