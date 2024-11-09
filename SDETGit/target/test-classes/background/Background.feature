Feature: Background test
Background: Users logs in to the Sauce Demo app
Given User on login page
When User enters valid username and password
Then user should see the landing page

Scenario: validate Menu Items

And User clicks on three menu bar
Then User should see the menu items

Scenario: Verify add cart functionality

And User clicks on add to cart button
Then Item should be added to the cart