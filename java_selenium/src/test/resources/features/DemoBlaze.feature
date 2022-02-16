Feature: Login on the page Demo Blaze

  @Regresion

  @DemoBlaze
    Scenario Outline: As a user I want login on the demoblaze page
    Given I am on the DemoBlaze page
    When I click on login
    And verify that login is visible
    Then fill the field <username> and <password> of login
    And click on button login
    And verify that account has been created
    Examples:

    |    username                |   password     |
    |    emildsn01@gmail.com     |   password1    |
    |    emildsn02@gmail.com     |   password2    |
    |    emildsn03@gmail.com     |   password43   |
    |    emildsn04@gmail.com     |   password4    |