@sanity
Feature: Login functionality

  Scenario: Login with multiple users
    Given User is on the login page
    When user enters credentials
      | username | password  |
      | Admin    | admin123  |
    And user clicks on the login button
    Then user is naqvigated to home page
