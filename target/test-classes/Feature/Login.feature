Feature: Verifying facebook login page

  Scenario: login should be in facebook
    Given use should be in facebook login page
    When user should enter the name and user password
    And user should select the login button
    Then user should successful verify login is succcessful
