Feature: Login on OpenCart

  @Regresion
    
  @LoginOpenCart
  Scenario Outline: As a user I want login on OpenCart
    Given I am on the Open Cart page
    When I click on my account and click on register
    And fill the fields <firstname> and <lastname> and <email> and <telephone> and <password> and <passwordConfirm>
    And click on the confirm register
    Then verify that login was sucessfully
    Examples:
      | firstname | lastname | email               | telephone  | password  | passwordConfirm |
      | emildsn1 | simpson   | emildsn11@gmail.com | 1154856076 | password1 | password1 |
      #| emildsn2 | simpson2  | emildsn09@gmail.com | 1166956073 | password2 | password1 |
      #| emildsn3 | simpson3  | emildsn10@gmail.com | 1187105456 | password3 | password1 |


