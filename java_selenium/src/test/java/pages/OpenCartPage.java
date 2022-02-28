package pages;

import org.openqa.selenium.WebDriver;

public class OpenCartPage extends BasePage {

    private String myAccount = "//span[contains(text(),'My Account')]";
    private String loginInMyAccount = "//a[contains(text(),'Register')]";

    // locators form

    private String inputFirstName = "//input[@id='input-firstname']";
    private String inputLastName = "//input[@id='input-lastname']";
    private String inputEmail = "//input[@id='input-email']";
    private String inputTelephone = "//input[@id='input-telephone']";
    private String inputPassword = "//input[@id='input-password']";
    private String inputPasswordConfirm = "//input[@id='input-confirm']";
    private String checkBoxAgreePrivacyPolicy = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]";
    private String buttonConfirmRegister = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]";



    public OpenCartPage() {
        super(driver);
    }
    public void navigateToOpenCartPage() {
        navigateTo("http://opencart.abstracta.us/");
    }
    public void clickOnMyAccountAndLogin() {
        clickElementByxpath(myAccount);
        clickElementByxpath(loginInMyAccount);
    }
    public void enterCriteriaOnTheFields(String firstname,String lastname, String email, String telephone, String password, String passwordConfirm) {
        write(inputFirstName, firstname);
        write(inputLastName, lastname);
        write(inputEmail, email);
        write(inputTelephone, telephone);
        write(inputPassword, password);
        write(inputPasswordConfirm, passwordConfirm);
    }
    public void clickOnTheContinueButton() {
        clickElementByxpath(checkBoxAgreePrivacyPolicy);
        clickElementByxpath(buttonConfirmRegister);
    }

}
