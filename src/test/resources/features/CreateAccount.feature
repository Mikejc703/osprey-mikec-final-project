@Regression @CreateAccount
  Feature: Create New Account on Insurance App

    @CreateNewAccount
    Scenario: Navigate to Create Account Form Page
      Given User clicks on Create Primary Account Button
      Then Validate the title of the form is "Create Primary Account Holder"