package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"json:test/report/cucumber_report.json"},
        tags = "@Regresion"
)
public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }

}