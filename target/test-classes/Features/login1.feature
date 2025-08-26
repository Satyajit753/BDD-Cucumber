Feature: Login Functionality

 # @regression
 # Scenario: Verify the login functionality for valid credentials
 #   Given User is on the login page
  #  When User enters the username
 #   And User enters the password
 #   And User clicks on the login button
 #   Then User is navigated to the home page
 


 
 
 #@regression
#Scenario Outline: Verify login with multiple credentials
  #Given User is on the login page
 # When user enters "<username>" and "<password>"
 # And user clicks on the login button
  #Then user should see "<expectedResult>"

#Examples:
  #| username | password  | expectedResult              |
 # | Admin    | admin123  | Home Page                   |
 # | wrong    | wrong123  | Invalid username or password |




#@regression

#Scenario: Verify the login functionality for valid credentials
#Given User is on the login page
#When user enters the username
#And user enters teh password
#And user clicks on the login button
#Then user is naqvigated to home page

Background: Given User is on the login page

#@regression
#Scenario: Verify the login functionality for valid credentials
 # When user enters the username
 # And user enters teh password
  #And user clicks on the login button
 # Then user is nagvigated to home page

  @regression
  Scenario Outline: Verify login with multiple credentials
    Given User is on the login page
    When user enters "<username>" and "<password>"
    And user clicks on the login button
    Then user should see the home page

    Examples:
      | username | password | 
      | Admin    | admin123 |                
      | Admin    | admin123 | 
      | Admin    | admin123 |


@sanity
Scenario: Login with multiple users
  When user enters credentials
    | username | password |
    | Admin    | admin123 |
    | Admin    | admin123 |
    | Admin    | admin123 |
  And user clicks on the login button
  Then user is nagvigated to home page