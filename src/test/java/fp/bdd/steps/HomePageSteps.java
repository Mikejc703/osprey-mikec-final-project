package fp.bdd.steps;

import fp.bdd.pages.homePage;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps extends SeleniumUtilities {

    @Then("Validate the top left of homepage displays {string}")
    public void validateTopLeftCorner(String expectedTitle) {

        String actualTitle = getElementText(homePage.HOME_P_TITLE);

        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
