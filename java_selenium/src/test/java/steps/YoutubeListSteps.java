package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.YoutubeListPage;

import java.util.List;

public class YoutubeListSteps {

    YoutubeListPage listaYoutube = new YoutubeListPage();

    @Given("^I am on the Youtube page$")
    public void navigateToTheYoutubePage() {
        listaYoutube.navigateToYoutubePage();

    }
    @When("^I enter search (.+) on youtube$")
    public void iSearchCriteriaOnYoutube(String word) {
        listaYoutube.enterSearchCriteriaInInput(word);
    }
    @And("^click button search youtube$")
    public void clickButtonSearchYoutube(){
        listaYoutube.clickButtonSearchYoutube();
    }

    @Then("^Verify that (.+) is there$")
    public void iCanFindTextInTheListYoutube(String results) {
        List<String> list = listaYoutube.listaStringsYoutube();
        boolean texYoutubeIsThere = list.contains(results);
        if (texYoutubeIsThere) {
            System.out.println("El texto se ha encontrado");
        } else
            throw new Error("El texto no se ha encontrado");
    }
}