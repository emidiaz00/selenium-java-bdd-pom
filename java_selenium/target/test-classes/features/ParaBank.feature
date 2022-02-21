Feature: Test ParaBank Login
  @ParaBankTest

  Scenario Outline: As a user I Login on the ParaBank page
    Given I am on the ParaBank page
    When I click on the register
    And fill the fields <firstname> and <lastname>
    And fill the fields <address> and <city>
    And fill the fields <state> and <zipcode>
    And fill the fields <phone> and <ssn>
    And fill the fields <username> and <password>
    And confirm <passConfirm>
    And click on the register button
    Then I register succesfully
    Examples:
      | firstname | lastname | address | city | state | zipcode | phone | username | password | passConfirm |
      | firstname | lastname | address | city | state | zipcode | phone | username | password | passConfirm |
      | firstname | lastname | address | city | state | zipcode | phone | username | password | passConfirm |
      | firstname | lastname | address | city | state | zipcode | phone | username | password | passConfirm |
      | firstname | lastname | address | city | state | zipcode | phone | username | password | passConfirm |



