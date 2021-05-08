Feature: Right Way Auto Sale Inventory page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/inventory' page

  Scenario: navigate to Inventory by clicking element on Main page and verify some elements
    Then verify that Inventory logo is loaded and visible
    And verify that Search Car Header is loaded
    And verify that Refine Search Header is loaded

  Scenario Outline: navigate to Inventory by clicking element on Main page and verify FILTER BY ENGINE elements
    Then verify that Engine has <engine_cyl> is visible
#    And verify that Engine 6Cyl is visible
#    And verify that Engine 8Cyl is visible
    Examples:
      | engine_cyl |
      | "4 cyl"    |
      | "6 cyl"    |
#      | "8 cyl"    |

  Scenario Outline: navigate to Inventory by clicking element on Main page and verify FILTER BY MAKE elements
    Then verify that <make> is visible
    Examples:
      | make         |
      | "VW"         |
      | "MITSUBISHI" |
      | "HYUNDAI"    |
      | "KIA"        |
      | "CHEVROLET"  |
      | "DODGE"      |
      | "FORD"       |


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

#  Scenario: navigate to Inventory by clicking element on Main page and verify FILTER BODY TYPE elements
#    Then verify that Body Type Sedan is visible
#    And verify that Body Type Wagon is visible
#    And verify that Body Type SUV is visible

  Scenario: navigate to Inventory by clicking element on Main page and click FILTER YEAR 2015 element
    Then verify that FILTER YEAR 2015 applied

  Scenario: negative test navigate to Inventory by clicking element on Main page and check for FILTER YEAR 2015 element without clicking it
    Then  verify that FILTER YEAR 2015 is not applied

  Scenario: navigate to Inventory by clicking element on Main page and click Filter Sedan
    Then verify that FILTER Sedan applied

#  Scenario: navigate to Inventory by clicking element on Main page and click MAKE from sort menu
#    Then verify that sorting applied

  Scenario Outline: navigate to Inventory by clicking element on Main page and click different sort types
    Then verify specific sort type equals <name>
    Examples:
      | name      |
      | "YEAR"    |
      | "MAKE"    |
      | "PRICE"   |
      | "MILEAGE" |

  Scenario: navigate to Inventory by clicking element on Main page
    Then verify that VW Jetta is present
    And verify that VW Jetta has View Details Button
    And verify that the button is clickable
    When verify that Jetta Details page is loaded

  Scenario Outline: navigate to Inventory by clicking element on Main page and verify FILTER BODY TYPE elements
    Then verify that Filter <BodyType> is visible
    Examples:
      | BodyType        |
      | "Sedan"         |
      | "Wagon"         |
      | "SUV-Crossover" |
      | "Coupe-2-Door"  |
      | "Minivan-Van"   |
      | "Hatchback"     |