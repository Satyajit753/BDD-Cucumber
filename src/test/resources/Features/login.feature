Feature: Login Functionality
  As a user
  I want to log in
  So that I can access my account

  Background: 
    Given User is on the login page

  @regression
  Scenario: Verify login with single credentials
    When user enters username "Admin" and password "admin123"
    And user clicks on the login button
    Then user should see the home page

  @sanity
  Scenario: Login with multiple users
    When user enters credentials
      | username | password  |
      | Admin    | admin123  |
      | Admin    | admin123  |
    And user clicks on the login button
    Then user should see the home page
