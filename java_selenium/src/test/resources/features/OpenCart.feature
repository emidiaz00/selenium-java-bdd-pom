Feature: Login on OpenCart

  Scenario Outline: As a user I want login on OpenCart
    Given I am on the Open Cart page
    When I click on my account and click on login
    And click on the continue button form
    And fill the fields <firstname> <lastname> <email> <telephone> <password> <passwordConfirm>
    Then verify that login was sucessfully
    Examples:
      | firstname | lastname | email | telephone | password | passwordConfirm |

