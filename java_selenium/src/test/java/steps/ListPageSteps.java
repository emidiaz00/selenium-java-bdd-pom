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
    @Then("^I can find the text in the list$")
    public void iCanFindTextInTheList() {
        List<String> list = lista.listaStrings();
        boolean textIsThere = list.contains("Seattle, Washington");
        if (textIsThere) {
            System.out.println("El texto se ha encontrado");
        } else
            throw new Error("El texto no se ha encontrado");
    }
}
