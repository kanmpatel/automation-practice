package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends Utility {
    public AuthenticationPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class=\"alert alert-danger\"]/descendant::li")
    WebElement errorMessageField;

    public String getErrorMessage(){
        return  getTextFromElement(errorMessageField);
    }


}
