package fp.bdd.steps;

import fp.bdd.pages.createAccount;
import fp.bdd.pages.homePage;
import fp.bdd.pages.signUp;
import fp.bdd.utility.DataGeneratorUtility;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {

    private String generatedRandomEmail;
@Given("User clicks on Create Primary Account Button")
    public void click_on_create_account(){
        clickElement(homePage.CREATE_ACC_BUTTON);
    }

@Then("Validate the title of the form is {string}")
public void validate_new_acc_form_title(String expectedTitle) {

    String actualTitle = getElementText(createAccount.NEW_ACC_FORM_TITLE);

    Assert.assertEquals(expectedTitle, actualTitle);
    }

@When("User fills out Create Account Form with List of Map Data Table")
    public void fill_out_create_acc_form(DataTable dataTable) {
    List<Map<String, String>> data = dataTable.asMaps();

    Map<String, String> dataMap  = data.get(0);

    String email = dataMap.get("email");
    String firstName = dataMap.get("firstName");
    String gender = dataMap.get("gender");
    String employmentStatus = dataMap.get("employmentStatus");
    String titlePrefix = dataMap.get("titlePrefix");
    String lastName = dataMap.get("lastName");
    String maritalStatus = dataMap.get("maritalStatus");
    String DOB = dataMap.get("DOB");

    generatedRandomEmail = DataGeneratorUtility.randomEmail(email);

    sendTextToElement(createAccount.EMAIL_INPUT, generatedRandomEmail);
    sendTextToElement(createAccount.FIRST_NAME_INPUT, firstName);
    dropdownSelectionByValue(createAccount.GENDER_DROPDOWN, gender);
    sendTextToElement(createAccount.EMPLOYMENT_STATUS_INPUT, employmentStatus);
    dropdownSelectionByValue(createAccount.TITLE_PREFIX_DROPDOWN, titlePrefix);
    sendTextToElement(createAccount.LAST_NAME_INPUT, lastName);
    dropdownSelectionByValue(createAccount.MARITAL_STATUS_DROPDOWN, maritalStatus);
    sendTextToElement(createAccount.DOB_INPUT, DOB);
    }

@When("User clicks on Create Account Button")
    public void click_on_create_new_acc_button() {
    clickElement(createAccount.CREATE_ACC_BUTTON);
}

@Then("User will navigate to Sign Up Your Account page")
    public void validate_form_title(){

    boolean isDisplayed = isElementDisplayed(signUp.SIGN_UP_YOUR_ACC_TITLE);
    Assert.assertTrue(isDisplayed);
}

@Then("Validate the email shown is correct")
    public void validate_displayed_email() {

    String actualEmail = getElementText(signUp.DISPLAYED_EMAIL);
    Assert.assertEquals(generatedRandomEmail, actualEmail);

}

@When("User fills out Create Account Form with an Existing Email through a List of Map Data Table")
    public void fill_out_acc_form_with_existing_email(DataTable dataTable) {
    List<Map<String, String>> data = dataTable.asMaps();

    Map<String, String> dataMap  = data.get(0);

    String email = dataMap.get("email");
    String firstName = dataMap.get("firstName");
    String gender = dataMap.get("gender");
    String employmentStatus = dataMap.get("employmentStatus");
    String titlePrefix = dataMap.get("titlePrefix");
    String lastName = dataMap.get("lastName");
    String maritalStatus = dataMap.get("maritalStatus");
    String DOB = dataMap.get("DOB");

    sendTextToElement(createAccount.EMAIL_INPUT, email);
    sendTextToElement(createAccount.FIRST_NAME_INPUT, firstName);
    dropdownSelectionByValue(createAccount.GENDER_DROPDOWN, gender);
    sendTextToElement(createAccount.EMPLOYMENT_STATUS_INPUT, employmentStatus);
    dropdownSelectionByValue(createAccount.TITLE_PREFIX_DROPDOWN, titlePrefix);
    sendTextToElement(createAccount.LAST_NAME_INPUT, lastName);
    dropdownSelectionByValue(createAccount.MARITAL_STATUS_DROPDOWN, maritalStatus);
    sendTextToElement(createAccount.DOB_INPUT, DOB);
}

@Then("Validate the error message {string}")
public void errorMessageShouldPupUp(String existingEmail) {
    String existEmailError = getElementText(createAccount.ERROR_MESSAGE);
    String actualError = existEmailError.replaceAll("ERROR\n","");
    System.out.println(actualError);
    Assert.assertEquals(actualError,existingEmail);
}

}


