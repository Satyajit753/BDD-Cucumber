package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/Features/Lab2.feature"},
    glue = {"StepDefinitions"},
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class MyTestRunner extends AbstractTestNGCucumberTests {
}
