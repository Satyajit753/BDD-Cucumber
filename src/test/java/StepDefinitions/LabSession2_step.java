package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Hooks.Hooks;
import io.cucumber.java.en.*;
import utils.DriverFactory;

public class LabSession2_step {

	 private WebDriver driver = DriverFactory.getDriver(); 


    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("the user enters {string} as first name")
    public void the_user_enters_as_first_name(String firstName) throws InterruptedException {
        driver.findElement(By.name("firstName")).sendKeys(firstName);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as last name")
    public void the_user_enters_as_last_name(String lastName) throws InterruptedException {
        driver.findElement(By.name("lastName")).sendKeys(lastName);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as phone number")
    public void the_user_enters_as_phone_number(String phone) throws InterruptedException {
        driver.findElement(By.name("phone")).sendKeys(phone);
        Thread.sleep(1000);
    }

    @When("the user provides {string} as email")
    public void the_user_provides_as_email(String email) throws InterruptedException {
        driver.findElement(By.id("userName")).sendKeys(email);  // fixed locator
        Thread.sleep(1000);
    }

    @When("the user enters {string} as street address")
    public void the_user_enters_as_street_address(String address) throws InterruptedException {
        driver.findElement(By.name("address1")).sendKeys(address);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as city")
    public void the_user_enters_as_city(String city) throws InterruptedException {
        driver.findElement(By.name("city")).sendKeys(city);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as state")
    public void the_user_enters_as_state(String state) throws InterruptedException {
        driver.findElement(By.name("state")).sendKeys(state);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as postal code")
    public void the_user_enters_as_postal_code(String postalCode) throws InterruptedException {
        driver.findElement(By.name("postalCode")).sendKeys(postalCode);
        Thread.sleep(1000);
    }

    @When("the user selects {string} as country")
    public void the_user_selects_as_country(String country) throws InterruptedException {
        WebElement countryDropdown = driver.findElement(By.name("country"));
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(country);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as username")
    public void the_user_enters_as_username(String username) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(username);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as password")
    public void the_user_enters_as_password(String password) throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(1000);
    }

    @When("the user enters {string} as confirm password")
    public void the_user_enters_as_confirm_password(String confirmPassword) throws InterruptedException {
        driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
        Thread.sleep(1000);
    }

    @When("the user clicks on registration submit button")
    public void the_user_clicks_on_registration_submit_button() throws InterruptedException {
        driver.findElement(By.name("submit")).click();
        Thread.sleep(1000);
    }


    @Then("the registration should be successful")
    public void the_registration_should_be_successful() throws InterruptedException {
        String successMsg = driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering')]")).getText();
        if (successMsg.contains("Thank you for registering")) {
            System.out.println("Registration successful");
        } else {
            System.out.println("Registration failed");
        }
        Thread.sleep(1000);
    }
}
