package pages;

import org.openqa.selenium.WebDriver;

public class OpenCartPage extends BasePage {

    private String myAccount = "//span[contains(text(),'My Account')]";
    private String loginInMyAccount = "//a[contains(text(),'Register')]";

    // locators form

    private String inputFirstName = "//input[@id='input-firstname']";
    private String inputLastName = "//input[@id='input-lastname']";
    private String inputEmail = "";
    private String inputTelephone = "";
    private String inputPassword = "";
    private String inputPasswordConfirm = "";



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
    public void enterCriteriaOnTheFields() {

    }

}
