package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

import java.util.List;

public class ListPageSteps {

    ListPage lista = new ListPage();

    @Given("^I navigate to the list page$")
    public void navigateToTheListPage() {
        lista.navigateToListPage();

    }

    @When("^I search the list$")
    public void iSearchTheList() throws InterruptedException {
        lista.enterSearchInfoList();
    }

    /* @Then("^I can find the text in the list$")
    public void iCanFindTextInTheList() {
        // creo una nueva lista y le paso como valor el nombre del metodo en ListPage
        List<String> list = lista.getAllSearchResults();
        // elijo un valor booleano y lo guardo en una variable para ver si contiene el string
        boolean textIsThere = list.contains("Seattle, Washington");
        // uso un condicional para mostrar mensaje en consola

        if (textIsThere) {
            System.out.println("El texto se ha encontrado");
        } else
            // si el texto no está devuelve nuevo error con el siguiente mensaje
            throw new Error("El texto no se ha encontrado");
}*/
    @Then("^I can find the text in the list$")
    public void iCanFindTextInTheList() {
        // creo una nueva lista y le paso como valor el nombre del metodo en ListPage
        List<String> list = lista.listaStrings();
        // elijo un valor booleano y lo guardo en una variable para ver si contiene el string
        boolean textIsThere = list.contains("Seattle, Washington");
        // uso un condicional para mostrar mensaje en consola

        if (textIsThere) {
            System.out.println("El texto se ha encontrado");
        } else
            // si el texto no está devuelve nuevo error con el siguiente mensaje
            throw new Error("El texto no se ha encontrado");

    }
}
