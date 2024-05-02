@Regression @Moneyyy
Feature: Login and test user profile and then log out

  Background:
    Given User clicks on Login button
    When User enter "supervisor" and "tek_supervisor" and click on Sign In
    When User clicks on profile button

  Scenario: Navigate to customer service portal
    And all profile side drawer must be correct "STATUS:Active, USER TYPE:CSR, FULL NAME:Supervisor, USERNAME:supervisor, AUTHORITIES:admin"

  Scenario: Navigate to the Profile Side Drawer
    When User clicks on Logout Button
    Then Validate the top left of homepage displays "TEK Insurance App"
