@Regression @Accounts

Feature: Validate the Number of Pages Shown on Accounts Page are Correct


  Background: Setup the Account Page Tests
    When User clicks on Login button
    When User enter "supervisor" and "tek_supervisor" and click on Sign In
    When User navigates to Accounts Page
@Accounts_1
  Scenario: Validate Rows in Account Page
    Then Validate default rows are "5"
    Then Validate 5 rows are displayed
@Accounts_2
  Scenario: Change Row Count Per Page and Validate
    When User Changes Row Count to "10" Rows Per Page
    Then Validate 10 rows are displayed
    When User Changes Row Count to "25" Rows Per Page
    Then Validate 25 rows are displayed
    When User Changes Row Count to "50" Rows Per Page
    Then Validate 50 rows are displayed