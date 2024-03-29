package pages;

import org.openqa.selenium.WebElement;

import java.util.List;

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
    public static final String FILTER_MAKE_KIA = "//a[contains(text(),'Kia') and @class='lnk']";
    public static final String FILTER_MAKE_CHEVROLET = "//a[contains(text(),'Chevrolet') and @class='lnk']";
    public static final String FILTER_MAKE_FORD = "//a[contains(text(),'Ford') and @class='lnk']";
    public static final String FILTER_MAKE_DODGE = "//a[contains(text(),'Dodge') and @class='lnk']";

    public static final String BTN_MORE = "//a[@class='eziSeeMoreLess' and contains(text(),'More')]";
    public static final String BTN_LESS = "//a[@class='eziSeeMoreLess' and contains(text(),'Less')]";

    public static final String FILTER_BODY_TYPE_SEDAN = "//a[text()='Sedan' and @class='lnk']";
    public static final String FILTER_BODY_TYPE_WAGON = "//a[text()='Wagon' and @class='lnk']";
    public static final String FILTER_BODY_TYPE_SUV_CROSSOVER = "//a[text()='SUV-Crossover' and @class='lnk']";
    public static final String FILTER_BODY_TYPE_COUPE = "//a[text()='Coupe-2-Door' and @class='lnk']";
    public static final String FILTER_BODY_TYPE_MINIVAN = "//a[text()='Minivan-Van' and @class='lnk']";
    public static final String FILTER_BODY_TYPE_HATCHBACK = "//a[text()='Hatchback' and @class='lnk']";

    public static final String FILTER_VALUE_YEAR = "//span[@class='filter_value' and text()='Year']";
    public static final String FILTER_VALUE_BODY = "//span[@class='filter_value' and text()='Body Type']";
    public static final String FILTER_VALUE_MAKE = "//span[@class='filter_value' and text()='Make']";
    public static final String FILTER_VALUE_ENGINE = "//span[@class='filter_value' and text()='Engine']";

    public static final String LIST_OF_CARS = "//div[@class='vehicle-listing']";
    public static final String SORT_MAKE = "//a[@data-sort='make_id']";
    public static final String SORT_YEAR = "//a[@data-sort='year_id']";
    public static final String SORT_PRICE = "//a[@data-sort='price']";
    public static final String SORT_MILEAGE = "//a[@data-sort='mileage']";

    public static final String VW_JETTA_2016 = "//div[@class='vehicle-listing' and @data-key='396']";
    public static final String VW_JETTA_2016_VIEW_BTN = "//a[@href='/inventory/2016-volkswagen-jetta/396' and @class='view-detail-btn ']";

    public static final String BACK_TO_INVENTORY_LINK = "//span[@class='backResLt' and text()='Back to Inventory']";
    public static final String JETTA_LOGO = "//h1[contains(text(),'2016 Volkswagen Jetta Sport | SAFETY CERTIFIED')]";
    public static final String JETTA_OVERVIEW = "//div[@class='col-md-12 vehicle-overview']";

    public boolean isInventoryLogoDisplayed() {
        return isElementDisplayed(INVENTORY_LOGO);
    }

    public boolean isSearchCarHeaderDisplayed() {
        return isElementDisplayed(SEARCH_CAR_HEADER);
    }

    public boolean isRefineSearchHeaderDisplayed() {
        return isElementDisplayed(REFINE_SEARCH_HEADER);
    }

//    public boolean isFilterVWDisplayed() {
//        return isElementDisplayed(FILTER_MAKE_VW);
//    }
//
//    public boolean isFilterMitsubishiDisplayed() {
//        return isElementDisplayed(FILTER_MAKE_MITSUBISHI);
//    }
//
//    public boolean isFilterHyundaiDisplayed() {
//        return isElementDisplayed(FILTER_MAKE_HYUNDAI);
//    }

    public boolean areBTN_MoreDisplayed() {
        return isElementDisplayed(BTN_MORE);
    }

    public boolean areBTN_LessDisplayed() {
        clickElementsByXpath(BTN_MORE);
        return isElementDisplayed(BTN_LESS);
    }

    public void clickBtnMore() {
        clickElementByXpath(BTN_MORE);
    }

    public boolean isFilterYear2015Displayed() {
        return isElementDisplayed(FILTER_YEAR_2015);
    }

//    public boolean isFilterEngine4Displayed() {
//        return isElementDisplayed(FILTER_ENGINE_4CYL);
//    }
//
//    public boolean isFilterEngine6Displayed() {
//        return isElementDisplayed(FILTER_ENGINE_6CYL);
//    }
//
//    public boolean isFilterEngine8Displayed() {
//        return isElementDisplayed(FILTER_ENGINE_8CYL);
//    }
//
//    public boolean isFilterBodySedanDisplayed() {
//        return isElementDisplayed(FILTER_BODY_TYPE_SEDAN);
//    }

//    public boolean isFilterBodyWagonDisplayed() {
//        return isElementDisplayed(FILTER_BODY_TYPE_WAGON);
//    }
//
//    public boolean isFilterBodySUVDisplayed() {
//        return isElementDisplayed(FILTER_BODY_TYPE_SUV_CROSSOVER);
//    }

    public boolean verifyEngineTypeVisible(String numOfCylinders) {
        boolean result;
        switch (numOfCylinders) {
            case ("4 cyl"):
                result = isElementDisplayed(FILTER_ENGINE_4CYL);
                break;
            case ("6 cyl"):
                result = isElementDisplayed(FILTER_ENGINE_6CYL);
                break;
            case ("8 cyl"):
                result = isElementDisplayed(FILTER_ENGINE_8CYL);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + numOfCylinders);
        }
        return result;

    }

    public boolean verifyFilterMakeVisible(String brand) {
        boolean result = switch (brand) {
            case ("VW") -> isElementDisplayed(FILTER_MAKE_VW);
            case ("MITSUBISHI") -> isElementDisplayed(FILTER_MAKE_MITSUBISHI);
            case ("HYUNDAI") -> isElementDisplayed(FILTER_MAKE_HYUNDAI);
            case ("KIA") -> isElementDisplayed(FILTER_MAKE_KIA);
            case ("FORD") -> isElementDisplayed(FILTER_MAKE_FORD);
            case ("CHEVROLET") -> isElementDisplayed(FILTER_MAKE_CHEVROLET);
            case ("DODGE") -> isElementDisplayed(FILTER_MAKE_DODGE);
            default -> throw new IllegalStateException("Unexpected value: " + brand);
        };
        return result;

    }


    public boolean isFilterBodyTypeDisplayed(String bodyType) {
        boolean result = switch (bodyType) {
            case ("Sedan") -> isElementDisplayed(FILTER_BODY_TYPE_SEDAN);
            case ("Wagon") -> isElementDisplayed(FILTER_BODY_TYPE_WAGON);
            case ("SUV-Crossover") -> isElementDisplayed(FILTER_BODY_TYPE_SUV_CROSSOVER);
            case ("Coupe-2-Door") -> isElementDisplayed(FILTER_BODY_TYPE_COUPE);
            case ("Minivan-Van") -> isElementDisplayed(FILTER_BODY_TYPE_MINIVAN);
            case ("Hatchback") -> isElementDisplayed(FILTER_BODY_TYPE_HATCHBACK);
            default -> throw new IllegalStateException("Unexpected value: " + bodyType);
        };
        return result;

    }

    public boolean clickYear2015() {
        clickElementByXpath(FILTER_YEAR_2015);
        return isElementDisplayed(FILTER_VALUE_YEAR);
    }

    public boolean clickSedanFilter() {
        clickElementByXpath(FILTER_BODY_TYPE_SEDAN);
        return isElementDisplayed(FILTER_VALUE_BODY);
    }


    public boolean isFilterValueYear2015Displayed() {
        return isElementDisplayed(FILTER_VALUE_YEAR);
    }

//    public boolean displayedListOfInventory() {
//        List<WebElement> initialList = listOfElementsDisplayed(LIST_OF_CARS);
//        clickElementByXpath(SORT_MAKE);
//        List<WebElement> sortedList = listOfElementsDisplayed((LIST_OF_CARS));
//        if (initialList == sortedList) {
//            return false;
//        } else return true;
//
//    }


    public boolean displayedListOfInventoryParam(String type) {
        List<WebElement> initialList = listOfElementsDisplayed(LIST_OF_CARS);
        boolean result;
        switch (type) {
            case "YEAR":
                clickElementByXpath(SORT_YEAR);
                result = compareTwoList(initialList);
                break;
            case ("MAKE"):
                clickElementByXpath(SORT_MAKE);
                result = compareTwoList(initialList);
                break;
            case ("PRICE"):
                clickElementByXpath(SORT_PRICE);
                result = compareTwoList(initialList);
                break;
            case ("MILEAGE"):
                clickElementByXpath(SORT_MILEAGE);
                result = compareTwoList(initialList);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return result;

    }

    public boolean compareTwoList(List initialList) {
        List<WebElement> sortedList = listOfElementsDisplayed(LIST_OF_CARS);
        return initialList != sortedList;
    }

    public boolean isVWJettaDisplayed() {
        return isElementDisplayed(VW_JETTA_2016);
    }

    public boolean isVWJettaViewDetailsBTNDisplayed() {
        return isElementDisplayed(VW_JETTA_2016_VIEW_BTN);
    }

    public void clickJettaDetails() {
        clickElementByXpath(VW_JETTA_2016_VIEW_BTN);
    }

    public boolean isJettaLogoVisible() {
        return isElementDisplayed(JETTA_LOGO);
    }

    public boolean isJettaOverviewVisible() {
        return isElementDisplayed(JETTA_OVERVIEW);
    }

    public boolean isBackToInventoryLinkVisible() {
        return isElementDisplayed(BACK_TO_INVENTORY_LINK);
    }

}
