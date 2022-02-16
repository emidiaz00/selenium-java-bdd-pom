package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DemoBlazePage;

public class DemoBlazeSteps {

    DemoBlazePage demoblaze = new DemoBlazePage();

    @Given("^I am on the DemoBlaze page$")
    public void iAmOnTheDemoBlazePage() {
        demoblaze.navigateToDemoBlaze();
    }
    @When("^I click on login$")
    public void iClickOnLoginDemoBlaze() {
        demoblaze.clickLogin();
    }
    @And("^verify that login is visible$")
    public void verifyLoginIsVisible() {
        demoblaze.loginIsVisible();
    }
    @Then("^fill the field (.+) and (.+) of login$")
    public void fillFieldsUsernameAndPassword(String username,String password) {
        demoblaze.fiellFieldsLogin(username,password);
    }
    @And("^click on button login$")
    public void clickOnButtonLogin() {
        demoblaze.clickButtonLogin();
    }
    @And("^verify that account has been created$")
    public void verifyAccountHasBeenCreated() {
        Assert.assertEquals("waawwa", );
    }


}
