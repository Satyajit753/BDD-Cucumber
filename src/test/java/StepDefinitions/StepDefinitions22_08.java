//package StepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.And;
//import utils.DriverFactory;
//
//public class StepDefinitions22_08 {
//
//    WebDriver driver = DriverFactory.getDriver();
//
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() throws InterruptedException {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(3000);
//    }
//
//    @When("user enters credentials")
//    public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
//
//        for (Map<String, String> user : users) {
//            String username = user.get("username");
//            String password = user.get("password");
//
//            WebElement username1 = driver.findElement(By.name("username"));
//            username1.sendKeys(username);
//
//            WebElement password1 = driver.findElement(By.name("password"));
//            password1.sendKeys(password);
//
//            Thread.sleep(2000);
//        }
//    }
//
//    @And("user clicks on the login button")
//    public void user_clicks_on_the_login_button() throws InterruptedException {
//        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//        loginBtn.click();
//        Thread.sleep(4000);
//    }
//
//    @Then("user is naqvigated to home page")
//    public void user_is_navigated_to_home_page() {
//        // Basic validation → check if Dashboard is visible
//        boolean dashboardVisible = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//        if (dashboardVisible) {
//            System.out.println("Login successful, Dashboard visible!");
//        } else {
//            System.out.println("Login failed!");
//        }
//        DriverFactory.quitDriver();
//    }
//}
