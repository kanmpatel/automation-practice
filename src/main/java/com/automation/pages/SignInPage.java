package com.automation.pages;

import com.automation.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;
    @FindBy(id = "passwd")
    WebElement passwordField;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;
    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement authenticationText;
    @FindBy(xpath = "//h3[normalize-space()='Create an account']")
    WebElement createAccountText;
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailFieldInCreateAccount;

    public void enterEmailForCreateAccount(String email) {
        sendTextToElement(emailFieldInCreateAccount, email);
    }

    public void clickOnCreateAccountButton() {
        clickOnElement(createAccountButton);
    }

    public void enterEmailForSignIn(String email) {
        sendTextToElement(emailAddressField, email);
    }

    public void enterPasswordForSignIn(String password) {
        sendTextToElement(passwordField, password);
    }

    public String getAuthenticationText() {
        return getTextFromElement(authenticationText);
    }

    public String getCreateAnAccountText() {
        return getTextFromElement(createAccountText);
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }

    public void signInApplication(String username, String password) {
        enterEmailForSignIn(username);
        enterPasswordForSignIn(password);
        clickOnElement(signInButton);

    }

}
