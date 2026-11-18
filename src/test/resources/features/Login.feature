Feature: Locate360 Telecaller Panel Login Functionality

  Background:
    Given user launches the Locate360 Telecaller Panel

  Scenario: Verify login page loads successfully
    Then login page should be displayed
    And Forgot Password should be visible

  Scenario: Verify password field is masked
    When user enters password "Locate@360"
    Then password should be masked

  Scenario: Verify valid login
    When user enters email "janarthanan.kiaq@gmail.com"
    And user enters password "Locate@360"
    And user clicks Sign In
    Then user should leave the login page
