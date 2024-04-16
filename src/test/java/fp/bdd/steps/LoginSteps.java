package fp.bdd.steps;

import fp.bdd.pages.homePage;
import fp.bdd.pages.login;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
}
