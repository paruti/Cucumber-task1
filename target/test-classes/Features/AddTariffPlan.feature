Feature: Add Tariff Plan

@smoke
  Scenario: field validation
    And user need to click on add tariff plan
    When user need to fill all the required details
    And user should click on submit button in Tariff details
    Then tariff plan added details should be displayed

@sanity
  Scenario: field validation by using 1D list
    And user need to click on add tariff plan
    When user need to fill all the required details by oneDim list
      | 6000 | 5000 | 400 | 300 | 600 | 700 | 800 |
    And user should click on submit button in Tariff details
    Then tariff plan added details should be displayed

@regression
  Scenario: field validation by using 1D map
    And user need to click on add tariff plan
    When user need to fill all the required details by oneDim map
      | mlyrental   | 700 |
      | frlmins     | 600 |
      | frimins     | 300 |
      | frspack     | 500 |
      | lpminscrgs  | 200 |
      | intminscrgs | 300 |
      | smsprcrgs   | 800 |
    And user should click on submit button in Tariff details
    Then tariff plan added details should be displayed
