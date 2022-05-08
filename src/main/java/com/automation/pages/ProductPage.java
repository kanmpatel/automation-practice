package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @FindBy(xpath = "//a[contains(@class,'color_pick' )]")
    List<WebElement> colour;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addCartButton;
    @FindBy(xpath = "//i[@class=\"icon-ok\"]")
    WebElement successfullyAddedMessageText;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeWindowTAb;


    public void enterQuantity(String qty) throws InterruptedException {
        quantity.clear();
        Thread.sleep(3000);
        sendTextToElement(quantity, qty);
    }

    public void selectSize(String siz) {
        selectByVisibleTextFromDropDown(size, siz);
    }

    public void clickOnColur(String colur1) {
        for (WebElement element : colour) {
            if (element.getAttribute("title").equalsIgnoreCase(colur1)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnAddCart() {
        clickOnElement(addCartButton);

    }

    public String getVerifySuccessFullyAddedText() {
        return getTextFromElement(successfullyAddedMessageText);
    }

    public void clickOnCloseWindowTab() {
        clickOnElement(closeWindowTAb);
    }


}
