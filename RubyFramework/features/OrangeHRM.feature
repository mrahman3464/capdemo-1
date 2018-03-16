Feature: As a user I should be able to login to OrangeHRM Application and test different functionality

  Scenario: Login
    Given User navigate to OrangeHRM Login Page
    When User Login to the application


  Scenario: Simple Web App API Testing
    Given the client authenticate with username and password
    Given User Send A Get HTTP Request
    Then User verify the response code