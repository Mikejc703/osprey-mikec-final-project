@Regression @CreateAccount
  Feature: Create New Account on Insurance App

    @CreateNewAccount
    Scenario: Navigate to Create Account Form Page
      Given User clicks on Create Primary Account Button
      Then Validate the title of the form is "Create Primary Account Holder"

    @CreateNewAccount_2
    Scenario: Fill out Create Account Form and Create Account
      Given User clicks on Create Primary Account Button
      When User fills out Create Account Form with List of Map Data Table
        | email                | firstName   | gender   | employmentStatus | titlePrefix  | lastName | maritalStatus | DOB       |
        | student@tekschool.us | John        | MALE     | student          | Mr.          | Cena     | MARRIED       | 07/03/1999|
      When User clicks on Create Account Button
      Then User will navigate to Sign Up Your Account page
      Then Validate the email shown is correct

    @CreateNewAccount_3
    Scenario: Create Account with Existing Email and Validate Error Message
      Given User clicks on Create Primary Account Button
      When User fills out Create Account Form with an Existing Email through a List of Map Data Table
        | email                 | firstName   | gender   | employmentStatus | titlePrefix  | lastName | maritalStatus | DOB       |
        | JohnCena@tekschool.us | John        | MALE     | student          | Mr.          | Cena     | MARRIED       | 07/03/1999|
      When User clicks on Create Account Button
      Then Validate the error message "Account with email JohnCena@tekschool.us is exist"
