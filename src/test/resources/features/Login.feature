@Regression @Login

Feature: Login to the Insurance App
  Scenario: Login into Tek Insurance app with Valid Credentials
  Given User clicks on Login button
  When  User enter "supervisor" and "tek_supervisor" and click on Sign In
  Then Validate the user navigates to the "Customer Service Portal"
@Login_1
  Scenario: Login with invalid username credential
    Given User clicks on Login button
    When Login with invalid user credentials "WrongUsername" and "tek_supervisor"
    And Click on sign in button
    Then Validate the error message as expected "User WrongUsername not found"
  @Login_2
  Scenario: Login with invalid password credential
    Given User clicks on Login button
    When Login with invalid user credentials "supervisor" and "WrongPassword"
    And Click on sign in button
    Then Validate the error message as expected "Password not matched"