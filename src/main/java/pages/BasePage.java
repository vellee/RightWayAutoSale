package pages;

import app.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    protected WebDriver driver = WebDriverSetup.getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 4);

    // find and click single web element by xpath
    public void clickElementByXpath(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    // find and click all found elements by xpath
    public void clickElementsByXpath(String xpath) {
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        for (WebElement webElement : webElementList) {
            webElement.click();
        }
    }

    // check if element(s) found by xpath are displayed
    public boolean isElementDisplayed(String xpath) {
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        return webElementList.size() > 0;
    }
}
