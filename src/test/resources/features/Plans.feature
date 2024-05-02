@Regression @JD

Feature: Validations on the Plans Page

  Scenario: Validate Four Rows of Data are Present
    Given User clicks on Login button
    When User enter "supervisor" and "tek_supervisor" and click on Sign In
    When User navigates to Plans page
    Then Validate 4 Rows are present

  Scenario: Validate Creation and Expiration Date
    Given User clicks on Login button
    When User enter "supervisor" and "tek_supervisor" and click on Sign In
    When User navigates to Plans page
    Then Validate Creation Date is todays date
    Then Validate Expiration Date is a day after creation date