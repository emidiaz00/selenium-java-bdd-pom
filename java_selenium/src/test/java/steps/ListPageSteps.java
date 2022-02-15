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
    @When("^I search (.+) in the list$")
    public void iSearchTheList(String state) throws InterruptedException {
        lista.enterSearchInfoList(state);
    }
    @Then("^I can find (.+) in the list$")
    public void iCanFindTextInTheList(String city) {
        List<String> list = lista.listaStrings();
        boolean textIsThere = list.contains(city);
        if (textIsThere) {
            System.out.println("El texto se ha encontrado");
        } else
            throw new Error("El texto no se ha encontrado");
    }
}
