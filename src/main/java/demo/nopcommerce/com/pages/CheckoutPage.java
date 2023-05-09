package demo.nopcommerce.com.pages;


import com.aventstack.extentreports.Status;
import demo.nopcommerce.com.customlisteners.CustomListeners;
import demo.nopcommerce.com.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    // Fill the required details
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;
    //By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;
    //By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;
    //By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    //By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
    WebElement stateField;
    // By stateField = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    //By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;
    //By address1Field = By.xpath("//input[@id='BillingNewAddress_Address1']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address2']")
    WebElement address2Field;
    // By address2Field = By.xpath("//input[@id='BillingNewAddress_Address2']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipField;
    // By zipField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;
    //By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FaxNumber']")
    WebElement faxNumberField;
    //By faxNumberField = By.xpath("//input[@id='BillingNewAddress_FaxNumber']");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;
    //By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Next Day Air ($0.00)']")
    WebElement nextDayAir;
    // click on next day air
    // By nextDayAir = By.xpath("//label[normalize-space()='Next Day Air ($0.00)']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton1;
    //By continueButton1 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    // Select credit card payment method
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement creditCardPaymentMethod;
    //By creditCardPaymentMethod = By.xpath("//label[normalize-space()='Credit Card']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton2;
    //By continueButton2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    // Select card Type
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType;
    //By creditCardType = By.xpath("//select[@id='CreditCardType']");
    // Fill card details
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardDetails;
    //By cardDetails = By.xpath("//input[@id='CardholderName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    //By cardNumber = By.xpath("//input[@id='CardNumber']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;
    //By month = By.xpath("//select[@id='ExpireMonth']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;
    //By year = By.xpath("//select[@id='ExpireYear']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    //By cardCode = By.xpath("//input[@id='CardCode']");
    // click on payment continue button
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton3;
    //By continueButton3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    // click on confirm
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirm;
    //By confirm = By.xpath("//button[normalize-space()='Confirm']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton4;
    // By continueButton4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS,"Enter firstName" + firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS,"Enter lastName" + lastName);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, "prime@gmail.com");
        CustomListeners.test.log(Status.PASS,"Enter email" + email);
    }

    public void selectFromDropdownCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
        CustomListeners.test.log(Status.PASS,"countryField");
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, "Harrow");
        CustomListeners.test.log(Status.PASS,"cityField" + city);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1Field, "100");
        CustomListeners.test.log(Status.PASS,"address1Field" + address1);
    }

    public void enterAddress2(String address2) {
        sendTextToElement(address2Field, "ABC LANE");
        CustomListeners.test.log(Status.PASS,"address2Field" + address2);
    }

    public void enterZip(String zip) {
        sendTextToElement(zipField, "HA2 9SE");
        CustomListeners.test.log(Status.PASS,"zipField" + zip);
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberField, "0754741442");
        CustomListeners.test.log(Status.PASS,"phoneNumberField" + phoneNumber);
    }

    public void enterFaxNumber(String faxNumber) {
        sendTextToElement(faxNumberField, "0192535448");
        CustomListeners.test.log(Status.PASS,"faxNumberField" + faxNumber);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on continueButton" );
    }

    public void clickOnNextDayAirButton() {
        clickOnElement(nextDayAir);
        CustomListeners.test.log(Status.PASS,"Click on nextDayAir" );
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS,"Click on continueButton1" );
    }

    public void clickOnCreditCardPaymentMethod() {
        clickOnElement(creditCardPaymentMethod);
        CustomListeners.test.log(Status.PASS,"Click on creditCardPayment" );
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS,"Click on continueButton2" );
    }

    public void selectCreditCardType(String creditCard) {
        selectByVisibleTextFromDropDown(creditCardType, creditCard);
        CustomListeners.test.log(Status.PASS,"creditCardType" );
    }

    public void fillingCardDetails(String cardName, String number, String month1, String year1, String code) {

        sendTextToElement(cardDetails, cardName);
        sendTextToElement(cardNumber, number);
        selectByVisibleTextFromDropDown(month, month1);
        selectByVisibleTextFromDropDown(year, year1);
        sendTextToElement(cardCode, code);
        CustomListeners.test.log(Status.PASS,"creditCardDetails" );
    }

    public void fillingCardDetails1(String country, String city, String address1, String zip, String phoneNumber) {
        selectByVisibleTextFromDropDown(countryField, country);
        sendTextToElement(cityField, city);
        sendTextToElement(address1Field, address1);
        sendTextToElement(zipField, zip);
        sendTextToElement(phoneNumberField, phoneNumber);
        CustomListeners.test.log(Status.PASS,"creditCardDetails1" );
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
        CustomListeners.test.log(Status.PASS,"Click on continueButton3" );
    }

    public void clickOnConfirm() {
        clickOnElement(confirm);
        CustomListeners.test.log(Status.PASS,"Click on confirm" );
    }

    public void clickOnContinueButton4() {
        clickOnElement(continueButton4);
        CustomListeners.test.log(Status.PASS,"Click on continueButton4" );
    }

}
