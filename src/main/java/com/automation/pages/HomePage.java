package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a[@title='Women']")
    WebElement womenTab;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']']")
    WebElement dressesTab;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']']")
    WebElement tshirtTab;
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInLink;


    public void clickOnWomanTab(){
        clickOnElement(womenTab);
    }
    public void clickOnDressesTab(){
        clickOnElement(dressesTab);
    }
    public void clickOnTshirtTab(){
        clickOnElement(tshirtTab);
    }
    public void clickOnSignInLink(){
    clickOnElement(signInLink);
    }
    public boolean signInLinkDisplayed(){
        return signInLink.isDisplayed();
    }







}
