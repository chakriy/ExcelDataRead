Feature: Testing Multiple Logins in Facebook
  Scenario: Reading Multiple Login Ids from Excel without HashMap
    Given U r in Facebook login page
    When Getting Values From Excel and Feeding to facebook Login
    Then Check Whether Logging in to facebook And quit
