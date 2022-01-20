package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleSteps {

    // crear una instancia de la pagina de google
    GooglePage google = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
          google.navigateToGoogle();
    }
    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("Traductor El Mundo");
    }
    @And("^click on the search button$")
    public void clickSearchButton(){
        google.clickGoogleSearch();
    }
    @Then("^the results match the criteria$")
    public void validateResults(){
        Assert.assertEquals("Traductor | EL MUNDO", google.resultGoogleSearch());
    }
}

