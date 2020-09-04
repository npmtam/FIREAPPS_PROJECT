package pageObject;

import commons.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageUI.InstallAppUI;
import pageUI.ShopifyPageUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class OberloPO  extends AbstractPage {
    WebDriver driver;
    ReadDataCSV readDataCSV = new ReadDataCSV();
    AbstractTest abstractTest = new AbstractTest();
    boolean isInstalledApp;

    public OberloPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickToDynamicButtons(String buttonText) {
        waitToElementClickable(InstallAppUI.DYNAMIC_BUTTONS, buttonText);
        clickToElement(InstallAppUI.DYNAMIC_BUTTONS, buttonText);
    }

    public void selectAppsMenu(){
        waitToElementClickable(ShopifyPageUI.APPS_MENU);
        clickToElement(ShopifyPageUI.APPS_MENU);
        sleepInSecond(3);
    }

    public String searchOberlo(){
        final String[] keywords = new String[]{"Oberlo", "oberlo"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public void clickToVisitShopifyAppStore(){
        waitToElementClickable(ShopifyPageUI.VISIT_SHOPIFY_APP_STORE_BTN);
        clickToElement(ShopifyPageUI.VISIT_SHOPIFY_APP_STORE_BTN);
        sleepInSecond(3);
    }

    public void clickToInstallApp(){
        sleepInSecond(4);
        scrollToEndOfPage();
        waitToElementVisible(InstallAppUI.DYNAMIC_BUTTONS, "Install app");
        clickToDynamicButtons("Install app");
    }

    public void inputKeyword(String keyword){
        sleepInSecond(3);
        switchToWindowsByTitle("Shopify App Store: Ecommerce App Marketplace");
        waitToElementVisible(ShopifyPageUI.SEARCH_APPS_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.SEARCH_APPS_TEXTBOX, keyword);
    }

    public void selectOberloInAppStore(){
        waitToElementVisible(ShopifyPageUI.OBERLO_APP_IN_APPSTORE);
        clickToElement(ShopifyPageUI.OBERLO_APP_IN_APPSTORE);
    }

    public void clickToAddApp(){
        waitToElementClickable(ShopifyPageUI.ADD_APP_BTN);
        clickToElement(ShopifyPageUI.ADD_APP_BTN);
        sleepInSecond(3);
    }

    public void clickToSearchBtn(){
        sleepInSecond(5);
        waitToElementVisible(ShopifyPageUI.SEARCH_BTN);
        clickToElement(ShopifyPageUI.SEARCH_BTN);
    }

    public void inputToPassword(String password_oberlo){
            waitToElementVisible(ShopifyPageUI.NEW_PASSWORD);
            sendKeyToElement(ShopifyPageUI.NEW_PASSWORD, password_oberlo);
    }

    public void inputToConfirmNewPassword(String confirm_password_oberlo){
            waitToElementVisible(ShopifyPageUI.CONFIRM_NEW_PASSWORD);
            sendKeyToElement(ShopifyPageUI.CONFIRM_NEW_PASSWORD, confirm_password_oberlo);
    }

    public void clickToSavePassword(){
        waitToElementVisible(ShopifyPageUI.SAVE_PASSWORD);
        clickToElement(ShopifyPageUI.SAVE_PASSWORD);
    }

    public void clickToSearchProduct(){
        sleepInSecond(2);
        waitToElementClickable(ShopifyPageUI.SEARCH_PRODUCT_MENU);
        clickToElement(ShopifyPageUI.SEARCH_PRODUCT_MENU);
    }

    //product 1
    public void clickAddToImportList_1() {
        waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT1);
        clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT1);
        waitToElementClickable(ShopifyPageUI.ADD_PRODUCT1_TO_IMPORT_LIST);
        clickToElement(ShopifyPageUI.ADD_PRODUCT1_TO_IMPORT_LIST);
        sleepInSecond(1);
    }

    //product 2
    public void clickAddToImportList_2() {
            waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT2);
            clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT2);
            waitToElementClickable(ShopifyPageUI.ADD_PRODUCT2_TO_IMPORT_LIST);
            clickToElement(ShopifyPageUI.ADD_PRODUCT2_TO_IMPORT_LIST);
            sleepInSecond(1);
     }

     //product 3
    public void clickAddToImportList_3() {
            waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT3);
            clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT3);
            waitToElementClickable(ShopifyPageUI.ADD_PRODUCT3_TO_IMPORT_LIST);
            clickToElement(ShopifyPageUI.ADD_PRODUCT3_TO_IMPORT_LIST);
            sleepInSecond(1);
     }

     //product 4
    public void clickAddToImportList_4() {
            waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT4);
            clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT4);
            waitToElementClickable(ShopifyPageUI.ADD_PRODUCT4_TO_IMPORT_LIST);
            clickToElement(ShopifyPageUI.ADD_PRODUCT4_TO_IMPORT_LIST);
            sleepInSecond(1);
     }

     //product 5
    public void clickAddToImportList_5() {
            waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT5);
            clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT5);
            waitToElementClickable(ShopifyPageUI.ADD_PRODUCT5_TO_IMPORT_LIST);
            clickToElement(ShopifyPageUI.ADD_PRODUCT5_TO_IMPORT_LIST);
            sleepInSecond(1);
     }
     //product 6
     public void clickAddToImportList_6() {
         waitToElementClickable(ShopifyPageUI.CLICK_TO_ORDER_TEXT6);
         clickToElement(ShopifyPageUI.CLICK_TO_ORDER_TEXT6);
         waitToElementClickable(ShopifyPageUI.ADD_PRODUCT6_TO_IMPORT_LIST);
         clickToElement(ShopifyPageUI.ADD_PRODUCT6_TO_IMPORT_LIST);
         sleepInSecond(1);
     }


    public void inputNameProduct(String keyword){
        sleepInSecond(3);
        switchToWindowsByTitle("AliExpress");
        waitToElementVisible(ShopifyPageUI.SEARCH_PRODUCT_TEXTBOX);
        sendKeyToElement(ShopifyPageUI.SEARCH_PRODUCT_TEXTBOX, keyword);
    }

    public String searchProductOberlo(){
        final String[] keywords = new String[]{"Phone", "Watch", "Computer", "Shose", "Home", "Sport", "Office", "Electronic", "Lights", "Laptop"};
        Random random = new Random();
        int index = random.nextInt(keywords.length);
        return keywords[index];
    }

    public void clickToSearchProductBtn(){
        sleepInSecond(5);
        waitToElementVisible(ShopifyPageUI.SEARCH_BUTTON);
        clickToElement(ShopifyPageUI.SEARCH_BUTTON);
    }

    public void clickImportListMenu(){
        waitToElementVisible(ShopifyPageUI.IMPORT_LIST);
        clickToElement(ShopifyPageUI.IMPORT_LIST);
        sleepInSecond(3);
    }

    public void clickCheckboxAllProduct(){
        waitToElementVisible(ShopifyPageUI.SELECT_ALL_PRODUCT_CHECKBOX);
        clickToElement(ShopifyPageUI.SELECT_ALL_PRODUCT_CHECKBOX);
        sleepInSecond(3);
    }

    public void clickImportAllToStore(){
        waitToElementVisible(ShopifyPageUI.IMPORT_ALL_PRODUCT_TO_STORE);
        clickToElement(ShopifyPageUI.IMPORT_ALL_PRODUCT_TO_STORE);
        sleepInSecond(5);
    }

    public void clickToPushProduct(){
        waitToElementVisible(ShopifyPageUI.PUSH_PRODUCTS);
        clickToElement(ShopifyPageUI.PUSH_PRODUCTS);
        sleepInSecond(8);
    }

   /* public void clickBackShopifyAdmin(){
        waitToElementVisible(ShopifyPageUI.BACK_TO_SHOPIFY_ADMIN);
        clickToElement(ShopifyPageUI.BACK_TO_SHOPIFY_ADMIN);
        sleepInSecond(5);
    }*/

}
