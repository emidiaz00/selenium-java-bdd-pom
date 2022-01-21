Feature: Test Automation exercise page Register User


  @TestRegisterUserTestAutomation
    Scenario: As a tester automation, I want to register a new user in the page
    Given I navigate to the automation exercise page
    And Verify that home page is visible successfully
    And Click on Signup button
    And Verify new user Signup is visible
    And Enter name and email address
    And Click Signup Button
    When fill details
    And Click on create an account button
    And Verify that account created is visible
    And Click continue button
    And Click Delete Account button
    Then Verify that Account Deleted is visible and click continue button


