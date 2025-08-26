package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import utils.DriverFactory;

public class PracticeFormSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("the user is on the automation practice form page")
    public void the_user_is_on_the_automation_practice_form_page() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("the user enters {string} as name")
    public void the_user_enters_as_name(String name) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(name);
        Thread.sleep(500);
    }

    @When("the user enters {string} as email")
    public void the_user_enters_as_email(String email) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(500);
    }

    @When("the user selects gender {string}")
    public void the_user_selects_gender(String gender) throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='" + gender + "']")).click();
        Thread.sleep(500);
    }

    @When("the user enters {string} as mobile number")
    public void the_user_enters_as_mobile_number(String mobile) throws InterruptedException {
        driver.findElement(By.id("mobile")).sendKeys(mobile);
        Thread.sleep(500);
    }

    @When("the user enters date of birth {string}")
    public void the_user_enters_date_of_birth(String dob) throws InterruptedException {
        driver.findElement(By.id("dob")).sendKeys(dob);
        Thread.sleep(500);
    }

    @When("the user enters {string} as subject")
    public void the_user_enters_as_subject(String subject) throws InterruptedException {
        driver.findElement(By.id("subjects")).sendKeys(subject);
        Thread.sleep(500);
    }

    @When("the user selects hobby {string}")
    public void the_user_selects_hobby(String hobby) throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='" + hobby + "']")).click();
        Thread.sleep(500);
    }

    @When("the user uploads a file from {string}")
    public void the_user_uploads_a_file_from(String filePath) throws InterruptedException {
        driver.findElement(By.id("picture")).sendKeys(filePath);
        Thread.sleep(500);
    }

    @When("the user enters {string} as address")
    public void the_user_enters_as_address(String address) throws InterruptedException {
        driver.findElement(By.id("address")).sendKeys(address);
        Thread.sleep(500);
    }

    @When("the user selects state {string}")
    public void the_user_selects_state(String state) throws InterruptedException {
        Select sel = new Select(driver.findElement(By.id("state")));
        sel.selectByVisibleText(state);
        Thread.sleep(500);
    }

    @When("the user selects city {string}")
    public void the_user_selects_city(String city) throws InterruptedException {
        Select sel = new Select(driver.findElement(By.id("city")));
        sel.selectByVisibleText(city);
        Thread.sleep(500);
    }

    @When("the user clicks on submit button")
    public void the_user_clicks_on_submit_button() throws InterruptedException {
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
    }

    @Then("the form should be submitted successfully")
    public void the_form_should_be_submitted_successfully() throws InterruptedException {
        boolean confirmation = driver.findElement(By.xpath("//div[contains(@class,'modal-content')]")).isDisplayed();
        if (confirmation) System.out.println("Form submitted successfully!");
        else System.out.println("Form submission failed!");
        Thread.sleep(500);
        DriverFactory.quitDriver();
    }
}
