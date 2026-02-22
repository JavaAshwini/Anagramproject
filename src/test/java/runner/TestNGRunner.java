package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features/", glue = {"StepDefinition", "Hooks"}, monochrome = false,
        tags = "@Regression",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json", "rerun:target/failed_scenarios.txt"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}