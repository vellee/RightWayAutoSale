Feature: Right Way Auto Sale Main page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/' page

  Scenario: navigate to main page and verify some elements
    Then verify that main logo is loaded and visible
    And verify that main slider is loaded

