package fp.bdd.steps;

import fp.bdd.pages.createAccount;
import fp.bdd.pages.homePage;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateAccountSteps extends SeleniumUtilities {

@Given("User clicks on Create Primary Account Button")
    public void click_on_create_account(){
        clickElement(homePage.CREATE_ACC_BUTTON);
    }
@Then("Validate the title of the form is {string}")
public void validate_new_acc_form_title(String expectedTitle) {

    String actualTitle = getElementText(createAccount.NEW_ACC_FORM_TITLE);

    Assert.assertEquals(expectedTitle, actualTitle);
    }
}
