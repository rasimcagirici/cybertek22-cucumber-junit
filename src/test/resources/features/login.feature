@regression @smoke
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: Assuming user is on the login page
    Given User is on the login page


  @librarian
  Scenario: Login as librarian
    When User enters librarian username
    And User enters librarian password
    Then User should see the dashboard

  @student
  Scenario: Login as student
    When User enters student username
    And User enters student password
    Then User should see the dashboard

  @admin
  Scenario: Login as admin
    When User enters admin username
    And User enters admin password
    Then User should see the dashboard