package pageObject;

import commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageUI.InstallAppUI;
import pageUI.ShopifyPageUI;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShopifyPO extends AbstractPage {
    WebDriver driver;
    public String storeURL;
    AbstractTest abstractTest = new AbstractTest();
    ReadDataCSV readDataCSV = new ReadDataCSV();

    public ShopifyPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToStartFreeTrialBtn() {
        waitToElementClickable(ShopifyPageUI.START_FREE_TRIAL_BUTTON);
        clickToElement(ShopifyPageUI.START_FREE_TRIAL_BUTTON);
    }

    public void inputToRegisterTextBoxes(String placeHolder, String value) {
        waitToElementVisible(ShopifyPageUI.REGISTER_TEXT_BOXES, placeHolder);
        sendKeyToElement(ShopifyPageUI.REGISTER_TEXT_BOXES, value, placeHolder);
        sleepInSecond(1);
    }

    public void clickToCreateYourStoreButton() {
        sleepInSecond(3);
        waitToElementClickable(ShopifyPageUI.CREATE_YOUR_STORE_BUTTON);
        clickToElement(ShopifyPageUI.CREATE_YOUR_STORE_BUTTON);
        clickToElement(ShopifyPageUI.CREATE_YOUR_STORE_BUTTON);
    }

    public boolean isRegisterInfoAcceptable() {
        waitToElementVisible(ShopifyPageUI.TITLE_MORE_INFO);
        return isElementPresentInDOM(ShopifyPageUI.TITLE_MORE_INFO);
    }

    public void selectAlreadySellingDropdown(String item) {
        waitToElementVisible(ShopifyPageUI.DROPDOWN_SEEDING_QUESTION);
        selectItemInDropdown(ShopifyPageUI.DROPDOWN_SEEDING_QUESTION, item);
        sleepInSecond(2);
    }

    public void selectCurrentRevenueDropdown(String item) {
        sleepInSecond(3);
        waitToElementVisible(ShopifyPageUI.DROPDOWN_BUSINESS_REVENUE);
        selectItemInDropdown(ShopifyPageUI.DROPDOWN_BUSINESS_REVENUE, item);
    }

    public void selectIndustryDropdown(String item) {
        sleepInSecond(3);
        waitToElementVisible(ShopifyPageUI.DROPDOWN_STORE_INDUSTRY);
        selectItemInDropdown(ShopifyPageUI.DROPDOWN_STORE_INDUSTRY, item);
    }

    public void selectDescribesDropdown(int index) {
        sleepInSecond(3);
        waitToElementVisible(ShopifyPageUI.DROPDOWN_DESCRIBES);
        selectItemInDropdownByIndex(ShopifyPageUI.DROPDOWN_DESCRIBES, index);
    }

    public void clickToNextButton() {
        sleepInSecond(3);
        waitToElementClickable(ShopifyPageUI.NEXT_BUTTON);
        clickToElement(ShopifyPageUI.NEXT_BUTTON);
    }

    public void inputAddressTextboxes(String nameValue, String textValue) {
        if (isElementPresentInDOM(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, nameValue)) {
            waitToElementVisible(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, nameValue);
            sendKeyToElement(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, textValue, nameValue);
        }
    }

    public void inputToCreateAccount(String nameValue, String textValue) {
        if (isElementPresentInDOM(ShopifyPageUI.CREATE_ACCOUNT_TEXTBOXES, nameValue)) {
            waitToElementVisible(ShopifyPageUI.CREATE_ACCOUNT_TEXTBOXES, nameValue);
            sendKeyToElement(ShopifyPageUI.CREATE_ACCOUNT_TEXTBOXES, textValue, nameValue);
        }
    }

    public void clickToCreateAccountButton() {
        sleepInSecond(3);
        waitToElementClickable(ShopifyPageUI.CREATE_ACCOUNT_BUTTON);
        clickToElement(ShopifyPageUI.CREATE_ACCOUNT_BUTTON);
    }


    public void clickToEnterMyStoreButton() {
        sleepInSecond(1);
        waitToElementClickable(ShopifyPageUI.ENTER_MY_STORE_BUTTON);
        clickToElement(ShopifyPageUI.ENTER_MY_STORE_BUTTON);
        sleepInSecond(1);
        if (isElementPresentInDOM(ShopifyPageUI.ERR_ZIP_CODE)) {
            inputAddressTextboxes("zip", "2020");
        }
    }

    public boolean isTheStoreCreated() {
        return isElementDisplayed(ShopifyPageUI.SELECT_PLAN_MSG);
    }

    public void printStoreURL() {
        if (isTheStoreCreated()) {
            String urlContains = driver.getCurrentUrl();
            storeURL = urlContains.substring(0, urlContains.length() - 6);
            System.out.println("Store URL: " + storeURL);
        }
    }


    public void clickToLoginButton() {
        waitToElementClickable(ShopifyPageUI.LOGIN_BUTTON);
        clickToElement(ShopifyPageUI.LOGIN_BUTTON);
    }

    public void clickLoginToAnotherAccount() {
        waitToElementClickable(ShopifyPageUI.LOGIN_TO_ANOTHER_ACCOUNT);
        clickToElement(ShopifyPageUI.LOGIN_TO_ANOTHER_ACCOUNT);
    }

    public void inputToStoreURLTextBox(String url) {
        waitToElementVisible(ShopifyPageUI.STORE_URL_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.STORE_URL_TEXTBOX, url);
    }

    public void inputToEmailPasswordTextBoxes(String attributeValue, String textValue) {
        waitToElementVisible(ShopifyPageUI.EMAIL_PASSWORD_TEXTBOXES, attributeValue);
        sendKeyToElement(ShopifyPageUI.EMAIL_PASSWORD_TEXTBOXES, textValue, attributeValue);
    }

    public void clickToDynamicButton(String attributeValue) {
        waitToElementClickable(ShopifyPageUI.DYNAMIC_BUTTON, attributeValue);
        clickToElement(ShopifyPageUI.DYNAMIC_BUTTON, attributeValue);
    }

    public boolean isStoreNameLabelDisplayed(String storeName) {
        waitToElementClickable(ShopifyPageUI.STORE_NAME_LABEL, storeName);
        return isElementDisplayed(ShopifyPageUI.STORE_NAME_LABEL, storeName);
    }

    public void clickToAppsMenu() {
        sleepInSecond(5);
        waitToElementClickable(ShopifyPageUI.APPS_MENU);
        clickToElement(ShopifyPageUI.APPS_MENU);
    }

    public void clickToDeleteOriginalApp() {
        waitToElementClickable(ShopifyPageUI.DELETE_ORIGINAL);
        clickToElement(ShopifyPageUI.DELETE_ORIGINAL);
    }

    public void clickToConfirmDeleteOriginal() {
        sleepInSecond(1);
        waitToElementClickable(ShopifyPageUI.CONFIRM_DELETE_ORIGINAL);
        waitToElementVisible(ShopifyPageUI.DELETE_APP_CONFIRMATION_TEXT);
        clickToElement(ShopifyPageUI.CONFIRM_DELETE_ORIGINAL);
    }

    public void writeDataToCsv(String fileName, String email, String storeName, String store_type, String password, String address, String city, String country, String dateTime) throws IOException {
        //Create new data object
        StoresLink data = new StoresLink(storeURL, email, storeName, store_type, password, address, city, country, dateTime);

        List<StoresLink> storeData = new ArrayList<>();
        storeData.add(data);
        File src = new File(System.getProperty("user.dir") + "/src/test/resources/templateStoreData.csv");
        File dest = new File(fileName);

        if (!dest.exists()) {
            FileUtils.copyFile(src, dest);
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            //Write the CSV file Header
//            fileWriter.append(Constants.FILE_HEADER);
            //Add a new line separator after the header
//            fileWriter.append(Constants.NEW_LINE_SEPARATOR);

            //Write new data objects list to the CSV file
            for (StoresLink storeValues : storeData) {
                fileWriter.append(storeValues.getUrl());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getEmail());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getStoreName());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getStore_type());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getPassword());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getAddress());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getCity());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getCountry());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getDateTime());
            }

            fileWriter.append(Constants.NEW_LINE_SEPARATOR);

            System.out.println("CSV file was created successfully !!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!");
                e.printStackTrace();
            }
        }
    }



    public void writeCsvFileKeywordSearch(String fileName, String keyword, String dateTime) throws IOException {
        Keyword data = new Keyword(keyword, dateTime);

        List<Keyword> keywords = new ArrayList<>();
        keywords.add(data);
        File src = new File(System.getProperty("user.dir") + "/src/test/resources/templateStoreData.csv");
        File dest = new File(fileName);

        if (!dest.exists()) {
            FileUtils.copyFile(src, dest);
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            //Write the CSV file Header
//            fileWriter.append(Constants.FILE_HEADER);
            //Add a new line separator after the header
//            fileWriter.append(Constants.NEW_LINE_SEPARATOR);

            //Write new data objects list to the CSV file
            for (Keyword storeValues :keywords) {
                fileWriter.append(storeValues.getKeyword());
                fileWriter.append(Constants.COMMA_DELIMITER);
                fileWriter.append(storeValues.getDateTime());
            }

            fileWriter.append(Constants.NEW_LINE_SEPARATOR);

            System.out.println("CSV file was created successfully !!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!");
                e.printStackTrace();
            }
        }
    }

    public void uninstallApps(List<String> store) {
        String stt = store.get(0);
        Constants.STORE_URL_CSV = store.get(1);
        Constants.STORE_EMAIL_CSV = store.get(2);
        Constants.STORE_NAME_CSV = store.get(3);
        Constants.STORE_TYPE_CSV = store.get(4);

        driver.get(Constants.URL);
        clickToLoginButton();
        if (isElementPresentInDOM(ShopifyPageUI.LOGIN_TO_ANOTHER_ACCOUNT)) {
            clickLoginToAnotherAccount();
        }
        inputToStoreURLTextBox(Constants.STORE_URL_CSV);
        clickToDynamicButton("Next");
        inputToEmailPasswordTextBoxes("email", Constants.STORE_EMAIL_CSV);
        clickToDynamicButton("Next");
        inputToEmailPasswordTextBoxes("password", Constants.SHOPIFY_PASSWORD);
        clickToDynamicButton("Log in");
        //Verify login successfully
        abstractTest.verifyTrue(isStoreNameLabelDisplayed(Constants.STORE_NAME_CSV));
        clickToAppsMenu();
        if (isElementPresentInDOM(ShopifyPageUI.DELETE_ORIGINAL)) {
            clickToDeleteOriginalApp();
            clickToConfirmDeleteOriginal();
            String deleteSuccess = getTextElement(ShopifyPageUI.DELETE_SUCCESS_MESSAGE);
            abstractTest.verifyTrue(deleteSuccess.equals(Constants.DELETE_SUCCESS_MESSAGE));
            System.out.println("THE STORE " + Constants.STORE_NAME_CSV + " HAS BEEN REMOVED THE ORIGINAL APP");
            System.out.println("Ordinal Numbers: " + stt);
        } else {
            System.out.println("THIS STORE ALREADY DELETED THE ORIGINAL APP");
            System.out.println("Ordinal Numbers: " + stt);
        }
    }

    public String getRandomCountry() {
        //Declare list countries
        final String[] countries = new String[]{"Afghanistan", "Ã…land Islands", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua & Barbuda",
                "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
                "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia & Herzegovina", "Botswana", "Brazil", "British Virgin Islands", "Brunei",
                "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Chad",
                "Chile", "China", "Colombia", "Comoros", "Congo - Brazzaville", "Congo - Kinshasa", "Cook Islands", "Costa Rica", "Croatia", "CuraÃ§ao", "Cyprus",
                "Czechia", "CÃ´te dâ€™Ivoire", "Denmark", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Estonia",
                "Eswatini", "Ethiopia", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
                "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guatemala", "Guernsey", "Guyana", "Haiti", "Honduras", "Hong Kong SAR China", "Hungary",
                "Iceland", "India", "Indonesia", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya",
                "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Liechtenstein", "Lithuania", "Luxembourg", "Macao SAR China", "Madagascar",
                "Malawi", "Malaysia", "Maldives", "Malta", "Martinique", "Mauritius", "Mayotte", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco",
                "Mozambique", "Myanmar (Burma)", "Namibia", "Nepal", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia",
                "Norway", "Oman", "Pakistan", "Palestinian Territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar",
                "RÃ©union", "Romania", "Russia", "Rwanda", "Samoa", "San Marino", "SÃ£o TomÃ© & PrÃ­ncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Singapore",
                "Sint Maarten", "Slovakia", "Slovenia", "Solomon Islands", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "St. Kitts & Nevis", "St. Lucia",
                "St. Martin", "St. Vincent & Grenadines", "Sudan", "Suriname", "Sweden", "Switzerland", "Taiwan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Trinidad & Tobago",
                "Tunisia", "Turkey", "Turkmenistan", "Turks & Caicos Islands", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan",
                "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
        Random random = new Random();
        int index = random.nextInt(countries.length);
        return countries[index];
    }

    public void selectCountry(String country) {
        waitToElementVisible(ShopifyPageUI.COUNTRY_DROPDOWN);
        selectItemInDropdown(ShopifyPageUI.COUNTRY_DROPDOWN, country);
    }

    public String getRandomIndustry() {
        String[] industry = new String[]{"Beauty", "Clothing", "Electronics", "Furniture", "Handcrafts", "Jewelry",
                "Painting", "Photography", "Restaurants", "Groceries", "Other food & drink", "Sports", "Toys",
                "Services", "Virtual services"};
        Random random = new Random();
        int index = random.nextInt(industry.length);
        return industry[index];
    }

    public void selectStateorProvince(int index) {
        if (isElementPresentInDOM(ShopifyPageUI.STATES_DROPDOWN)) {
            waitToElementVisible(ShopifyPageUI.STATES_DROPDOWN);
            selectItemInDropdownByIndex(ShopifyPageUI.STATES_DROPDOWN, index);
        } else if (isElementPresentInDOM(ShopifyPageUI.PROVINCE_DROPDOWN)) {
            waitToElementVisible(ShopifyPageUI.PROVINCE_DROPDOWN);
            selectItemInDropdownByIndex(ShopifyPageUI.PROVINCE_DROPDOWN, index);
        } else {
            System.out.println("There is no State or Province for this country");
        }
    }

    public void readDataAndDeleteApp() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(Constants.READ_CSV_FILE_PATH));

            //Read file in java line by line
            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {
                    while ((line = br.readLine()) != null) {
                        uninstallApps(readDataCSV.parseCsvLine(line));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public String getCurrentDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        return df.format(calobj.getTime());
    }

    public void clickToProductMenu() {
        waitToElementVisible(ShopifyPageUI.PRODUCT_MENU);
        clickToElement(ShopifyPageUI.PRODUCT_MENU);
    }

    public void clickToAddProduct() {
        waitToElementClickable(ShopifyPageUI.ADD_PRODUCT_BTN);
        clickToElement(ShopifyPageUI.ADD_PRODUCT_BTN);
    }

    public void inputToProductName(String productName) {
        waitToElementVisible(ShopifyPageUI.PRODUCT_NAME_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.PRODUCT_NAME_TEXTBOX, productName);
    }

    public void clickToSaveProduct() {
        waitToElementClickable(ShopifyPageUI.SAVE_PRODUCT_BTN);
        clickToElement(ShopifyPageUI.SAVE_PRODUCT_BTN);
    }

    public boolean isPreviewProductButtonDisplayed() {
        return isElementDisplayed(ShopifyPageUI.PREVIEW_PRODUCT_BTN);
    }

    public void clearStoreData(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clickToThemesMenu() {
        driver.getWindowHandle();
        waitToElementClickable(ShopifyPageUI.ONLINE_STORE_MENU);
        clickToElement(ShopifyPageUI.ONLINE_STORE_MENU);
        sleepInSecond(5);
    }

    public void clickExploreFreeThemes() {
        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//button[@class='_1wLbD _1eWnt']")).click();
        scrollToEndOfPage();
        sleepInSecond(3);
    }

    public void clickSelectThemes() {
        sleepInSecond(3);
        WebDriverWait waiter = new WebDriverWait(driver, 1000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("app-modal-iframe");
        driver.findElement(By.xpath("//span[contains(text(),'Boundless')]")).click();
        sleepInSecond(5);
        //click button Add to themes libary
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='_1wLbD _1eCDN']")));
        driver.findElement(By.xpath("//button[@class='_1wLbD _1eCDN']")).click();
    }

    /*public void clickAddToThemeLibary(){
        WebElement iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//button[@class='_1wLbD _1eCDN']")).click();
        sleepInSecond(5);
        driver.switchTo().defaultContent();
    }*/

    public void selectActionPublishTheme() {
        sleepInSecond(10);
        WebDriverWait waiter = new WebDriverWait(driver, 1000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("app-iframe");
        driver.findElement(By.xpath("//button[@class='_1wLbD _32TRG']//span[@class='_1GgwJ'][contains(text(),'Actions')]")).click();
        waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Publish')]")));
        driver.findElement(By.xpath("//div[contains(text(),'Publish')]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("app-modal-iframe");
        driver.findElement(By.xpath("//button[@class='_1wLbD _1eCDN']")).click();
        driver.switchTo().defaultContent();
        sleepInSecond(10);
    }


    //ADD FREE SHOPIFY APPS (RANDOM 1 APP FROM LIST)
    public String searchFreeShopifyApp() {
        final String[] keywords = new String[]{"Facebook channel","Product Reviews", "Google Channel", "Kit", "Shopify Email", "Geolocation"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public String searchFreeOtherApp() {
        final String[] keywords = new String[]{"Free Trust Badge Master", "vimeo create - video marker", "Super Effects & Holiday Boost", "MassFulfill", "Thank You Email Marketing Tool"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public String searchFreeOtherApp2() {
        final String[] keywords = new String[]{"Spin Wheel Pop ups Email Popup", "Video Ad Machine", "Reveal: RFM Customer Tags", "Multi Pixels For Facebook", "Ultimate Trust Badges FREE!"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }


    public void clickToDynamicButtons(String buttonText) {
        waitToElementClickable(InstallAppUI.DYNAMIC_BUTTONS, buttonText);
        clickToElement(InstallAppUI.DYNAMIC_BUTTONS, buttonText);
    }

    public void selectAppsMenu() {
        driver.getCurrentUrl();
        waitToElementClickable(ShopifyPageUI.APPS_MENU);
        clickToElement(ShopifyPageUI.APPS_MENU);
        sleepInSecond(5);
    }

    public void clickTodDiscountsMenu() {
        driver.getCurrentUrl();
        waitToElementClickable(ShopifyPageUI.DISCOUNTS_MENU);
        clickToElement(ShopifyPageUI.DISCOUNTS_MENU);
        sleepInSecond(5);
    }

    public void clickCreateDiscountCode() {
        waitToElementClickable(ShopifyPageUI.CREATE_DISCOUNT_BTN);
        clickToElement(ShopifyPageUI.CREATE_DISCOUNT_BTN);
        sleepInSecond(3);
    }

    public void inputKeywordCodeName(String keyword) {
        sleepInSecond(3);
        waitToElementVisible(ShopifyPageUI.DISCOUNT_CODE_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.DISCOUNT_CODE_TEXTBOX, keyword);
    }

    public void inputKeywordCodeValue(String keyword) {
        sleepInSecond(3);
        waitToElementVisible(ShopifyPageUI.DISCOUNT_VALUE_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.DISCOUNT_VALUE_TEXTBOX, keyword);
    }

    public String inputCodeName(){
        final String[] keywords = new String[]{"HOLIDAY", "BACK2SCHOOL", "FESTIVE", "SPRINGDEAL", "FREESHIP", "BOOST SALES", "WELCOME", "DISCOUNT", "GIFTGUIDE", "NEW ARRIVAL"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public String inputDiscountValue(){
        final String[] keywords = new String[]{"5", "10", "15", "20"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public void checkToUsageLimits(){
        sleepInSecond(5);
        scrollPage();
        if (!isElementSelected(ShopifyPageUI.USAGE_LIMITS_CHECKBOX)){
            clickToElement(ShopifyPageUI.USAGE_LIMITS_CHECKBOX);
        }
    }

    public void clickToSave() {
        sleepInSecond(3);
        waitToElementClickable(ShopifyPageUI.SAVE_PRODUCT_BTN);
        clickToElement(ShopifyPageUI.SAVE_PRODUCT_BTN);
        sleepInSecond(5);
    }

    public void clickToVisitShopifyAppStore() {
        waitToElementClickable(ShopifyPageUI.VISIT_SHOPIFY_APP_STORE_BTN);
        clickToElement(ShopifyPageUI.VISIT_SHOPIFY_APP_STORE_BTN);
        sleepInSecond(3);
    }

    public void clickToInstallApp() {
        sleepInSecond(5);
        scrollToEndOfPage();
        if (isElementPresentInDOM(InstallAppUI.DYNAMIC_BUTTONS, "Install app")) {
            waitToElementVisible(InstallAppUI.DYNAMIC_BUTTONS, "Install app");
            clickToDynamicButtons("Install app");
        } else {
            waitToElementVisible(InstallAppUI.DYNAMIC_BUTTONS, "Add sales channel");
            clickToDynamicButtons("Add sales channel");
        }
    }

    public void inputKeyword(String keyword) {
        sleepInSecond(3);
        switchToWindowsByTitle("Shopify App Store: Ecommerce App Marketplace");
        waitToElementVisible(ShopifyPageUI.SEARCH_APPS_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.SEARCH_APPS_TEXTBOX, keyword);
    }

    //Free Shopify Apps
    public void selectFreeShopifyAppRandom() {
        if (isElementPresentInDOM(ShopifyPageUI.PRODUCT_REVIEW_APP_IN_APPSTORE)) {
            waitToElementVisible(ShopifyPageUI.PRODUCT_REVIEW_APP_IN_APPSTORE);
            clickToElement(ShopifyPageUI.PRODUCT_REVIEW_APP_IN_APPSTORE);
        } else if (isElementPresentInDOM(ShopifyPageUI.KIT_APP_IN_APPSTORE)) {
            waitToElementVisible(ShopifyPageUI.KIT_APP_IN_APPSTORE);
            clickToElement(ShopifyPageUI.KIT_APP_IN_APPSTORE);
        } else if (isElementPresentInDOM(ShopifyPageUI.GOOGLE_CHANNEL_APP_IN_APPSTORE)) {
            waitToElementVisible(ShopifyPageUI.GOOGLE_CHANNEL_APP_IN_APPSTORE);
            clickToElement(ShopifyPageUI.GOOGLE_CHANNEL_APP_IN_APPSTORE);
        } else if (isElementPresentInDOM(ShopifyPageUI.SHOPIFY_EMAIL_APP_IN_APPSTORE)) {
            waitToElementVisible(ShopifyPageUI.SHOPIFY_EMAIL_APP_IN_APPSTORE);
            clickToElement(ShopifyPageUI.SHOPIFY_EMAIL_APP_IN_APPSTORE);
        } else if (isElementPresentInDOM(ShopifyPageUI.FACEBOOK_CHANNEL_APP_IN_APPSTORE)) {
            waitToElementVisible(ShopifyPageUI.FACEBOOK_CHANNEL_APP_IN_APPSTORE);
            clickToElement(ShopifyPageUI.FACEBOOK_CHANNEL_APP_IN_APPSTORE);
        } else {
            waitToElementVisible(ShopifyPageUI.GEOLOCATION_IN_APPSTORE);
            clickToElement(ShopifyPageUI.GEOLOCATION_IN_APPSTORE);
        }
    }

    //Free Other Apps (List 1)
    public void selectFreeOtherAppRandom() {
        if (isElementPresentInDOM(ShopifyPageUI.FREE_TRUST_BADGE_MASTER)) {
            waitToElementVisible(ShopifyPageUI.FREE_TRUST_BADGE_MASTER);
            clickToElement(ShopifyPageUI.FREE_TRUST_BADGE_MASTER);
        } else if (isElementPresentInDOM(ShopifyPageUI.VIDEOFY_PRODUCT_VIDEO_MAKER)) {
            waitToElementVisible(ShopifyPageUI.VIDEOFY_PRODUCT_VIDEO_MAKER);
            clickToElement(ShopifyPageUI.VIDEOFY_PRODUCT_VIDEO_MAKER);
        } else if (isElementPresentInDOM(ShopifyPageUI.SUPER_EFFECTS_HOLIDAY_BOOST)) {
            waitToElementVisible(ShopifyPageUI.SUPER_EFFECTS_HOLIDAY_BOOST);
            clickToElement(ShopifyPageUI.SUPER_EFFECTS_HOLIDAY_BOOST);
        } else if (isElementPresentInDOM(ShopifyPageUI.THANK_YOU_EMAIL_MARKETING_TOOL)) {
            waitToElementVisible(ShopifyPageUI.THANK_YOU_EMAIL_MARKETING_TOOL);
            clickToElement(ShopifyPageUI.THANK_YOU_EMAIL_MARKETING_TOOL);
        } else {
            isElementPresentInDOM(ShopifyPageUI.MASSFULFILL);
            waitToElementVisible(ShopifyPageUI.MASSFULFILL);
            clickToElement(ShopifyPageUI.MASSFULFILL);
        }
    }

    //Free Other Apps (List 2)
    public void selectFreeOtherAppRandom2() {
        if (isElementPresentInDOM(ShopifyPageUI.SPIN_WHEEL_POP_UPS_EMAIL_POPUP)) {
            waitToElementVisible(ShopifyPageUI.SPIN_WHEEL_POP_UPS_EMAIL_POPUP);
            clickToElement(ShopifyPageUI.SPIN_WHEEL_POP_UPS_EMAIL_POPUP);
        } else if (isElementPresentInDOM(ShopifyPageUI.VIDEO_AD_MACHINE)) {
            waitToElementVisible(ShopifyPageUI.VIDEO_AD_MACHINE);
            clickToElement(ShopifyPageUI.VIDEO_AD_MACHINE);
        } else if (isElementPresentInDOM(ShopifyPageUI.REVEAL_RFM_CUSTOMER_TAGS)) {
            waitToElementVisible(ShopifyPageUI.REVEAL_RFM_CUSTOMER_TAGS);
            clickToElement(ShopifyPageUI.REVEAL_RFM_CUSTOMER_TAGS);
        } else if (isElementPresentInDOM(ShopifyPageUI.MULTI_PIXELS_FOR_FACEBOOK)) {
            waitToElementVisible(ShopifyPageUI.MULTI_PIXELS_FOR_FACEBOOK);
            clickToElement(ShopifyPageUI.MULTI_PIXELS_FOR_FACEBOOK);
        } else {
            isElementPresentInDOM(ShopifyPageUI.ULTIMATE_TRUST_BADGES_FREE);
            waitToElementVisible(ShopifyPageUI.ULTIMATE_TRUST_BADGES_FREE);
            clickToElement(ShopifyPageUI.ULTIMATE_TRUST_BADGES_FREE);
        }
    }


    public void clickToAddApp() {
        waitToElementClickable(ShopifyPageUI.ADD_APP_BTN);
        clickToElement(ShopifyPageUI.ADD_APP_BTN);
        sleepInSecond(3);
    }

    public void clickToSearchBtn() {
        sleepInSecond(5);
        waitToElementVisible(ShopifyPageUI.SEARCH_BTN);
        clickToElement(ShopifyPageUI.SEARCH_BTN);
    }

    public void sWitchTab() {
        sleepInSecond(5);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        sleepInSecond(3);
    }

    //random delay 30s- 80s
    public void sleepRandomly() {
        try {
            Thread.sleep(getMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public static long getMillis() {
        return (long) (Math.random() * 10_000 + 30_000);
    }

    public void chooseAccount() {
        sleepInSecond(2);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        isElementPresentInDOM(ShopifyPageUI.CHOOSE_ACCOUNT_SELECT);
        waitToElementVisible(ShopifyPageUI.CHOOSE_ACCOUNT_SELECT);
        clickToElement(ShopifyPageUI.CHOOSE_ACCOUNT_SELECT);
    }

    public void switchTabChooseAccount() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    public void switchToFirstWindow() {
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        //driver.switchTo().window(handlesList.get(1));
        //driver.close();
        driver.switchTo().window(handlesList.get(0));
    }


}
