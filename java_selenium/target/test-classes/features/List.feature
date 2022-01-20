Feature: Test list page
@TestList
  Scenario: As a tester automation, I want to validate that a text is present inside the list.
    Given I navigate to the list page
    When I search the list
    Then I can find the text in the list