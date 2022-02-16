package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DemoBlazePage extends BasePage {
    private String loginDemoBlazeButton = "//*[@id=\"login2\"]";
    private String loginIsVisibleElement = "//*[@id=\"logInModalLabel\"]";
    private String usernameInputDemo = "//*[@id=\"loginusername\"]";
    private String passwordInputDemo = "//*[@id=\"loginpassword\"]";
    private String buttonLoginConfirm = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";
    




    public DemoBlazePage() {
        super(driver);
    }
    public void navigateToDemoBlaze() {
        navigateTo("https://www.demoblaze.com/");
    }
    public void clickLogin() throws NoSuchElementException {
        clickElement(loginDemoBlazeButton);
    }
    public String loginIsVisible() {
        return textFromElement(loginIsVisibleElement);
    }
    public void fiellFieldsLogin(String username, String password) {
        write(usernameInputDemo, username);
        write(passwordInputDemo, password);
    }
    public void clickButtonLogin() {
        clickElement(buttonLoginConfirm);
    }

}
