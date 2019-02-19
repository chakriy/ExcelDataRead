Feature: Testing Multiple Logins in Facebook
  Scenario: Reading Multiple Login Ids from Excel with HashMap
    Given U r in facebook login page
    When Getting Values From Excel and Feeding to Facebook Login
    Then Check Whether Logging in to Facebook And quit
