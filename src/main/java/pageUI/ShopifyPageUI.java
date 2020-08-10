package pageUI;

public class ShopifyPageUI {
    //Register
    public static final String START_FREE_TRIAL_BUTTON = "//ul[@class='marketing-nav__items marketing-nav__user display--expanded-nav']//input[@value='Start free trial']";
    public static final String REGISTER_TEXT_BOXES = "//input[@placeholder='%s']";
    public static final String CREATE_YOUR_STORE_BUTTON = "//button[text()='Create your store']";

    //Error Msg
    public static final String ERR_NAME_EXISTS = "//span[contains(text(), 'A store with that name already exists')]";
    public static final String ERR_ZIP_CODE = "//div[@id='PolarisTextField8Error']";

    //Tell us a little about yourself
    public static final String TITLE_MORE_INFO = "//h1[text()='Tell us a little about yourself']";
    public static final String DROPDOWN_SEEDING_QUESTION = "//select[@id='QuestionnaireSelect-background']";
    public static final String DROPDOWN_BUSINESS_REVENUE = "//select[@id='QuestionnaireSelect-business_revenue']";
    public static final String DROPDOWN_STORE_INDUSTRY = "//select[@id='QuestionnaireSelect-store_industry']";
    public static final String DROPDOWN_DESCRIBES = "//select[@id='QuestionnaireSelect-which_best_describes_you']";
    public static final String NEXT_BUTTON = "//button[@aria-label='Next']";

    //Account
    public static final String CREATE_ACCOUNT_TEXTBOXES = "//input[@name='account[%s]']";
    public static final String CREATE_ACCOUNT_BUTTON = "//button[text()='Create account']";

    //Address info
    public static final String ADDRESS_INFO_TEXTBOXES = "//input[@name='account_setup[%s]']";
    public static final String ENTER_MY_STORE_BUTTON = "//button[@aria-label='Enter my store']";
    public static final String COUNTRY_DROPDOWN = "//select[@name='account_setup[country]']";
    public static final String STATES_DROPDOWN = "//select[@id='PolarisSelect3']";
    public static final String PROVINCE_DROPDOWN = "//select[@id='PolarisSelect2']";

    //Admin Page
    public static final String SELECT_PLAN_MSG = "//p[text()='Your trial just started']";
    public static final String STORE_NAME_LABEL = "//div[@class='_1lIG3']//span[text()='%s']";
    public static final String APPS_MENU = "//a[@href='/admin/apps']";
    public static final String DELETE_ORIGINAL = "//button[@aria-label='Delete origin-app-dev']";
    public static final String CONFIRM_DELETE_ORIGINAL = "//div[@class='_1fyLs']//span[text()='Delete']";
    public static final String DELETE_SUCCESS_MESSAGE = "//div[@id='Banner1Content']";
    public static final String PRODUCT_MENU = "//span[text()='Products']/ancestor::a";
    public static final String ADD_PRODUCT_BTN = "//span[text()='Add product']/ancestor::a";
    public static final String PRODUCT_NAME_TEXTBOX = "//input[@name='title']";
    public static final String SAVE_PRODUCT_BTN = "//span[text()='Save']/ancestor::button";
    public static final String PREVIEW_PRODUCT_BTN = "//span[text()='Preview']/ancestor::button";
    public static final String VISIT_SHOPIFY_APP_STORE_BTN = "//span[text()='Visit the Shopify App Store']/ancestor::a";
    public static final String SEARCH_APPS_TEXTBOX = "//input[@type='search' and contains(@class, 'hero')]";
    public static final String TRANSCY_APP_IN_APPSTORE = "//div[@class='ui-app-card' and not (contains(@data-target-href, 'ad'))]//h4[contains(text(), 'Transcy')]";
    public static final String MESSENT_APP_IN_APPSTORE = "//div[@class='ui-app-card' and not (contains(@data-target-href, 'ad'))]//h4[contains(text(), 'Messent')]";
    public static final String ADD_APP_BTN = "//input[@value='Add app']";
    public static final String UPGRADE_YOUR_ACCOUNT_PAGE = "//h1[text()='Upgrade your account']";
    public static final String SEARCH_BTN = "//button[@type='submit' and contains(@class, 'hero-search')]";
    public static final String CHOOSE_PLAN = "//h4[text()='Choose your plan']";
    public static final String ONLINE_STORE = "//a[@href='/admin/themes?channel=true']";
    public static final String OBERLO_APP_IN_APPSTORE = "//div[@class='ui-app-card' and not (contains(@data-target-href, 'ad'))]//h4[contains(text(), 'Oberlo')]";
    public static final String EXPLORE_FREE_THEMES =  "//span[text()='Explore free themes']/ancestor::a";

    //Login
    public static final String LOGIN_BUTTON = "//a[@href='/login' and @class='marketing-nav__item marketing-nav__item--user']";
    public static final String LOGIN_TO_ANOTHER_ACCOUNT = "//a[text()='Log in to another Shopify ID']";
    public static final String STORE_URL_TEXTBOX = "//input[@placeholder='myshop.myshopify.com']";
    public static final String EMAIL_PASSWORD_TEXTBOXES = "//input[@name='account[%s]']";
    public static final String DYNAMIC_BUTTON = "//button[text()='%s']";

    public static final String DELETE_APP_CONFIRMATION_TEXT = "//section[contains(text(), 'By deleting origin-app-dev')]";
}
