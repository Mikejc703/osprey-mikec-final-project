package fp.bdd.steps;

import fp.bdd.pages.customerServicePortal;
import fp.bdd.pages.plans;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PlansPageSteps extends SeleniumUtilities {

    WebDriver driver = getDriver();

    @When("User navigates to Plans page")
    public void click_on_plans_button() {
        clickElement(customerServicePortal.PLANS_BUTTON);
    }

    @Then("Validate {int} Rows are present")
    public void count_plan_page_rows(int expectedRows) {
        List<WebElement> tableRows = getElement(driver, plans.PLANS_PAGE_ROW_COUNT);
        Assert.assertEquals(tableRows.size(), expectedRows);
        System.out.println(tableRows.size());

    }

    @Then("Validate Creation Date is todays date")
    public void validate_creation_date() {
        String creationDate = getElementText(plans.CREATION_DATE);
        ZoneId easternTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime currentDate = ZonedDateTime.now(easternTimeZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        Assert.assertEquals(formattedDate, creationDate);
    }

    @Then("Validate Expiration Date is a day after creation date")
    public void validate_expiration_date() {
        ZoneId easternTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime currentDate = ZonedDateTime.now(easternTimeZone);
        ZonedDateTime nextDay = currentDate.plusDays(1);
        System.out.println(nextDay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate = nextDay.format(formatter);
        String expirationDate = getElementText(plans.EXPIRATION_DATE);
        Assert.assertEquals(expirationDate, formattedDate);
    }
}
