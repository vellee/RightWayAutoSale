package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MainPage;

import static org.junit.jupiter.api.Assertions.*;


public class MainPageDefinitions {

    private final MainPage mainPage;


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


}
