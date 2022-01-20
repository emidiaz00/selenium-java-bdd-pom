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
    public void enterSearchInfoList() throws InterruptedException {
        Thread.sleep(600);
        write(searchInput, "Washington");
    }


    /*  Tenemos una lista de webElements y debemos transformarla a una lista de texto
    public List<String> getAllSearchResults() {
        // Creamos una primera lista en funcion del metodo que creamos en la base page
        List<WebElement> list = bringMeAllElements(searchResults);
        // Creamos una segunda lista del tipo String y está basada en la primer lista que agarra los WebElements
        List<String> stringFromList = new ArrayList<String>();
        for (WebElement e :list) {
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }*/

    public List<String> listaStrings() {
        /* 1-Tenemos una lista de webElements que le pasamos el metodo que creamos en la base page,
        le pasamos el nombre del metodo y como parametro el locator del webElement.*/
        List<WebElement> listaWebElement = bringMeAllElements(searchResults);

        //2- Creamos una nueva lista de tipo String e instanciamos el objeto de la lista
        List<String> NewListString = new ArrayList<String>();

        //3- Iteramos en esa lista para poder encontrar el elemento que queremos
        for (int i = 0; i < listaWebElement.size(); i++) {
            WebElement elementoWeb = listaWebElement.get(i);
            NewListString.add(elementoWeb.getText());

        }
        return NewListString;

    }


}
