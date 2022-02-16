Feature: Test Google search functionality

  @Regresion

    @GoogleSearch
  Scenario Outline: As a user I enter a search criteria in Google
    Given I am on the Google search page
    When I enter a search <criteria>
    And click on the search button
    Then the <results> match the criteria
    Examples:
      | criteria      |  results            |
      #|Hola Mundo   | HolaMundo - YouTube   |
      | Selenium Java | HolaMundo - YouTube |

    @SeleniumJavaSearch
    Scenario Outline: As a user I enter a search udemy in Google and into the page
      Given I am on the Google search page
      When I enter search <word> on the input
      And click on the search button
      And click on the link page
      And verify that see sucessfully home page udemy
      Examples:
        | word      |
        | Udemy     |

      





    

