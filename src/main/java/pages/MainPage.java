package pages;

public class MainPage extends BasePage {

    public static final String LOGO = "//img[@src='/frontend/assets/images/logo/web-logo.png']";
    public static final String MAIN_SLIDER = "//div[@class='slider-items']";
    public static final String ABOUT_US_LINK_TOP_MENU = "//a[text()='About Us']";
    public static final String CONTACT_US_LINK_TOP_MENU = "//a[text()='Contact Us']";
    public static final String INVENTORY = "//a[text()='Inventory']";


    // navigate to Main page
    public void navigateToMainPage(String url) {
        driver.get(url);
    }

    // check if Logo of website is displayed
    public boolean isLogoDisplayed() {
        return isElementDisplayed(LOGO);
    }

    // check if Slider on Main page is displayed
    public boolean isMainSliderDisplayed() {
        return isElementDisplayed(MAIN_SLIDER);
    }

    // click on About Us link from top menu
    public AboutUsPage clickAboutUsButton() {
        clickElementByXpath(ABOUT_US_LINK_TOP_MENU);
        return new AboutUsPage();
    }

    // click on Contact Us link from top menu
    public ContactUsPage clickContactUsButton() {
        clickElementByXpath(CONTACT_US_LINK_TOP_MENU);
        return new ContactUsPage();
    }

    // click on Inventory link from top menu
    public InventoryPage clickInventoryButton() {
        clickElementByXpath(INVENTORY);
        return new InventoryPage();
    }
}


