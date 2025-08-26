Feature: User Registration

  As a new user
  I want to register on the website
  So that I can create an account successfully

  Scenario Outline: Successful registration with valid details
    Given the user is on the registration page
    When the user enters "<firstName>" as first name
    And the user enters "<lastName>" as last name
    And the user enters "<phone>" as phone number
    When the user provides "<email>" as email

    And the user enters "<address>" as street address
    And the user enters "<city>" as city
    And the user enters "<state>" as state
    And the user enters "<postalCode>" as postal code
    And the user selects "<country>" as country
    And the user enters "<username>" as username
    And the user enters "<password>" as password
    And the user enters "<confirmPassword>" as confirm password
    And the user clicks on registration submit button

    Then the registration should be successful

  Examples:
    | firstName | lastName | phone       | email              | address          | city     | state | postalCode | country        | username   | password     | confirmPassword |
    | John      | Doe      | 9876543210  | johndoe@gmail.com  | 123 Main Street  | New York | NY    | 10001      | UNITED STATES  | johndoe123 | Password123  | Password123     |
    | Alice     | Smith    | 9998887776  | alice@gmail.com    | 45 Park Avenue   | Boston   | MA    | 02118      | INDIA          | alice2025  | Test@123     | Test@123        |
