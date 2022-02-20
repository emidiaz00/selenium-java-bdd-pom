Feature: Login on the page Demo Blaze

  @Regresion

  @DemoBlaze
    Scenario Outline: As a user I want sign up on the demoblaze page
    Given I am on the DemoBlaze page
    When I click on sign up
    And verify that login is visible
    Then fill the field <username> and <password> of login
    And click on button login

    Examples:

    |    username                |   password     |
    |    emildsn01@gmail.com     |   password1    |
    |    emildsn02@gmail.com     |   password2    |
    |    emildsn03@gmail.com     |   password43   |
    |    emildsn04@gmail.com     |   password4    |