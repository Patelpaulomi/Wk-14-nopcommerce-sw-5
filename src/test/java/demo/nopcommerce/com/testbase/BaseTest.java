package demo.nopcommerce.com.testbase;


import demo.nopcommerce.com.propertyreader.PropertyReader;
import demo.nopcommerce.com.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser"); //"Chrome"
    @BeforeMethod

    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod

    public void tearDown(){
        closeBrowser();
    }

}
