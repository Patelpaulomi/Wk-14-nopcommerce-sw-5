package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelcomeToOurStorePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToOurStore;
    //By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public String  welcomeToOurStoreElement() {
        CustomListeners.test.log(Status.PASS,"welcomeToOurStoreElement");
        return getTextFromElement(welcomeToOurStore);
    }
}
