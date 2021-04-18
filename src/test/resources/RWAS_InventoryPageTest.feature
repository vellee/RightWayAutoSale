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