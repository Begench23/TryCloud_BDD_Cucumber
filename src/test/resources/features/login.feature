Feature: As a user, I should be able to log in.

  Background:
    Given user logins to the home page

  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | User12   | Userpass123 |
      | user42   | Userpass123 |
      | user72   | Userpass123 |
      | user102  | Userpass123 |