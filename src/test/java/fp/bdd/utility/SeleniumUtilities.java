package fp.bdd.utility;

import fp.bdd.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait;
    }
    public String getElementText(By locator) {
        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
        return text;
    }
    public void clickElement(By locator){
        getWait().until(
                        ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
    public void sendTextToElement(By locator, String text) {
        getWait().until(
                        ExpectedConditions.visibilityOfElementLocated(locator))
                .sendKeys(text);
    }
    public void dropdownSelectionByValue(By locator, String value) {
        WebElement dropdown = getDriver().findElement(locator);
        Select selectValue = new Select(dropdown);
        selectValue.selectByValue(value);

    }
    public boolean isElementDisplayed(By locator) {
        return getWait().until(ExpectedConditions
                        .visibilityOfElementLocated(locator))
                .isDisplayed();
    }
}
