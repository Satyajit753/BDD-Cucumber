package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @When("user enters credentials")
    public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            driver.findElement(By.name("username")).sendKeys(user.get("username"));
            driver.findElement(By.name("password")).sendKeys(user.get("password"));
            Thread.sleep(2000);
        }
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @Then("user should see the home page")
    public void user_should_see_the_home_page() {
        boolean dashboardVisible = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
        if (dashboardVisible) {
            System.out.println("Login successful, Dashboard visible!");
        } else {
            System.out.println("Login failed!");
        }
        DriverFactory.quitDriver();
    }
}
