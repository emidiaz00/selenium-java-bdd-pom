package pages;


import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{
    private String searchInput = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }
    public void navigateToListPage() {
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }
    public void enterSearchInfoList(String state) throws InterruptedException {
        Thread.sleep(600);
        write(searchInput, state);
    }
    public List<String> listaStrings() {
        List<WebElement> listaWebElement = bringMeAllElements(searchResults);
        List<String> NewListString = new ArrayList<String>();
        for (int i = 0; i < listaWebElement.size(); i++) {
            WebElement elementoWeb = listaWebElement.get(i);
            NewListString.add(elementoWeb.getText());

        }
        return NewListString;
    }
}
