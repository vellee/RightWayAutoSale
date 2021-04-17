package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUsPage;
import pages.MainPage;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsPageDefinitions {

    private final ContactUsPage contactUsPage;

    public ContactUsPageDefinitions() {
        contactUsPage = new ContactUsPage();
    }

    @Then("verify that Contact Us logo is loaded and visible")
    public void verifyContactUsLogoIsVisible() {
        assertTrue(contactUsPage.isContactUsLogoDisplayed());
    }

    @And("verify that GET-IN-TOUCH info is loaded")
    public void verifyGetInTouchInfoIsVisible() {
        assertTrue(contactUsPage.isGetInTouchInfoDisplayed());
    }


}
