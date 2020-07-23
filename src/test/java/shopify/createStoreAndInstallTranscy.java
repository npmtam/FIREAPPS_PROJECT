package shopify;

import com.github.javafaker.Faker;
import commons.AbstractPage;
import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.ShopifyPO;
import pageObject.TranscyPO;
import pageUI.ShopifyPageUI;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.lang.Thread;

public class createStoreAndInstallTranscy extends AbstractTest {
    private WebDriver driver;
    private AbstractPage abstractPage;
    private ShopifyPO shopifyPage;
    private TranscyPO transcyPage;
    String email, storeName, phoneNumber, store_type, dateTime, country, city, address, firstName, lastName, password;
    private String storeNameBackup, industry;
    boolean isStoreNameExisted;
    public int randomNumber;
    Faker faker;
    public  String csvName;


    @Parameters("browser")
    @BeforeTest
    public void beforeTest() {
        driver = getBrowserDriver("chrome");
        abstractPage = new AbstractPage(driver);

        //Init fake library
        faker = new Faker(new Locale("en-US"));

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        csvName = dateFormat.format(date) + "_Transcy.csv";

        //Clear data before test
        log.info("Pre-condition: Clear test data");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.clearStoreData(Constants.WRITE_CSV_FILE_PATH);
    }

    @Test(invocationCount = 1)
    public void TC01_CreateShopifyStore() throws IOException {
        //Init data
        Random random = new Random();
        randomNumber = random.nextInt(99);
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        country = shopifyPage.getRandomCountry();
        industry = shopifyPage.getRandomIndustry();
        address = faker.address().streetAddress();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        password = faker.name().firstName() + randomNumber;
        city = faker.address().city();
        store_type = Constants.FREE_PLAN;

        email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@mail.com";
        storeName = firstName + " " + lastName;
        storeNameBackup = faker.name().fullName() + country;
        phoneNumber = Constants.PHONE_NUMBER + abstractPage.randomNumber(Constants.RAMDOM_BOUND);

//        try {
//            log.info("Sleep 10s");
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //Create store test
        log.info("Pre-condition: Access Shopify");
        driver.get(Constants.URL);

        log.info("Step 01: Press on Start free trial button");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.clickToStartFreeTrialBtn();

        log.info("Step 02: Fill info to register");
        shopifyPage.inputToRegisterTextBoxes("Email address", email);
        shopifyPage.inputToRegisterTextBoxes("Password", password);
        shopifyPage.inputToRegisterTextBoxes("Your store name", storeName);

        log.info("Step 03: Press Create your store button");
        isStoreNameExisted = abstractPage.isElementPresentInDOM(ShopifyPageUI.ERR_NAME_EXISTS);
        if (isStoreNameExisted) {
            shopifyPage.inputToRegisterTextBoxes("Your store name", storeNameBackup);
        } else {
        shopifyPage.clickToCreateYourStoreButton();
        }

        log.info("Step 04: Verify the user can create the store");
        verifyTrue(shopifyPage.isRegisterInfoAcceptable());

        log.info("Step 05: Fill info at About yourself");
        boolean isDropdownStepChanged = abstractPage.isElementPresentInDOM(ShopifyPageUI.DROPDOWN_SEEDING_QUESTION);
        if (isDropdownStepChanged) {
            shopifyPage.selectAlreadySellingDropdown(Constants.ALREADY_SELLING);
            shopifyPage.selectCurrentRevenueDropdown(Constants.CURRENT_REVENUE);
            shopifyPage.selectIndustryDropdown(industry);
        } else {
            shopifyPage.selectDescribesDropdown(1);
        }
        shopifyPage.clickToNextButton();

        log.info("Step 06: Fill address");
        shopifyPage.inputAddressTextboxes("firstName", firstName);
        shopifyPage.inputAddressTextboxes("lastName", lastName);
        shopifyPage.inputAddressTextboxes("address1", address);
        shopifyPage.inputAddressTextboxes("city", city);
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

        log.info("Step 08: Print store info");
        shopifyPage.printStoreURL();
        System.out.println("Account info:");
        System.out.println("Email: " + email);
        System.out.println("Store Name: " + storeName);
        System.out.println("Store type: " + store_type);
        System.out.println("Password: " + password);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Created time: " + dateTime);

//        log.info("Step 09: Write data to the csv");
//        shopifyPage.writeDataToCsv(Constants.WRITE_CSV_FILE_PATH, email, storeName, store_type, password, address, city, country, dateTime);
//        System.out.println("Written Data");

        log.info("Step 09: Write data to the csv" + csvName);
        shopifyPage.writeDataToCsv(System.getProperty("user.dir") + "/src/test/resources/" + csvName, email, storeName, store_type, password, address, city, country, dateTime);
        System.out.println("Written Data");

        //Create item
        log.info("Step 10: Add new product");
        shopifyPage.clickToProductMenu();
        shopifyPage.clickToAddProduct();
        shopifyPage.inputToProductName("Test");
        shopifyPage.clickToSaveProduct();

        log.info("Step 11: Verify the product has been added");
        verifyTrue(shopifyPage.isPreviewProductButtonDisplayed());

        //Install Transcy app
        log.info("Step 12: Select Apps menu");
        transcyPage = PageGeneratorManager.getTranscyPage(driver);
        transcyPage.selectAppsMenu();

        log.info("Step 13: Visit Shopify App store");
        transcyPage.clickToVisitShopifyAppStore();

        log.info("Step 14: Search app by keyword");
        transcyPage.inputKeyword(transcyPage.getRandomKeyword());
        transcyPage.clickToSearchBtn();

        log.info("Step 15: Select Transcy app");
        transcyPage.selectTranscyInAppStore();

        log.info("Step 16: Add Transcy app to store");
        transcyPage.clickToAddApp();
        transcyPage.clickToInstallApp();

        log.info("Step 17: Verify the required upgrade page display");
        verifyTrue(transcyPage.isRequiredUpgradePageDisplay());


    }

//    @Test
    public void TC02_ReadAndInstallTranscy(){
        log.info("Read data from CSV file and install Transcy app depends on Store Type column");
        transcyPage = PageGeneratorManager.getTranscyPage(driver);
        transcyPage.readDataCsv();
    }

    @AfterClass
    public void quitBrowser() {
        closeBrowserAndDriver(driver);
    }
}
