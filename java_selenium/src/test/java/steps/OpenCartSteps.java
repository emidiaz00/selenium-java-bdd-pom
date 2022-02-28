package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.OpenCartPage;

public class OpenCartSteps {

    OpenCartPage opencart = new OpenCartPage();

    @Given("^I am on the Open Cart page$")
    public void iAmOnTheOpenCartPage() {
        opencart.navigateToOpenCartPage();
    }
    @When("^I click on my account and click on register$")
    public void clickOnMyAccountAndClickOnRegister() {
        opencart.clickOnMyAccountAndLogin();
    }



}
