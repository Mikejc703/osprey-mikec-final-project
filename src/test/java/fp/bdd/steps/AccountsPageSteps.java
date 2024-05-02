package fp.bdd.steps;

import fp.bdd.pages.customerServicePortal;
import fp.bdd.pages.primaryAccounts;
import fp.bdd.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountsPageSteps extends SeleniumUtilities {

    WebDriver driver = getDriver();

    @When("User navigates to Accounts Page")
    public void click_on_accounts_button() {
        clickElement(customerServicePortal.ACCOUNTS_BUTTON);
    }

    @Then("Validate default rows are {string}")
    public void validate_default_row_number_selected(String defaultRowsNum) {
        dropdownSelectionByValue(primaryAccounts.NUM_PAGES_DROPDOWN, defaultRowsNum);
    }

    @Then("Validate {int} rows are displayed")
    public void count_account_page_rows(int expectedRows) {
        List<WebElement> tableRows = getElement(driver, primaryAccounts.ACC_PAGE_ROW_COUNT);
        Assert.assertEquals(tableRows.size(), expectedRows);
        System.out.println(tableRows.size());
    }

    @When("User Changes Row Count to {string} Rows Per Page")
    public void change_row_count(String desiredRowCount) {
        dropdownSelectionByValue(primaryAccounts.NUM_PAGES_DROPDOWN, desiredRowCount);
    }
}
