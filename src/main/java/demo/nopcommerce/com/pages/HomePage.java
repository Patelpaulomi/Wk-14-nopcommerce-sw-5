package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computer;
    // By computer = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;
    // By desktop = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement electronics;
    //By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhones;
    //By cellPhones = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");


    //1.1 Click on Computer Menu
    public void mouseHoverOnComputer() {
        mouseHoverToElement(computer);
        CustomListeners.test.log(Status.PASS,"computer");
    }

    //1.2 Click on Desktop
    public void clickOnDesktop() {
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS,"Click On desktop");
    }

    //
    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS,"electronics");
    }

    public void clickIOnCellPhones() {
        clickOnElement(cellPhones);
        CustomListeners.test.log(Status.PASS,"Clock On cellPhones");
    }
}
