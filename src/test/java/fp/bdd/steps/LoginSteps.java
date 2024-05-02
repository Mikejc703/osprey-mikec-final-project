package fp.bdd.steps;

import fp.bdd.pages.createAccount;
import fp.bdd.pages.customerServicePortal;
import fp.bdd.pages.homePage;
import fp.bdd.pages.login;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends SeleniumUtilities {

    @Given("User clicks on Login button")
    public void click_on_login_btn() {
        clickElement(homePage.LOGIN_BUTTON);
    }

    @When("User enter {string} and {string} and click on Sign In")
    public void sign_in(String username, String password) {
        sendTextToElement(login.USERNAME_INPUT, username);
        sendTextToElement(login.PASSWORD_INPUT, password);
        clickElement(login.CLICK_ON_LOGIN);
    }
    @Then("Validate the user navigates to the {string}")
    public void validate_navigation_to_csp(String expectedTitle) {
        String actualTitle = getElementText(customerServicePortal.CUSTOMER_SERVICE_PORTAL);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Login with invalid user credentials {string} and {string}")
    public void login_with_invalid_credentials(String username, String password) {
        sendTextToElement(login.USERNAME_INPUT, username);
        sendTextToElement(login.PASSWORD_INPUT, password);

    }
    @And("Click on sign in button")
    public void click_on_sign_in() {
        clickElement(login.CLICK_ON_LOGIN);
    }
    @Then("Validate the error message as expected {string}")
    public void validate_the_error_message(String expectedErrorMessage) {
        String existingLoginError = getElementText(login.ERROR_MESSAGE);
        String actualErrorMessage = existingLoginError.replaceAll("ERROR\n","");
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }
}
