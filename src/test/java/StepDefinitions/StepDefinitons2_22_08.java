//package StepDefinitions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utils.DriverFactory;
//import pages.loginpage;
//public class StepDefinitons2_22_08 {
//	WebDriver driver = DriverFactory.getDriver();
//	loginpage lp = new loginpage(driver);
//	@When("user clicks on the login button")
//	public void user_clicks_on_the_login_button() throws InterruptedException {
//		  WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//	        button.click();
//	        Thread.sleep(8000);
//	}
//
//	@Then("user is naqvigated to home page")
//	public void user_is_naqvigated_to_home_page() throws InterruptedException {
//		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
//		Thread.sleep(8000);
//	}
//	
//	@Given("the user is on the login page")
//	public void the_user_is_on_the_login_page() throws InterruptedException {
//		// launch the application on the chrome browser
//				Thread.sleep(1000);
// 
//				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
// 
//				Thread.sleep(2000);
// 
//	}
// 
//	@When("the user enters username {string} and password {string}")
//	public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
// 
//	lp.enterCredentials(username, password);
//	}
// 
//	@Then("the user should be navigated to the home page")
//	public void the_user_should_be_navigated_to_the_home_page() {
//		lp.clickLogin();
//	}
//
//}