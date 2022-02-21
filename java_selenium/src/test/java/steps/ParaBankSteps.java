package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ParaBankPage;

public class ParaBankSteps extends ParaBankPage {

    ParaBankSteps parabank = new ParaBankSteps();

    @Given("^I am on the ParaBank page$")
    public void iAmOnTheParaBankPage() {

    }
    @When("^I click on the register$")
    public void iClickOnTheRegister() {

    }
    @And("^fill the fields (.+) and (.+)$")
    public void fillTheFields() {

    }
    @And("^confirm (.+)$")
    public void confirmPassword() {

    }
    @And("^click on the register button$")
    public void clickOnTheRegisterButton() {

    }
    @Then("^I register succesfully$")
    public void iRegisterSucessfully() {

    }

}
