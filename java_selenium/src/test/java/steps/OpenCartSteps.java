package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
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

    @And("^fill the fields (.+) and (.+) and (.+) and (.+) and (.+) and (.+)$")
    public void fillTheFieldsRegisterOpenCart(String firstname,String lastname,String email,String telephone,String password,String passwordConfirm) {
        opencart.enterCriteriaOnTheFields(firstname,lastname,email,telephone,password,passwordConfirm);
    }
    @And("^click on the confirm register$")
    public void confirmRegister() {
        opencart.clickOnTheContinueButton();
    }
    @Then("^verify that login was sucessfully$")
    public void verifyThatLoginWasSucess() {
        Assert.assertEquals("Congratulations! Your new account has been successfully created!", opencart.resultAccountCreated());
    }



}
