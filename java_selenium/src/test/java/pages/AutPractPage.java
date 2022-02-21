package pages;

public class AutPractPage extends BasePage {
    private String searchTextField = "//input[@id='search_query_top']";
    private String searchButton = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]";
    public String productCartAdd = "//*[contains(text(),'Add to cart')]";
    public String productCartAdded = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]";
    public AutPractPage() {
        super(driver);
    }
    public void navigateToAutomationPractice() {
            navigateTo("http://automationpractice.com/index.php");
    }
    public void enterSearchDress(String information) {
        write(searchTextField, information);
    }
    public void clickAutomationPracticeSearch() {
        clickElementByxpath(searchButton);
    }
    public void clickProductCart() {
        clickElementByxpath(productCartAdd);
    }
    public String resultAutProductAdded() {
        return textFromElement(productCartAdded);
    }
}
