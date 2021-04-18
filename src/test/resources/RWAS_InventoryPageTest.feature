Feature: Right Way Auto Sale Inventory page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/inventory' page

  Scenario: navigate to Inventory by clicking element on Main page and verify some elements
    Then verify that Inventory logo is loaded and visible
    And verify that Search Car Header is loaded
    And verify that Refine Search Header is loaded

