package commons;

import org.openqa.selenium.WebDriver;
import pageObject.*;

public class PageGeneratorManager {
    public static ShopifyPO getShopifyPage(WebDriver driver) {
        return new ShopifyPO(driver);
    }

    public static OriginalPO getOriginalPage(WebDriver driver){
        return new OriginalPO(driver);
    }

    public static WhatNewPO getWhatNewPage(WebDriver driver){
        return new WhatNewPO(driver);
    }

    public static WebsitePO getWebsitePage(WebDriver driver){
        return new WebsitePO(driver);
    }

    public static TranscyPO getTranscyPage(WebDriver driver){
        return new TranscyPO(driver);
    }
}
