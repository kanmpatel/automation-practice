package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[@class='title_block']")
    WebElement womanText;
    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Tops']")
    WebElement topLink;
    @FindBy(xpath = "//div[@class='block_content']//a[contains(@title,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')][normalize-space()='Dresses']")
    WebElement dressesLink;
    @FindBy(id = "selectProductSort")
    WebElement shortByDropDown;
    @FindBy(xpath = "//h5[@itemprop=\"name\"]/child::a[@class=\"product-name\"]")
    List<WebElement> productLists;


    public String getVerifyWomenText() {
        return getTextFromElement(womanText);
    }
    public void clickOnTopsLink() {
        clickOnElement(topLink);
    }
    public void clickOnDressesLink() {
        clickOnElement(dressesLink);
    }
    public void clickOnShortByDropDown() {
        clickOnElement(shortByDropDown);
    }
    public void clickOnProduct(String productName) {
        for(WebElement element : productLists){
            if(element.getText().equalsIgnoreCase(productName)){
                element.click();
                break;
            }
        }
    }



}


