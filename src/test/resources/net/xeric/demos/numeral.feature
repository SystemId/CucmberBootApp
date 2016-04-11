Feature: Numeral Feature

  Scenario: Convert Number to Roman Numeral
  Given I am on the demo page
  When I place the number 5
  Then the numeral is V

  Scenario: Convert 0 to Roman Numeral
    Given I am on the demo page
    When I place the number 0
    Then the numeral is Invalid

  Scenario: Negative Roman Numeral
    Given I am on the demo page
    When I place the number -10
    Then the numeral is Invalid