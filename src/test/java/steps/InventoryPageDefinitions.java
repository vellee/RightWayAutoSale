package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryPageDefinitions {

    private final InventoryPage inventoryPage;

    public InventoryPageDefinitions() {
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

    @Then("verify that Engine 4Cyl is visible")
    public void verifyFilter4CylVisible() {
        assertTrue(inventoryPage.isFilterEngine4Displayed());
    }

    @And("verify that Engine 6Cyl is visible")
    public void verifyFilter6CylVisible() {
        assertTrue(inventoryPage.isFilterEngine6Displayed());
    }

    @And("verify that Engine 8Cyl is visible")
    public void verifyFilter8CylVisible() {
        assertTrue(inventoryPage.isFilterEngine8Displayed());
    }

    @Then("verify that MAKE VW is visible")
    public void verifyFilterMakeVWVisible() {
        assertTrue(inventoryPage.isFilterVWDisplayed());
    }

    @And("verify that MAKE MITSUBISHI is visible")
    public void verifyFilterMakeMitsubishiVisible() {
        assertTrue(inventoryPage.isFilterMitsubishiDisplayed());
    }

    @And("verify that MAKE HYUNDAI is visible")
    public void verifyFilterMakeHyundaiVisible() {
        assertTrue(inventoryPage.isFilterHyundaiDisplayed());
    }

    @Then("verify that YEAR 2015 is visible")
    public void verifyFilterYear2015Visible() {
        assertTrue(inventoryPage.isFilterYear2015Displayed());
    }

    @Then("verify that Button MORE is visible")
    public void verifyBTNMoreVisible() {
        assertTrue(inventoryPage.areBTN_MoreDisplayed());
    }

    @Then("verify that Button LESS is visible")
    public void verifyBTNLessVisible() {
        assertTrue(inventoryPage.areBTN_LessDisplayed());
    }

    @Then("verify that Body Type Sedan is visible")
    public void verifyBodyTypeSedanIsVisible() {
        assertTrue(inventoryPage.isFilterBodySedanDisplayed());
    }

    @And("verify that Body Type Wagon is visible")
    public void verifyBodyTypeWagonIsVisible() {
        assertTrue(inventoryPage.isFilterBodyWagonDisplayed());
    }

    @And("verify that Body Type SUV is visible")
    public void verifyBodyTypeSUVIsVisible() {
        assertTrue(inventoryPage.isFilterBodySUVDisplayed());
    }

}
