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
import pageObject.MessentPO;
import pageUI.ShopifyPageUI;
import pageObject.OberloPO;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class createStoreAndInstallMessent extends AbstractTest {
    private WebDriver driver;
    private AbstractPage abstractPage;
    private ShopifyPO shopifyPage;
    private MessentPO messentPage;
    private OberloPO oberloPage;
    String email, storeName, phoneNumber, store_type, dateTime, country, city, address, firstName, lastName, password, password_confirmation;
    private String storeNameBackup, industry;
    boolean isStoreNameExisted;
    public int randomNumber;
    Faker faker;
    public String csvName;


    @Parameters("browser")
    @BeforeTest
    public void beforeTest() {
        driver = getBrowserDriver("chrome");
        abstractPage = new AbstractPage(driver);

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        csvName = dateFormat.format(date) + "_Messent.csv";

        //Init fake library
        faker = new Faker(new Locale("en-US"));

        //Clear data before test
        log.info("Pre-condition: Clear test data");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.clearStoreData(Constants.WRITE_CSV_FILE_PATH);
    }

    @Test(invocationCount = 7)
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
        password_confirmation = password;
        city = faker.address().city();
        store_type = Constants.FREE_PLAN;


        email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "@mail.com";
        storeName = firstName + " " + lastName;
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
        shopifyPage.inputToRegisterTextBoxes("Password", password);
        shopifyPage.inputToRegisterTextBoxes("Your store name", storeName);

        log.info("Step 03: Press Create your store button");
        isStoreNameExisted = abstractPage.isElementPresentInDOM(ShopifyPageUI.ERR_NAME_EXISTS);
        if (isStoreNameExisted) {
            shopifyPage.inputToRegisterTextBoxes("Your store name", storeNameBackup);
        } else {
        shopifyPage.clickToCreateYourStoreButton();
        }

        log.info("Step Verify Create an account");
        boolean isInputToCreateAnAccount = abstractPage.isElementPresentInDOM(ShopifyPageUI.TITLE_CREATE_AN_ACCOUNT);
        if (isInputToCreateAnAccount) {
            shopifyPage.inputToCreateAccount("first_name", firstName);
            shopifyPage.inputToCreateAccount("last_name", lastName);
            shopifyPage.inputToCreateAccount("password", password);
            shopifyPage.inputToCreateAccount("password_confirmation",password_confirmation);
            shopifyPage.clickToCreateAccountButton();
        }

        /*log.info("Step Create an account");
        shopifyPage.inputToCreateAccount("first_name", firstName);
        shopifyPage.inputToCreateAccount("last_name", lastName);
        shopifyPage.inputToCreateAccount("password", password);
        shopifyPage.inputToCreateAccount("password_confirmation",password_confirmation);
        shopifyPage.clickToCreateAccountButton();*/

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

        log.info("Step 09: Write data to the csv" + csvName);
        shopifyPage.writeDataToCsv(System.getProperty("user.dir") + "/src/test/resources/" + csvName, email, storeName, store_type, password, address, city, country, dateTime);
        //shopifyPage.writeDataToCsv(Constants.WRITE_CSV_FILE_PATH, email, storeName, store_type, password, address, city, country, dateTime);
        System.out.println("Written Data");

        //INSTALL OBERLO APP
        log.info("Step 12: Select Apps menu");
        oberloPage = PageGeneratorManager.getOberloPO(driver);
        oberloPage.selectAppsMenu();

        log.info("Step 13: Visit Shopify App store");
        oberloPage.clickToVisitShopifyAppStore();

        log.info("Step 14: Search app Oberlo");
        oberloPage.inputKeyword(oberloPage.searchOberlo());
        oberloPage.clickToSearchBtn();

        log.info("Random delay");
        shopifyPage.sleepRandomly();

        log.info("Step 15: Select Oberlo app");
        oberloPage.selectOberloInAppStore();

        log.info("Step 16: Add Oberlo app to store");
        oberloPage.clickToAddApp();
        oberloPage.clickToInstallApp();

        log.info("Setup account password Oberlo");
        oberloPage.inputToPassword("QA12345678");
        oberloPage.inputToConfirmNewPassword( "QA12345678");
        oberloPage.clickToSavePassword();

        log.info("Search product Oberlo");
        oberloPage.clickToSearchProduct();

        log.info("Search random product");
        oberloPage.inputNameProduct(oberloPage.searchProductOberlo());
        oberloPage.clickToSearchProductBtn();

        log.info("Add product to import list");
        oberloPage.clickAddToImportList_1();
        oberloPage.clickAddToImportList_2();
        oberloPage.clickAddToImportList_3();
        oberloPage.clickAddToImportList_4();
        oberloPage.clickAddToImportList_5();
        oberloPage.clickAddToImportList_6();
        log.info("Import List product");
        oberloPage.clickImportListMenu();
        oberloPage.clickCheckboxAllProduct();
        oberloPage.clickImportAllToStore();
        oberloPage.clickToPushProduct();
        shopifyPage.sWitchTab();

        //BACK TO SHOPIFY AND CHOOSE THEMES
        /*log.info("Setting Themes");
        shopifyPage.clickToThemesMenu();
        shopifyPage.clickExploreFreeThemes();
        shopifyPage.clickSelectThemes();
        shopifyPage.selectActionPublishTheme();*/

        //ADD FREE SHOPIFY APP (RANDOM FROM LIST)
        log.info("Step: Select Apps menu");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.selectAppsMenu();

        log.info("Step: Visit Shopify App store");
        shopifyPage.clickToVisitShopifyAppStore();

        log.info("Random delay");
        shopifyPage.sleepRandomly();

        log.info("Step: Search free Shopify app");
        shopifyPage.inputKeyword(shopifyPage.searchFreeShopifyApp());
        shopifyPage.clickToSearchBtn();

        log.info("Step: Select app");
        shopifyPage.selectFreeShopifyAppRandom();

        log.info("Step: Add random app to store");
        shopifyPage.clickToAddApp();
        shopifyPage.clickToInstallApp();
        shopifyPage.sWitchTab();


        //ADD FREE OTHER APP (RAMDOM FROM LIST)
        log.info("Step: Select Apps menu");
        shopifyPage = PageGeneratorManager.getShopifyPage(driver);
        shopifyPage.selectAppsMenu();

        log.info("Step: Visit Shopify App store");
        shopifyPage.clickToVisitShopifyAppStore();

        log.info("Step: Search free Shopify app");
        shopifyPage.inputKeyword(shopifyPage.searchFreeOtherApp());
        shopifyPage.clickToSearchBtn();

        log.info("Step: Select app");
        shopifyPage.selectFreeOtherAppRandom();

        log.info("Step: Add random app to store");
        shopifyPage.clickToAddApp();
        shopifyPage.clickToInstallApp();
        shopifyPage.sWitchTab();

        //Install Messent app
        // pause code
        log.info("Step 12: Select Apps menu");
        messentPage = PageGeneratorManager.getMessentPage(driver);
        messentPage.selectAppsMenu();

        log.info("Step 13: Visit Shopify App store");
        messentPage.clickToVisitShopifyAppStore();

        log.info("Random delay");
        shopifyPage.sleepRandomly();

        log.info("Step 14: Search app by keyword");
        messentPage.inputKeyword(messentPage.getRandomKeyword());
        messentPage.clickToSearchBtn();

        /*log.info("Step 14.1: Load page 2");
        messentPage.clickToLoadPageTwo();*/

        log.info("Step 15: Select Messent app");
        messentPage.selectMessentInAppStore();

        log.info("Step 16: Add Messent app to store");
        messentPage.clickToAddApp();
        messentPage.clickToInstallApp();

        log.info("Step 17: Verify the choose plan page display");
        verifyTrue(messentPage.isChoosePlanPageDisplay());

       log.info("Random click choose plan free");
       messentPage.randomClickChoosePlanFree();
       shopifyPage.sWitchTab();
    }

//    @Test
    public void TC02_ReadAndInstallTranscy(){
        log.info("Read data from CSV file and install Messent app depends on Store Type column");
        messentPage = PageGeneratorManager.getMessentPage(driver);
        messentPage.readDataCsv();
    }

    @AfterClass
    public void quitBrowser() {
        closeBrowserAndDriver(driver);
    }
}
