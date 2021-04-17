package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AboutUsPage;
import pages.ContactUsPage;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.*;


public class MainPageDefinitions {

    private final MainPage mainPage;
    private ContactUsPage contactUsPage;
    private AboutUsPage aboutUsPage;

    public MainPageDefinitions() {
        mainPage = new MainPage();
    }

    @Given("User navigates to {string} page")
    public void User_Navigates_To_Main_Page(String url) {
        mainPage.navigateToMainPage(url);
    }

    @Then("verify that main logo is loaded and visible")
    public void verifyThatMainLogoIsLoadedAndVisible() {
        assertTrue(mainPage.isLogoDisplayed());
    }

    @And("verify that main slider is loaded")
    public void verifyThatMainSliderIsLoaded() {
        assertTrue(mainPage.isMainSliderDisplayed());
    }


    @When("User clicks About Us")
    public void userClicksAboutUs() {
        aboutUsPage = mainPage.clickAboutUsButton();
    }

    @Then("Verify that about us logo is displayed")
    public void verifyAboutLogoDisplayed() {
        assertTrue(aboutUsPage.isAboutUsLogoDisplayed());
    }

    @And("Verify that about us img is displayed")
    public void verifyAboutImgDisplayed() {
        assertTrue(aboutUsPage.isIMGAboutUsDisplayed());
    }

    @When("User clicks Contact Us")
    public void userClicksContactUs() {
        contactUsPage = mainPage.clickContactUsButton();
    }

    @Then("Verify that contact us logo is displayed")
    public void verifyContactLogoDisplayed() {
        assertTrue(contactUsPage.isContactUsLogoDisplayed());
    }

    @And("Verify that contact us info is displayed")
    public void verifyContactInfoDisplayed() {
        assertTrue(contactUsPage.isGetInTouchInfoDisplayed());
    }
}
