package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
      ( features="src/test/resources/feature/", glue="StepDefinition", monochrome =true,
              plugin = {"pretty", "html:target/cucumber-report.html"})
public class TestNGRunner {
}