package pages;

public class AboutUsPage extends BasePage {

    public static final String ABOUT_US_LOGO = "//h1[contains(text(),'About Us)]";
    public static final String IMG_ABOUT_US = "//img[@src='/uploads/content/1/9ee08c1887-about-us2.jpg']";


    public boolean isAboutUsLogoDisplayed() {
        return isElementDisplayed(ABOUT_US_LOGO);
    }

    public boolean isIMGAboutUsDisplayed() {
        return isElementDisplayed(IMG_ABOUT_US);

    }
}
