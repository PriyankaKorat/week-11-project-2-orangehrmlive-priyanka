package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘Base Test’.
 */
public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        //Open browser
        driver = new ChromeDriver();
        //Open bseUrl
        driver.get(baseUrl);
        //maximize browser
        driver.manage().window().maximize();
        //Implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser() {
        driver.quit();
    }
}
