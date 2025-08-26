package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},   // path to your .feature files
        glue = {"StepDefinitions"},                   // package where step defs are
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        monochrome = true,
        tags = "@sanity"                              // run scenarios with @sanity tag
)
public class MyTestRunner2 {
}
