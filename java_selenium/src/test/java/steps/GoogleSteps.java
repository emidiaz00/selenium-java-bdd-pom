package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    // crear una instancia de la pagina de google
    GooglePage google = new GooglePage();

    // Busqueda Google Test
    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
          google.navigateToGoogle();
    }
    @When("^I enter a search (.+)$")
    public void enterSearchCriteria(String criteria){
        google.enterSearchCriteria(criteria);
    }
    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }
    @Then("^the (.+) match the criteria$")
    public void validateResults(){
        Assert.assertEquals("HolaMundo - Youtube", google.resultGoogleSearchHolaMundo());
    }

    // Busqueda Selenium Java
    @When("^I enter search (.+) on the input$")
    public void enterUdemySearch(String word) {
        google.enterSearchWord(word);
    }
    @And("^click on the link page$")
    public void clickPageUdemy() {
        google.clickUdemyLink();
    }
    @And("^verify that see sucessfully home page udemy$")
    public void validateResultUdemyHome() {
        Assert.assertEquals("Categorías", google.resultUdemySearch());
    }








}

