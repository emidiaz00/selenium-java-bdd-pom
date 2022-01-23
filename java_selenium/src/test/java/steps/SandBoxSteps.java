package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SandBoxPage;

import java.util.concurrent.TimeUnit;

public class SandBoxSteps {
    SandBoxPage sandBox = new SandBoxPage();

    @Given("I am on the SandBox page")
    public void navigateSandBoxPage() {
        sandBox.navigateToSandBoxPage();
    }
    @Then("I see the row")
    public void iSeeTheRow() {
        String value = sandBox.getValueFromGrid(2,2);
    }
}
