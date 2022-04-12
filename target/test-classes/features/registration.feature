Feature: Validating registration page functionality

Scenario: validate user is able to validate regitser page title
Given User is already on landing page
When User clicks on register link
Then User should be able to see "Register Account" as page title

Scenario: Validate the registration process
Given User is already on registration page
When User enters following details
|hemant|dhavle|hemantd123@gmail.com|798878899|1231|1231|
When User clicks on continue button
Then Registration should be "Your Account Has Been Created!" displayed as success message
