package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AboutUsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutUsPageDefinitions {
    private final AboutUsPage aboutUsPage;

    public AboutUsPageDefinitions() {
        aboutUsPage = new AboutUsPage();
    }

    @Then("verify that About Us logo is loaded and visible")
    public void verifyAboutUsLogoIsVisible() {
        assertTrue(aboutUsPage.isAboutUsLogoDisplayed());
    }

    @And("verify that About Us image is loaded")
    public void verifyGetInTouchInfoIsVisible() {
        assertTrue(aboutUsPage.isIMGAboutUsDisplayed());
    }
}
