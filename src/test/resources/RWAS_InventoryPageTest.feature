Feature: Right Way Auto Sale Inventory page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/inventory' page

  Scenario: navigate to Inventory by clicking element on Main page and verify some elements
    Then verify that Inventory logo is loaded and visible
    And verify that Search Car Header is loaded
    And verify that Refine Search Header is loaded

  Scenario: navigate to Inventory by clicking element on Main page and verify FILTER BY ENGINE elements
    Then verify that Engine 4Cyl is visible
    And verify that Engine 6Cyl is visible
    And verify that Engine 8Cyl is visible

  Scenario: navigate to Inventory by clicking element on Main page and verify FILTER BY MAKE elements
    Then verify that MAKE VW is visible
    And verify that MAKE MITSUBISHI is visible
    And verify that MAKE HYUNDAI is visible

  Scenario: navigate to Inventory by clicking element on Main page and verify FILTER YEAR elements
    Then verify that YEAR 2015 is visible

  Scenario: navigate to Inventory by clicking element on Main page and verify Button More element
    Then verify that Button MORE is visible

  Scenario: navigate to Inventory by clicking element on Main page and verify Button Less element
    Then verify that Button LESS is visible

  Scenario: navigate to Inventory by clicking element on Main page and verify FILTER BODY TYPE elements
    Then verify that Body Type Sedan is visible
    And verify that Body Type Wagon is visible
    And verify that Body Type SUV is visible

  Scenario: navigate to Inventory by clicking element on Main page and click FILTER YEAR 2015 element
    Then verify that FILTER YEAR 2015 applied

  Scenario: negative test navigate to Inventory by clicking element on Main page and check for FILTER YEAR 2015 element without clicking it
    Then  verify that FILTER YEAR 2015 is not applied

  Scenario: navigate to Inventory by clicking element on Main page and click Filter Sedan
    Then verify that FILTER Sedan applied
#    And verify that FILTER Wagon is not displayed
#    And verify that Filter SUV is not displayed