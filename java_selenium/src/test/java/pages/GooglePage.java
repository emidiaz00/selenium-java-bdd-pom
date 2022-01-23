package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class GooglePage extends BasePage {
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String resultGoogleSearch = "//h3[contains(text(),'Traductor | EL MUNDO')]";

    public GooglePage() {
        super(driver);
    }
    public void navigateToGoogle() {
        navigateTo("https://www.google.com/?hl=es");
    }
    public void enterSearchCriteria(String criteria) {
         write(searchTextField, criteria);
    }
    public void clickGoogleSearch() throws NoSuchElementException {
        clickElement(searchButton);
    }
    public String resultGoogleSearch(){
        return textFromElement(resultGoogleSearch);
    }
}


