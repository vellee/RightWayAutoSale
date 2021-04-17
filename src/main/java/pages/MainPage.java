package pages;

public class MainPage extends BasePage {

    public static final String LOGO = "//img[@src='/frontend/assets/images/logo/web-logo.png']";
    public static final String MAIN_SLIDER = "//div[@class='slider-items']";
    public static final String ABOUT_US_LINK_TOP_MENU = "//a[text()='About Us']";
    public static final String CONTACT_US_LINK_TOP_MENU = "//a[text()='Contact Us']";


    public void navigateToMainPage(String url) {
        driver.get(url);
    }

    public boolean isLogoDisplayed() {
        return isElementDisplayed(LOGO);
    }

    public boolean isMainSliderDisplayed() {
        return isElementDisplayed(MAIN_SLIDER);
    }

    public AboutUsPage clickAboutUsButton() {
        clickElementByXpath(ABOUT_US_LINK_TOP_MENU);
        return new AboutUsPage();
    }

    public ContactUsPage clickContactUsButton() {
        clickElementByXpath(CONTACT_US_LINK_TOP_MENU);
        return new ContactUsPage();
    }


}
