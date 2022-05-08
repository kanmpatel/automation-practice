package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_gender2")
    WebElement mrsRadioButton;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement infoFirstNameField;
    @FindBy(id = "customer_lastname")
    WebElement infoLastNameField;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement infoPassWordField;
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateDropDownField;
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthdropDownField;
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearDropDownField;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstNameField;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastNameFeild;
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyField;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2Field;
    @FindBy(id = "city")
    WebElement cityField;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateDropDownField;
    @FindBy(id = "postcode")
    WebElement zipCodeField;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryDropDownField;
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalField;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhoneField;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNumberField;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressAliasField;
    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerButtonField;
    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement myAccountText;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutLink;


    public void clickOnMrsRadioButton(){
        clickOnElement(mrsRadioButton);
    }
    public void enterFirstNameInInfo(String fName){
        sendTextToElement(infoFirstNameField,fName);
    }
    public void enterlastNameInInfo(String lName){
        sendTextToElement(infoLastNameField,lName);
    }
    public void enterPasswordInInfo(String password){
        sendTextToElement(infoPassWordField,password);
    }
    public void clickOnDatedropDown() {
        clickOnElement(dateDropDownField);
    }
    public void selectDateFromDropDown(String text){
        selectByVisibleTextFromDropDown(dateDropDownField,text);
    }
    public void clickOnMonthDropDown(){
        clickOnElement(monthdropDownField);
    }
    public void selectMonthFromDropDown(String text){
        selectByVisibleTextFromDropDown(monthdropDownField,text);
    }
    public void clickOnYearDropDown(){
        clickOnElement(yearDropDownField);
    }
    public void selectYearFromDropDown(String text){
        selectByVisibleTextFromDropDown(yearDropDownField,text);
    }
    public void enterFirstNameInAddress(String fName){
        sendTextToElement(addressFirstNameField,fName);

    }
    public void enterLastNameInAddress(String lName){
        sendTextToElement(addressLastNameFeild,lName);
    }
    public void enterCompanyName(String name){
        sendTextToElement(companyField,name);
    }
    public void enterAddress(String address){
        sendTextToElement(addressField,address);
    }
    public void enterAddressLine2(String line2){
        sendTextToElement(addressLine2Field,line2);
    }
    public void enterCity(String city ){
        sendTextToElement(cityField,city);
    }
    public void clickOnStateDropDown(){
        clickOnElement(stateDropDownField);
    }
    public void selectStateFromDropDown(String text){
        selectByVisibleTextFromDropDown(stateDropDownField,text);
    }
    public void enterZipCode(String code){
        sendTextToElement(zipCodeField,code);
    }
    public void clickOnCountrydropDownField(){
        clickOnElement(countryDropDownField);
    }
    public void selectCountryFromDropDown(String country){
        selectByVisibleTextFromDropDown(countryDropDownField,country);
    }
    public void enterAdditionalField(String text){
        sendTextToElement(additionalField,text);
    }
    public void enterHomePhoneNumber(String num){
        sendTextToElement(homePhoneField,num);
    }
    public void enterMobilePhone(String mobileNum){
        sendTextToElement(mobileNumberField,mobileNum);
    }
    public void enterAliasAddress(String add){
        sendTextToElement(addressAliasField,add);
    }
    public void clickOnRegisterField(){
        clickOnElement(registerButtonField);

    }

    public String getMyAccountText() {
        return getTextFromElement(myAccountText);
    }
    public Boolean signOutLinkDisplayed(){
        return signOutLink.isDisplayed();
    }
    public void clickOnSignOutLink(){
        clickOnElement(signOutLink);

    }







































}
