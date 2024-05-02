package fp.bdd.pages;

import org.openqa.selenium.By;

public class customerServicePortal {
    public static final By CUSTOMER_SERVICE_PORTAL = By.xpath("//h2[text()='Customer Service Portal']");
    public static final By PROFILE_BUTTON = By.xpath("//button[@aria-label='profile']");
    public static final By PROFILE_STATUS = By.xpath("//div[@role='dialog']//p/span/span[text()='Active']");
    public static final By PROFILE_USER_TYPE = By.xpath("//div[@role='dialog']//div/p[text()='CSR']");
    public static final By PROFILE_FULL_NAME = By.xpath("//div[@role='dialog']//div/p[text()='Supervisor']");
    public static final By PROFILE_USERNAME = By.xpath("//div[@role='dialog']//div/p[text()='supervisor']");
    public static final By PROFILE_AUTHORITIES = By.xpath("//div[@role='dialog']//ul/li[text()='admin']");

    public static final By PROFILE_INFO = By.xpath("//div[@class='chakra-stack css-6phkm9']");

    public static final By LOGOUT_BUTTON = By.xpath("//div/button[text()='Logout'] ");
    public static final By ACCOUNTS_BUTTON = By.xpath("//a[@href='/csr/accounts']");
    public static final By PLANS_BUTTON = By.xpath("//a[contains(@href,'/csr/plans')]");

}
