Feature: Add Customer validation

  Scenario: feild validation
    Given user should be in telecom home page
    And user need to click on add customer button
    When user need to fill all the feilds
    And user should click on submit button
    Then user should be displayed customer id is generated

  Scenario: feild validation by using 1D List
    Given user should be in telecom home page
    And user need to click on add customer button
    When user need to fill all the feilds by oneDim List
      | parthi | rajan | pr@gmail.com | ambatur | 12345678 |
    And user should click on submit button
    Then user should be displayed customer id is generated

  Scenario: feild validation by using 1D Map
    Given user should be in telecom home page
    And user need to click on add customer button
    When user need to fill all the feilds by oneDim Map
      | fname | parthi          |
      | lname | rajan           |
      | mail  | rajan@gmail.com |
      | addr  | avadi           |
      | phno  |         2345555 |
    And user should click on submit button
    Then user should be displayed customer id is generated
