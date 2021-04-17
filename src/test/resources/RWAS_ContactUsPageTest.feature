Feature: Right Way Auto Sale Contact Us page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/contact-us' page

  Scenario: navigate to Contact Us by clicking element on Main page and verify some elements
    Then verify that Contact Us logo is loaded and visible
    And verify that GET-IN-TOUCH info is loaded
