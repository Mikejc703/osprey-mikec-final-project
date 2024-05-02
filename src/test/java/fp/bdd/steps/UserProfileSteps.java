package fp.bdd.steps;

import fp.bdd.pages.customerServicePortal;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UserProfileSteps extends SeleniumUtilities {

    @When("User clicks on profile button")
    public void click_on_profile_btn() {
        clickElement(customerServicePortal.PROFILE_BUTTON);
    }



   @Then("all profile side drawer must be correct {string}")
   public void allProfileSideDrawerMustBeCorrect(String info) {
       String profileInfo = getElementText(customerServicePortal.PROFILE_INFO);
       String profileSort = profileInfo.replaceAll(profileInfo,"STATUS:Active, USER TYPE:CSR, FULL NAME:Supervisor, USERNAME:supervisor, AUTHORITIES:admin");
       Assert.assertEquals(profileSort,info);
       System.out.println(profileSort);
   }
   @When("User clicks on Logout Button")
    public void clickOnLogoutButton(){
        clickElement(customerServicePortal.LOGOUT_BUTTON);
   }
}

