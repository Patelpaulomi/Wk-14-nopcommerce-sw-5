package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;
    //By listViewTab = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//h2//a[@href='/nokia-lumia-1020']")
    WebElement nokiaLumia1020;
    //By nokiaLumia1020 = By.xpath("//h2//a[@href='/nokia-lumia-1020']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQyt;
    //By changeQyt = By.xpath("//input[@id='product_enteredQuantity_20']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    //By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeBar;
    //By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;

    //By shoppingCart = By.xpath("//span[@class='cart-label']");
    public void clickOnList() {
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS,"Click on listViewTab");
    }

    public void clickOnNokiaLumia() {
        waitAndClick((By) nokiaLumia1020);
        CustomListeners.test.log(Status.PASS,"Click on nokiaLumia1020");
    }

    public void setChangeQty() {
        sendTextToElement(changeQyt, "2");
        CustomListeners.test.log(Status.PASS,"changeQyt"+"2");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"Click on addToCart");
    }

    public void setCloseBar() {
        clickOnElement(closeBar);
        CustomListeners.test.log(Status.PASS,"Click on closeBar");
    }

    public void mouseHoverAndClickOnShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        CustomListeners.test.log(Status.PASS,"Click on shoppingCart");
    }
}
