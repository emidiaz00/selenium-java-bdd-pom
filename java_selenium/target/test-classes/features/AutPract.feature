Feature: Test Automation search functionality
  @Regresion

  @AutPracticeTest
  Scenario: As a user I enter a search dress in automation practice
    Given I am on the Automation search page
    When I enter a search criteria in field
    And click on the search button dress
    And add product to cart
    Then verify the product cart added