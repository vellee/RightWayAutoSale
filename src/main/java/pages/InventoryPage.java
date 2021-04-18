package pages;

public class InventoryPage extends BasePage {
    public static final String INVENTORY_LOGO = "//h1[contains(text(),'View Inventory')]";
    public static final String SEARCH_CAR_HEADER = "//h2[contains(text(),'Search Car')]";
    public static final String REFINE_SEARCH_HEADER = "//div[contains(text(),'Refine Your Search:')]";

    public static final String FILTER_YEAR_2015 = "//a[contains(text(),'2015') and @class='lnk']";

    public static final String FILTER_ENGINE_4CYL = "//a[contains(text(),'4 Cylinder Engine') and @class='lnk']";
    public static final String FILTER_ENGINE_6CYL = "//a[contains(text(),'6 Cylinder Engine') and @class='lnk']";
    public static final String FILTER_ENGINE_8CYL = "//a[contains(text(),'8 Cylinder Engine') and @class='lnk']";

    public static final String FILTER_MAKE_VW = "//a[contains(text(),'Volkswagen') and @class='lnk']";
    public static final String FILTER_MAKE_MITSUBISHI = "//a[contains(text(),'Mitsubishi') and @class='lnk']";
    public static final String FILTER_MAKE_HYUNDAI = "//a[contains(text(),'Hyundai') and @class='lnk']";

    public static final String BTN_MORE_LESS = "//a[@class='eziSeeMoreLess']";

    public boolean isInventoryLogoDisplayed() {
        return isElementDisplayed(INVENTORY_LOGO);

    }

    public boolean isSearchCarHeaderDisplayed() {
        return isElementDisplayed(SEARCH_CAR_HEADER);
    }

    public boolean isRefineSearchHeaderDisplayed() {
        return isElementDisplayed(REFINE_SEARCH_HEADER);
    }

    public boolean isFilterVWDisplayed() {
        return isElementDisplayed(FILTER_MAKE_VW);
    }

    public boolean isFilterMitsubishiDisplayed() {
        return isElementDisplayed(FILTER_MAKE_MITSUBISHI);
    }

    public boolean isFilterHyundaiDisplayed() {
        return isElementDisplayed(FILTER_MAKE_HYUNDAI);
    }

    public boolean areBTN_MoreLessDisplayed() {
        return isElementDisplayed(BTN_MORE_LESS);
    }

    public boolean isFilterYear2015Displayed() {
        return isElementDisplayed(FILTER_YEAR_2015);
    }

    public boolean isFilterEngine4Displayed() {
        return isElementDisplayed(FILTER_ENGINE_4CYL);
    }

    public boolean isFilterEngine6Displayed() {
        return isElementDisplayed(FILTER_ENGINE_6CYL);
    }

    public boolean isFilterEngine8Displayed() {
        return isElementDisplayed(FILTER_ENGINE_8CYL);
    }
}
