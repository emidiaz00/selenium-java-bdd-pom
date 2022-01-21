package pages;



public class RegisterUserPage extends BasePage {

    private String homeIsVisibleLocator = "//*[contains(text(),'Home')]";
    private String signUpButton = "//*[contains(text(),'Signup / Login')]";
    private String newUserSignUp = "//*[contains(text(),'New User Signup!')]";
    private String nameInputField = "//*[contains(text(),'Name')]";
    private String emailInputField = "//*[contains(text(),'Email Address')]";
    private String signUpButtonRegister = "//button[contains(text(),'Signup')]";

    




    public RegisterUserPage() {
        super(driver);
    }

    public void navigateToRegisterUserPage() {
        navigateTo("https://automationexercise.com/");
    }
    public String resultHomeIsvisible() {
        return textFromElement(homeIsVisibleLocator);
    }
    public void ClickSignUpButton() {
        clickElement(signUpButton);
    }
    public String resultNewUserIsVisible() {
        return textFromElement(newUserSignUp);
    }
    public void enterCriteriaEmailAndAddress(String criteria) {
       write(nameInputField, criteria);
       write(emailInputField,criteria);
    }
    public void ClickSignUpButtonRegister() {
        clickElement(signUpButtonRegister);
    }
    public void enterCriteriaFillFields(String criteria) {
        write();
    }







}
