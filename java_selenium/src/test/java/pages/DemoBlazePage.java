package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DemoBlazePage extends BasePage {
    private String SignUpDemoBlazeButton = "//*[contains(@id,'signin2')]";
    private String loginIsVisibleElement = "//*[contains(@id,'signInModalLabel')]";
    private String usernameInputDemo = "//*[contains(@id,'sign-username')]";
    private String passwordInputDemo = "//*[contains(@id,'sign-password')]";
    private String buttonLoginConfirm = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

    public DemoBlazePage() {
        super(driver);
    }
    public void navigateToDemoBlaze() {
        navigateTo("https://www.demoblaze.com/");
    }
    public void clickLogin() throws NoSuchElementException {
        clickElementByxpath(SignUpDemoBlazeButton);
    }
    public String loginIsVisible() {
        return textFromElement(loginIsVisibleElement);
    }
    public void fiellFieldsLogin(String username, String password) {
        write(usernameInputDemo, username);
        write(passwordInputDemo, password);
    }
    public void clickButtonLogin() {
        clickElementByxpath(buttonLoginConfirm);
    }

}
