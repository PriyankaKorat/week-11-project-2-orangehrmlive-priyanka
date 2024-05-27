package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forgot password link
        driver.findElement(By.xpath("//div//p[contains(@class,'orangehrm-login-forgot-header')]")).click();
        //Verify text
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("not redirected on forgot password page", expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
