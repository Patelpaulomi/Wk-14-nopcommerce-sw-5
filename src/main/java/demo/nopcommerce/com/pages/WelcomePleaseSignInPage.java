package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelcomePleaseSignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    //By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutGuest;
    //By checkoutGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;
    //By register = By.xpath("//button[contains(text(),'Register')]");


    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS,"getWelcomeText");
        return getTextFromElement(welcomeText);
    }

    //2.21 Click on “CHECKOUT AS GUEST” Tab
    public void setCheckoutGuest() {
        clickOnElement(checkoutGuest);
        CustomListeners.test.log(Status.PASS,"checkoutGuest");

    }

    public void clickOnRegisterButton() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"register");
    }
}
