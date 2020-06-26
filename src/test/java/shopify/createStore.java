package shopify;

import com.github.javafaker.Faker;
import commons.AbstractPage;
import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObject.ShopifyPO;
import pageUI.ShopifyPageUI;

import java.util.Locale;
import java.util.Random;

public class createStore extends AbstractTest {
    private WebDriver driver;
    private AbstractPage abstractPage;
    private ShopifyPO shopifyPage;
    String email, storeName, storeNameBackup, phoneNumber, dateTime, country, address;
    boolean isStoreNameExisted;
    public int randomNumber;
    Faker faker;


    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browserName) {
        driver = getBrowserDriver(browserName);
        abstractPage = new AbstractPage(driver);
        faker = new Faker(new Locale("en-US"));
    }

    @Test(invocationCount = 3)
    public void TC01_CreateShopifyStore() {
        //Init data
        Random random = new Random();
        randomNumber = random.nextInt(9999);
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        country = shopifyPage.getRandomCountry();
        address = faker.address().streetAddress();

        email = faker.name().firstName() + "_" + faker.name().lastName() + "@mail.com";
        storeName = faker.name().firstName() + " " + faker.name().lastName();
        storeNameBackup = faker.name().fullName() + country;
        phoneNumber = Constants.PHONE_NUMBER + abstractPage.randomNumber(Constants.RAMDOM_BOUND);

        //Create store test
        log.info("Pre-condition: Access Shopify");
        driver.get(Constants.URL);

        log.info("Step 01: Press on Start free trial button");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.clickToStartFreeTrialBtn();

        log.info("Step 02: Fill info to register");
        shopifyPage.inputToRegisterTextBoxes("Email address", email);
        shopifyPage.inputToRegisterTextBoxes("Password", Constants.SHOPIFY_PASSWORD);
        shopifyPage.inputToRegisterTextBoxes("Your store name", storeName);

        log.info("Step 03: Press Create your store button");
        isStoreNameExisted = abstractPage.isElementPresentInDOM(ShopifyPageUI.ERR_NAME_EXISTS);
//        if (isStoreNameExisted) {
//            shopifyPage.inputToRegisterTextBoxes("Your store name", storeNameBackup);
//        } else {
            shopifyPage.clickToCreateYourStoreButton();
//        }

        log.info("Step 04: Verify the user can create the store");
        verifyTrue(shopifyPage.isRegisterInfoAcceptable());

        log.info("Step 05: Fill info at About yourself");
        boolean isDropdownStepChanged = abstractPage.isElementPresentInDOM(ShopifyPageUI.DROPDOWN_SEEDING_QUESTION);
        if (isDropdownStepChanged) {
            shopifyPage.selectAlreadySellingDropdown(Constants.ALREADY_SELLING);
            shopifyPage.selectCurrentRevenueDropdown(Constants.CURRENT_REVENUE);
            shopifyPage.selectIndustryDropdown(Constants.INDUSTRY);
        } else {
            shopifyPage.selectDescribesDropdown(1);
        }
        shopifyPage.clickToNextButton();

        log.info("Step 06: Fill address");
        shopifyPage.inputAddressTextboxes("firstName", faker.name().firstName());
        shopifyPage.inputAddressTextboxes("lastName", faker.name().lastName());
        shopifyPage.inputAddressTextboxes("address1", address);
        shopifyPage.inputAddressTextboxes("city", Constants.CITY);
        shopifyPage.selectCountry(country);
        System.out.println("Country: " + country);
        //Select the 2nd state/province
        shopifyPage.selectStateorProvince(2);
        shopifyPage.inputAddressTextboxes("zip", Constants.ZIPCODE);

        shopifyPage.inputAddressTextboxes("phone", phoneNumber);
        shopifyPage.clickToEnterMyStoreButton();


        log.info("Step 07: Verify the store has been created");
        verifyTrue(shopifyPage.isTheStoreCreated());
        dateTime = shopifyPage.getCurrentDateTime();
        shopifyPage.printStoreURL();
        System.out.println("Account info:");
        System.out.println("Email: " + email);
        System.out.println("Store Name: " + storeName);
        System.out.println("Created time: " + dateTime);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);


        log.info("Step 08: Write data to the csv");
        shopifyPage.writeDataToCsv(Constants.WRITE_CSV_FILE_PATH, email, storeName, country, address, dateTime);
        System.out.println("Written Data");
    }

    @AfterClass
    public void quitBrowser(){
        closeBrowserAndDriver(driver);
    }
}
