package pages;

public class InventoryPage extends BasePage {
    public static final String INVENTORY_LOGO = "//h1[contains(text(),'View Inventory')]";
    public static final String SEARCH_CAR_HEADER = "//h2[contains(text(),'Search Car')]";
    public static final String REFINE_SEARCH_HEADER = "//div[contains(text(),'Refine Your Search:')]";

    public boolean isInventoryLogoDisplayed() {
        return isElementDisplayed(INVENTORY_LOGO);

    }

    public boolean isSearchCarHeaderDisplayed() {
        return isElementDisplayed(SEARCH_CAR_HEADER);
    }

    public boolean isRefineSearchHeaderDisplayed() {
        return isElementDisplayed(REFINE_SEARCH_HEADER);
    }

}
