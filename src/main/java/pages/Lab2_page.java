package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Lab2_page {
    private WebDriver driver;
    private By firstNameField = By.name("firstName");
    private By lastNameField = By.name("lastName");
    private By phoneField = By.name("phone");
    private By emailField = By.id("userName");          
    private By addressField = By.name("address1");
    private By cityField = By.name("city");
    private By stateField = By.name("state");
    private By postalCodeField = By.name("postalCode"); 
    private By countryDropdown = By.name("country");
    private By usernameField = By.id("email");          
    private By passwordField = By.name("password");     
    private By confirmPasswordField = By.name("confirmPassword"); 
    private By submitButton = By.xpath("//input[@name='submit']"); 
    public Lab2_page(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(stateField).clear();
        driver.findElement(stateField).sendKeys(state);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeField).clear();
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void selectCountry(String country) {
        WebElement dropdown = driver.findElement(countryDropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText(country);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).clear();
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.xpath("//font[contains(text(),'Thank you for registering')]")).getText();
    }
}
