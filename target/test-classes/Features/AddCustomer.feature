@smoke1
Feature: Add Customer validation

Background:
    And user need to click on add customer button

@smoke @karthi
  Scenario: feild validation
    When user need to fill all the feilds
    And user should click on submit button
    Then user should be displayed customer id is generated

@sanity
  Scenario: feild validation by using 1D List
    When user need to fill all the feilds by oneDim List
      | parthi | rajan | pr@gmail.com | ambatur | 12345678 |
    And user should click on submit button
    Then user should be displayed customer id is generated

@regression
  Scenario: feild validation by using 1D Map
    When user need to fill all the feilds by oneDim Map
      | fname | parthi          |
      | lname | rajan           |
      | mail  | rajan@gmail.com |
      | addr  | avadi           |
      | phno  |         2345555 |
    And user should click on submit button
    Then user should be displayed customer id is generated

@smoke1
  Scenario: feild validation by using 2D List
    Given user should be in telecom home page
    And user need to click on add customer button
    When user need to fill all the feilds by twoDim List
      | parthi   | rajan | pr@gmail.com | ambatur | 12345678 |
      | karthi   | rajan | kr@gmail.com | pvi     | 12345678 |
      | java     | rajan | jr@gmail.com | madurai | 12345678 |
      | selenium | rajan | ar@gmail.com | trichy  | 12345678 |
    And user should click on submit button
    Then user should be displayed customer id is generated


@sanity1
  Scenario: feild validation by using 2D Map
    When user need to fill all the feilds by twoDim Map
      | fname    | lname | email        | address | phno     |
      | parthi   | rajan | pr@gmail.com | ambatur | 12345678 |
      | karthi   | rajan | kr@gmail.com | pvi     | 12345678 |
      | java     | rajan | jr@gmail.com | madurai | 12345678 |
      | selenium | rajan | ar@gmail.com | trichy  | 12345678 |
    And user should click on submit button
    Then user should be displayed customer id is generated

@regression1
  Scenario Outline: 
    When user need to fill all the feilds "<fname>","<lname>","<email>","<address>","<phno>"
    And user should click on submit button
    Then user should be displayed customer id is generated

    Examples: 
      | fname    | lname | email        | address | phno     |
      | parthi   | rajan | pr@gmail.com | ambatur | 12345678 |
      | karthi   | rajan | kr@gmail.com | pvi     | 12345678 |
      | java     | rajan | jr@gmail.com | madurai | 12345678 |
      | selenium | rajan | ar@gmail.com | trichy  | 12345678 |
