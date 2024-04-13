package fp.bdd.pages;

import fp.bdd.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class createAccount {

    public static final By NEW_ACC_FORM_TITLE = By.xpath("//*[text()='Create Primary Account Holder']");

    public static final By EMAIL_INPUT = By.xpath("//input[@name='email']");

    public static final By FIRST_NAME_INPUT = By.xpath("//input[@name='firstName']");

    public static final By GENDER_DROPDOWN = By.cssSelector("select#gender");

    public static final By EMPLOYMENT_STATUS_INPUT = By.cssSelector("input#employmentStatus");

    public static final By TITLE_PREFIX_DROPDOWN = By.cssSelector("select#title");

    public static final By LAST_NAME_INPUT = By.cssSelector("input#lastName");

    public static final By MARITAL_STATUS_DROPDOWN = By.cssSelector("select#maritalStatus");

    public static final By DOB_INPUT = By.cssSelector("input#dateOfBirth");

    public static final By CREATE_ACC_BUTTON = By.xpath("//button[@type='submit']");
}
