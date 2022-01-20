package pages;



public class AutPractPage extends BasePage {


    private String searchTextField = "//input[@id='search_query_top']";
    private String searchButton = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]";
    public static String resultView = "//span[contains(text(),'\\\"dress\\\"')]";

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
        clickElement(searchButton);
    }



}
