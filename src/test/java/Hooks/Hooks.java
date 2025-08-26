//package Hooks;
// 
//import org.openqa.selenium.OutputType;
//
//import org.openqa.selenium.TakesScreenshot;
//
//import org.openqa.selenium.WebDriver;
// 
//import io.cucumber.java.After;
//
//import io.cucumber.java.Before;
//
//import io.cucumber.java.Scenario;
//
//import utils.DriverFactory;
// 
//public class Hooks {
//	// Inject WebDriver from DriverFactory
//	 @Before
//	 public void setUp() {
//		 DriverFactory.getDriver();
//		 System.out.println("Browser launched before scenario");
//	 }
//	 @After
//	 public void tearDown(Scenario scenario) {
//		 WebDriver driver = DriverFactory.getDriver();
//		 if(scenario.isFailed()) {
//			  byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	          scenario.attach(screenshot, "image/png", "Failed Screenshot"); 
//		 }
//		 DriverFactory.quitDriver();
//		 System.out.println("Browser closed after the scenario");
//	 }
//}
//
// 
package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class Hooks {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = DriverFactory.getDriver();
        System.out.println("Browser launched once before all scenarios");
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
        System.out.println("Browser closed after all scenarios");
    }

    @io.cucumber.java.After
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
    }

    public static WebDriver getDriver() {
        return driver;  
    }
}
