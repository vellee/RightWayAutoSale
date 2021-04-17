Feature: Right Way Auto Sale About Us page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/about-us' page

  Scenario: navigate to About Us and verify some elements
    Then verify that About Us logo is loaded and visible
    And verify that About Us image is loaded
