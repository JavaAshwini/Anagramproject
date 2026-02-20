package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions( features="@target/failed_scenarios.txt", glue="StepDefinition", monochrome =true,
              plugin = {"pretty", "html:target/cucumber-report.html"})
public class FailedNGRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}