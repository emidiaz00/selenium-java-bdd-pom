package pages;

import org.openqa.selenium.NoSuchElementException;


public class GooglePage<Bolean> extends BasePage {
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    private String resultsSearchGoogle = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/div/a/h3";
    private String resultsSearchSeleniumJava = "//*[@id=\"rso\"]/div[2]/div/div/div[1]/div/div/div[1]/div/a/h3";

    private String linkUdemySearchInGoogle = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3";
    private String resultUdemySearchInGoogle = "//span[contains(text(),'Categorías')]";

    
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
    public String resultGoogleSearchHolaMundo(){
        return textFromElement(resultsSearchGoogle);
    }
    public String resultGoogleSearchSeleniumJava() {
        return textFromElement(resultsSearchSeleniumJava);
    }

    public void enterSearchWord(String criteria) {
        write(searchTextField, criteria);
    }
    public void clickUdemyLink() throws NoSuchElementException {
        clickElement(linkUdemySearchInGoogle);
    }
    public String resultUdemySearch() {
        return textFromElement(resultUdemySearchInGoogle);
    }
    public Boolean resultDisplayed() {
        return isDisplayed(resultUdemySearchInGoogle);
    }

}


