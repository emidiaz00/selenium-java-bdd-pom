package pages;

public class RegisterUserPage extends BasePage {

    private String homeIsVisibleLocator = "//*[contains(text(),'Home')]";
    private String signUpButton = "//*[contains(text(),'Signup / Login')]";
    private String newUserSignUp = "//*[contains(text(),'New User Signup!')]";
    private String nameInputField = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
    private String emailInputField = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]";
    private String signUpButtonRegister = "//button[contains(text(),'Signup')]";

    private String buttonGender = "//input[@id='id_gender1']";
    private String nameInputRegister = "//input[@id='name']";
    private String emailInputRegister = "//input[@id='email']";
    private String passwordInputRegister = "//input[@id='password']";
    private String dateOfBirth = "//select[@id='days']";
    private String month = "//select[@id='months']";
    private String year = "//option[contains(text(),'2012')]";

    private String firstNameRegister = "//input[@id='first_name']";
    private String lastNameRegister = "//input[@id='last_name']";
    private String compayRegister = "//input[@id='company']";
    private String addressRegister = "//input[@id='address1']";
    private String countryRegister = "//select[@id='country']";
    private String stateRegister = "//input[@id='state']";
    private String cityRegister = "//input[@id='city']";
    private String zipCodeRegister = "//input[@id='zipcode']";
    private String mobileNumberRegister = "//input[@id='mobile_number']";
    private String createAnAccountButtonRegister = "//button[contains(text(),'Create Account')]";
    private String accountCreatedAssert = "//b[contains(text(),'Account Created!')]";
    private String continueButton = "//a[contains(text(),'Continue')]";
    private String deleteAccount = "//*[contains(text(),'Delete Account')]";
    private String deleteAccountButtonAssert = "//h4[contains(text(),'Are you sure you want to delete this Delete Account?')]";


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
    public void enterCriteriaFillFields() {
        clickElement(buttonGender);
        write(nameInputRegister, "Emiliano");
        write(emailInputRegister,"emildsn05@gmail.com");
        write(passwordInputRegister,"Password1");
        SelectFromDropDownByValue(dateOfBirth,"2");
        SelectFromDropDownByValue(month,"1");
        clickElement(year);
        write(firstNameRegister,"Emiliano");
        write(lastNameRegister,"Diaz");
        write(compayRegister,"logitech");
        write(addressRegister,"St Lake 500");
        SelectFromDropDownByValue(countryRegister,"India");
        write(stateRegister,"Maryland");
        write(cityRegister,"Florida");
        write(zipCodeRegister,"t99501");
        write(mobileNumberRegister,"11444444444");
        clickElement(createAnAccountButtonRegister);
    }
    public void ClickCreateAnAccount() {
        clickElement(createAnAccountButtonRegister);
    }
    public String resultAccountCreatedIsVisible() {
        return textFromElement(accountCreatedAssert);
    }
    public void ClickContinueButton() {
        clickElement(continueButton);
    }
    public void ClickDeleteAccount() {
        clickElement(deleteAccount);
    }
    public void DeleteAccountAssert() {
        clickElement(deleteAccountButtonAssert);
    }
}
