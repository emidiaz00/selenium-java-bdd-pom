Feature: Test Automation search functionality
  @Regresion

  @AutPracticeTest
  Scenario: As a user I enter a search dress in automation practice
    Given I am on the Automation search page
    When I enter a search criteria in field
    And click on the search button dress
    And add product to cart
    Then verify the product cart added

    Scenario: As a new user I want register
      Given I am on the Automation page
      When I click on the Sign in
      And I send email address to create an account
      Then fill the fields to create an account