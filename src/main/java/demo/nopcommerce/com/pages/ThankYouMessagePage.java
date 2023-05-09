package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ThankYouMessagePage extends Utility {
    @CacheLookup
            @FindBy(xpath ="//h1[normalize-space()='Thank you']" )
    WebElement thankYouMessage;
    //By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    @CacheLookup
            @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
            WebElement yourOrder;
    //By yourOrder = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    @CacheLookup
            @FindBy(xpath ="//button[normalize-space()='Continue']" )
            WebElement continueButton;
    //By continueButton = By.xpath("//button[normalize-space()='Continue']");

    public String thankYouMessageElement(){
        CustomListeners.test.log(Status.PASS,"thankyouMessage");
        return getTextFromElement(thankYouMessage);

    }
    public String yourOrderMessageElement(){
        CustomListeners.test.log(Status.PASS,"yourOrder");
        return getTextFromElement(yourOrder);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click On ContinueButton");

    }
}
