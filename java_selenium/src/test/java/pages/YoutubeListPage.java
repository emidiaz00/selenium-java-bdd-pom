package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class YoutubeListPage extends BasePage {

    private String inputSearchYoutube = "//input[@id='search']";
    private String buttonSearchYoutube = "//button[@id='search-icon-legacy']";
    private String searchResults = "name";

    public YoutubeListPage() {
        super(driver);
    }
    public void navigateToYoutubePage() {
        navigateTo("https://www.youtube.com/");
    }
    public void enterSearchCriteriaInInput(String word)  {
        try {
            Thread.sleep(600);
            write(inputSearchYoutube, word);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public void clickButtonSearchYoutube() throws NoSuchElementException {
        clickElementByxpath(buttonSearchYoutube);
    }
    public List<String> listaStringsYoutube() {
        List<WebElement> listaWebElementYt = bringMeAllElements(searchResults);
        List<String> NewListString = new ArrayList<>();
        for (int i = 0; i < listaWebElementYt.size(); i++) {
            WebElement element = listaWebElementYt.get(i);
            NewListString.add(element.getText());
        }
        return NewListString;
    }




}
