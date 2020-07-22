package pageObject;

import commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import pageUI.ShopifyPageUI;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

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
    }

    public void clickToCreateYourStoreButton() {
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
    }

    public void selectCurrentRevenueDropdown(String item) {
        waitToElementVisible(ShopifyPageUI.DROPDOWN_BUSINESS_REVENUE);
        selectItemInDropdown(ShopifyPageUI.DROPDOWN_BUSINESS_REVENUE, item);
    }

    public void selectIndustryDropdown(String item) {
        waitToElementVisible(ShopifyPageUI.DROPDOWN_STORE_INDUSTRY);
        selectItemInDropdown(ShopifyPageUI.DROPDOWN_STORE_INDUSTRY, item);
    }

    public void selectDescribesDropdown(int index) {
        waitToElementVisible(ShopifyPageUI.DROPDOWN_DESCRIBES);
        selectItemInDropdownByIndex(ShopifyPageUI.DROPDOWN_DESCRIBES, index);
    }

    public void clickToNextButton() {
        waitToElementClickable(ShopifyPageUI.NEXT_BUTTON);
        clickToElement(ShopifyPageUI.NEXT_BUTTON);
    }

    public void inputAddressTextboxes(String nameValue, String textValue) {
        if (isElementPresentInDOM(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, nameValue)) {
            waitToElementVisible(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, nameValue);
            sendKeyToElement(ShopifyPageUI.ADDRESS_INFO_TEXTBOXES, textValue, nameValue);
        }
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

        if(!dest.exists()){
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
        final String[] countries = new String[]{"Afghanistan", "Åland Islands", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua & Barbuda",
                "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
                "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia & Herzegovina", "Botswana", "Brazil", "British Virgin Islands", "Brunei",
                "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Chad",
                "Chile", "China", "Colombia", "Comoros", "Congo - Brazzaville", "Congo - Kinshasa", "Cook Islands", "Costa Rica", "Croatia", "Curaçao", "Cyprus",
                "Czechia", "Côte d’Ivoire", "Denmark", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Estonia",
                "Eswatini", "Ethiopia", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "Gabon", "Gambia", "Georgia", "Germany", "Ghana",
                "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guatemala", "Guernsey", "Guyana", "Haiti", "Honduras", "Hong Kong SAR China", "Hungary",
                "Iceland", "India", "Indonesia", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya",
                "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Liechtenstein", "Lithuania", "Luxembourg", "Macao SAR China", "Madagascar",
                "Malawi", "Malaysia", "Maldives", "Malta", "Martinique", "Mauritius", "Mayotte", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco",
                "Mozambique", "Myanmar (Burma)", "Namibia", "Nepal", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia",
                "Norway", "Oman", "Pakistan", "Palestinian Territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar",
                "Réunion", "Romania", "Russia", "Rwanda", "Samoa", "San Marino", "São Tomé & Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Singapore",
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

    public void clearStoreData(String fileName){
        try {
            FileWriter fileWriter = new FileWriter(fileName, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
