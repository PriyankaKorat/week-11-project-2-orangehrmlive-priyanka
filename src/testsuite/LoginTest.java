package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter valid user name
        driver.findElement(By.name("username")).sendKeys("Admin");
        //enter valid password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click on login button
        driver.findElement(By.cssSelector(".oxd-button")).click();
        //verify text
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h6")).getText();
        Assert.assertEquals("Not login successfully", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
