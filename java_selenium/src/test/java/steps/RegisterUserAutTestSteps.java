package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterUserPage;

public class RegisterUserAutTestSteps {

    RegisterUserPage register = new RegisterUserPage();

    @Given("^I navigate to the automation exercise page$")
    public void navigateToAutomationExercise() {
        register.navigateToRegisterUserPage();
    }
    @And("^Verify that home page is visible sucessfully$")
    public void verifyHomePageIsVisible() {
        Assert.assertEquals("Home", register.resultHomeIsvisible());
    }
    @And("^Click on Signup button$")
    public void ClickOnSignupButton() {
        register.ClickSignUpButton();

    }
    @And("^Verify new user Signup is visible$")
    public void VerifyNewUserIsVisible() {
        register.resultNewUserIsVisible();
    }
    @And("^Enter name and email address")
    public void enterNameAndEmailAddress() {
        register.enterCriteriaEmailAndAddress("Emiliano");
        register.enterCriteriaEmailAndAddress("emildsn05@gmail.com");
    }
    @And("^Click Signup Button$")
    public void ClickSignUpButton() {
        register.ClickSignUpButtonRegister();
    }
    @When("^fill details$")
    public void completeFieldsDetails() {


    }
    @And("^Click on create an account button$")
    public void wdaaawdwawdaaw() {

    }
    @And("^Verify that account created is visible$")
    public void wdaawddddwawdaaw() {

    }
    @And("^Click continue button$")
    public void wdaawdwaaaawdaaw() {

    }
    @And("^Click Delete Account button$")
    public void wdaaaaawdwawdaaw() {

    }
    @Then("^Verify that Account Deleted is visible and click continue button$")
    public void wdaawdwiiawdaaw() {

    }



}
