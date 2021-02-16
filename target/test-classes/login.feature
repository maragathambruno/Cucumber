Feature: To validate the login functionality scenario

  Background: 
    Given User has to launch the browser and hit FB url

  @Smoke
  Scenario: To verify login functionality with valid username and password in Facebook
    When user has to enter the username and password
      | username   | password |
      | maragatham |    12345 |
      | bruno      |    54321 |
    And click the login button
    Then user can able to enter the home page

  @Sanity
  Scenario: to validate the forgot password link
    When user has to click the forgot password link
    And user has to enter the mobile number
    Then user has to navigate the OTP page
