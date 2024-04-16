Feature: Login to the Insurance App
  Scenario: Login into Tek Insurance app with Valid Credentials
  Given User clicks on Login button
  When  User enter "supervisor" and "tek_supervisor" and click on Sign In
  Then Validate the user navigates to the Customer Service Portal   