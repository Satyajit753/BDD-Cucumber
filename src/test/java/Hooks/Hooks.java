package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        System.out.println("Browser launched before scenario");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
        System.out.println("Browser closed after scenario");
    }

    @After
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
    }
}
