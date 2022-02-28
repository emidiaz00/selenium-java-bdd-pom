Feature: Search on youtube

  @SearchYoutube
  Scenario Outline: As a user I want search word
    Given I am on the Youtube page
    When I enter search <word> on youtube
    And click button search youtube
    Then Verify that <results> is there
    Examples:
      |      word             |      results            |
      |   hola mundo setup    |   hola mundo setup    |
      |      word             |   hola mundo setup    |



