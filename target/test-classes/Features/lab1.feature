Feature: Automation Practice Form Submission
  As a user
  I want to fill out the practice form
  So that I can test form submission functionality

  @FormTest
  Scenario: Successfully submit the practice form with valid details
    Given the user is on the automation practice form page
    When the user enters "Satyajit" as name
    And the user enters "pradhansatyajit@gmail.com" as email
    And the user selects gender "Male"
    And the user enters "9876543210" as mobile number
    And the user enters date of birth "14-08-2025"
    And the user enters "Maths" as subject
    And the user selects hobby "Reading"
    And the user uploads a file from "C:\\Users\\HP\\Downloads\\test-file.txt"
    And the user enters "xyz" as address
    And the user selects state "Uttar Pradesh"
    And the user selects city "Lucknow"
    And the user clicks on submit button
    Then the form should be submitted successfully
