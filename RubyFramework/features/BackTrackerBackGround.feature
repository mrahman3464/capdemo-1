Feature: Administration Work
  As an Admin of the Bug Tracker Application
  I want to Add a User, Edit a User and Remove an User


  Background:
    Given User navigate to Bug Tracker App Login Page
    When User Sing In to Bug tracker with Valid Credentials

  Scenario: Add a New User
    Given User is logged in to the Bug Tracker Application As an Admin
    When  Admin Add A New User
    Then a successful message will be displayed

  Scenario: Edit An Existing User
    Given User is logged in to the Bug Tracker Application As an Admin
    When Admin Edit a User
    Then a successful message will be displayed

  Scenario: Delete An Existing User
    Given User is logged in to the Bug Tracker Application As an Admin
    When Admin Delete a User
    Then a successful message will be displayed