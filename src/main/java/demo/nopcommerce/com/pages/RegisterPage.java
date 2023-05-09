package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    //By firstNameField = By.xpath("//input[@id='FirstName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    //By lastNameField = By.xpath("//input[@id='LastName']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dayDropDown;
    // By dayDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthDropDown;
    //By monthDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearDropDown;
    //By yearDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    //By emailField = By.xpath("//input[@id='Email']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    //By passwordField = By.xpath("//input[@id='Password']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordField;
    //By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement register;
    //By register = By.xpath("//button[@id='register-button']");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue1;
    //By continue1 = By.xpath("//a[contains(text(),'Continue')]");

    public void fillingTheDetails(String firstName, String lastName, String day, String month, String year, String email, String password, String confirmPassword) {
        sendTextToElement(firstNameField, firstName);
        sendTextToElement(lastNameField, lastName);
        selectByVisibleTextFromDropDown(dayDropDown, day);
        selectByVisibleTextFromDropDown(monthDropDown, month);
        selectByVisibleTextFromDropDown(yearDropDown, year);
        sendTextToElement(emailField, email);
        sendTextToElement(passwordField, password);
        sendTextToElement(confirmPasswordField, confirmPassword);
        CustomListeners.test.log(Status.PASS,"fillingTheDetails");
    }

    public void clickOnRegister() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"Click On register");
    }

    public void clickOnContinue1() {
        clickOnElement(continue1);
        CustomListeners.test.log(Status.PASS,"Click On continue1");
    }
}
