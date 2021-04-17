Feature: Right Way Auto Sale Main page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/' page

  Scenario: navigate to main page and verify some elements
    Then verify that main logo is loaded and visible
    And verify that main slider is loaded

  Scenario: Navigate to the main page and click About Us option
    When User clicks About Us
    Then Verify that about us logo is displayed
    And Verify that about us img is displayed

  Scenario: Navigate to the main page and click Contact Us option
    When User clicks Contact Us
    Then Verify that contact us logo is displayed
    And Verify that contact us info is displayed