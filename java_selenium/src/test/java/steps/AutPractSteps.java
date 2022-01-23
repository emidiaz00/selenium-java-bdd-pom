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
        practice.navigateToAutomationPractice();
    }
    @When("^I enter a search criteria in field$")
    public void enterSearchCriteriaFieldDress() {
        practice.enterSearchDress("Dress");
    }
    @And("^click on the search button dress$")
    public void clickSearchButtonDress() {
        practice.clickAutomationPracticeSearch();

    }
    @And("^add product to cart$")
    public void addProductCart() {
        practice.clickProductCart();
    }

    @Then("^verify the product cart added$")
    public void validateResultsAutomationPracticeSearch() {
        Assert.assertEquals("Product successfully added to your shopping cart", practice.resultAutProductAdded());
    }
}
