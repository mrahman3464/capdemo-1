Feature: Bug Tracker App
  Scenario: Admin Add A new User
    Given User navigate to Bug Tracker App Login Page
    When User Sing In to Bug tracker with Valid Credentials
    Given User is logged in to the Bug Tracker Application As an Admin
    When  Admin Add A New User
    #Then a successful message will be displayed
    Then Admin Logout form his account

    

    