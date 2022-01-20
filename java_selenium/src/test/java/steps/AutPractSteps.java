package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutPractPage;

public class AutPractSteps {

    AutPractPage practice = new AutPractPage();

    @Given("^I am on the Automation search page$")
    public void navigateToAutomationPractice() {

    }
    @When("^I enter a search criteria in field$")
    public void enterSearchCriteriaFieldDress() {

    }
    @And("^click on the search button dress$")
    public void clickSearchButtonDress() {

    }
    @Then("^the results show the dress$")
    public void validateResultsAutomationPracticeSearch() {
        Assert.assertEquals("Hola", AutPractPage.resultView);
    }

}
