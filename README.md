# FIREAPPS_PROJECT

This project contains 3 main functions:
- Create the Shopify stores
- Install Origin App
- Run test cases for website fireapps.io

Infomation:

Programming language: Java
Automation tool: Selenium
Library used: TestNG/Cucumber
Design pattern: Page Object Model

I. Create the Shopify stores:

This feature can be run by using "runCreateShopifyStore.xml" via the TestNG plugin.
You can config the parameter in the Constants.java in src/main/java/commons.
The parameter you can change:

EMAIL: this is the format of email, when running the methods, the tool will add the random number (4 digits) and @mail.com automatically.
STORE NAME: this is the format of store name, when running the methods, the tool will add the random number (4 digits) to store name.
PASSWORD: This password will be used for all the stores, should not change.
How to define the number of the store that I want to create?
To define the number of reapeat, access the file in the directory: src/test/java/createStore.java
Check the @Test annotation. There is a "invocationCount" parameter beside the @Test annotation.
Change the number of "invocationCount" value.
For example: If you want to create 50 Shopify store. Change this: @Test(invocationCount=50).
After run the "runCreateShopifyStore.xml", the data will be recorded automatically to storeData.csv file the directory: src/test/resources/
This file will contains the parameters of the stores that was created:

Store URL
Email
Store name
The password is same as the Constants.PASSWORD parameter
