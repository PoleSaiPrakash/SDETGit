Feature: login page Automation of SauceDemo Application
@regression
Scenario Outline: Check login is successful with valid creds
Given User on login page
When User enter valid "<username>" and "<password>"
And Clicks on login Button
Then User is navigated to home page 
And Close the browser
Examples:
| username | password |
| standard_user | secret_sauce |
Scenario Outline: Check login is unsucceful with invalid creds
Given User on login page
When User enter invalid "<Username>" and "<Password>"
And Click on login Button
Then User should stay in login page
Then Error message should promtted
And Close the browser
Examples:
| Username | Password |
| locked_out_usegr | secret_sauce |
