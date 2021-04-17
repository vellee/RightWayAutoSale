package app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSetup {

    private static WebDriver driver; // creates instance of WebDriver class

    public static void startWebDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); // initializes new chrome driver
            driver.manage().window().maximize(); // maximizes Chrome browser window
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  // sets default timer for waiting elements loading to 2 sec

        }
    }
}
