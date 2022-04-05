@ELMINUR
Feature: As a user, I should be able to access to Files module.
  Background:user login with valid credentials
    Given user logins to the home page as default
    Then verify the user should be at the dashboard page


  Scenario: verify users can access to Files module
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA.”

  Scenario: verify users can select all the uploaded files from the page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected