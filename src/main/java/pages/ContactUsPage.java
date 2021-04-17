package pages;

public class ContactUsPage extends BasePage {

    public static final String CONTACT_US_LOGO = "//h1[contains(text(),'Contact Us)]";
    public static final String GET_IN_TOUCH_INFO = "//div[@class='contact-right']";


    public boolean isContactUsLogoDisplayed() {
        return isElementDisplayed(CONTACT_US_LOGO);

    }

    public boolean isGetInTouchInfoDisplayed() {
        return isElementDisplayed(GET_IN_TOUCH_INFO);
    }

}
