package fp.bdd.steps;

import fp.bdd.pages.createAccount;
import fp.bdd.pages.homePage;
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
    //Extract first row Data
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

}
