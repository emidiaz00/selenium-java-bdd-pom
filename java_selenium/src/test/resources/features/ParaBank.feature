Feature: Test ParaBank Login
  @ParaBankTest

  Scenario: As a user I Login on the ParaBank page
    Given I am on the ParaBank page
    When I click on the register
    And fill the fields
    Then I register correctly