package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processor ;
    // By processor = By.name("product_attribute_1");
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    //By ram = By.xpath("//select[@id='product_attribute_2']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement radioButtonHDD;
    //By radioButtonHDD = By.xpath("//input[@id='product_attribute_3_7']");
    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement radioButtonOS;
    //By radioButtonOS = By.cssSelector("#product_attribute_4_9");
    @CacheLookup
    @FindBy(css = "#product_attribute_5_10")
    WebElement microsoftOfficeCheckBox;
    //By microsoftOfficeCheckBox = By.cssSelector("#product_attribute_5_10");
    @CacheLookup
    @FindBy(css = "label[for='product_attribute_5_12']")
    WebElement totalCommanderCheckbox;
    //By totalCommanderCheckbox = By.cssSelector("label[for='product_attribute_5_12']");
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement price;
    //By price = By.xpath("//span[@id='price-value-1']");
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;
    // By addToCart = By.id("add-to-cart-button-1");
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement orderMessage;
    //By orderMessage = By.xpath("//p[@class='content']");
    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement closeBar;
    //By closeBar = By.cssSelector("span[title='Close']");
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;



    //2.5 Verify the Text "Build your own computer"
    public void selectByVisibleText() {
       selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
        CustomListeners.test.log(Status.PASS,"processor");
    }

    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void setRam() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
    CustomListeners.test.log(Status.PASS,"ram");}

    // 2.7.Select "8GB [+$60.00]" using Select class.
    public void setRadioButtonHDD() {clickOnElement(radioButtonHDD);
        CustomListeners.test.log(Status.PASS,"Click on radioButtonHDD");}


    // 2.8 Select HDD radio "400 GB [+$100.00]"
    public void setRadioButtonOS() {clickOnElement(radioButtonOS);
        CustomListeners.test.log(Status.PASS,"Click on radioButtonOS");
    }

    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    public void setMicrosoftOfficeCheckBox() {
        clickOnElement(microsoftOfficeCheckBox);
        CustomListeners.test.log(Status.PASS,"Click on microsoftOfficeCheckBox");
    }

    // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
    //[+$5.00]"
    public void setTotalCommanderCheckbox() {
        clickOnElement(totalCommanderCheckbox);
        CustomListeners.test.log(Status.PASS,"Click on totalCommanderCheckbox");
    }

    // 2.11 Verify the price "$1,475.00"
    public void verifyThePrice() {
        clickOnElement(price);
        CustomListeners.test.log(Status.PASS,"Click on price");
    }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"Click on addToCart");
    }

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top
//green Bar After that close the bar clicking on the cross button.
    public void verifyOrderMessage() {
        clickOnElement(orderMessage);
        CustomListeners.test.log(Status.PASS,"Click on orderMessage");
    }

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void setCloseBar() {
        clickOnElement(closeBar);
        CustomListeners.test.log(Status.PASS,"Click on closeBar");
    }

    //2.15 Verify the message "Shopping cart"
    public void setShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
        CustomListeners.test.log(Status.PASS,"setShoppingCart");
    }
}
