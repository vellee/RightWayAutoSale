package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryPageDefifnitions {

    private final InventoryPage inventoryPage;

    public InventoryPageDefifnitions() {
        inventoryPage = new InventoryPage();

    }

    @Then("verify that Inventory logo is loaded and visible")
    public void verifyInventoryLogoVisible() {
        assertTrue(inventoryPage.isInventoryLogoDisplayed());
    }

    @And("verify that Search Car Header is loaded")
    public void verifySearchHeaderLoaded() {
        assertTrue(inventoryPage.isRefineSearchHeaderDisplayed());
    }

    @And("verify that Refine Search Header is loaded")
    public void verifyRefineSearchHeader() {
        assertTrue(inventoryPage.isRefineSearchHeaderDisplayed());
    }

}
