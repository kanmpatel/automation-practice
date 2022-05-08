package com.automation.testsuits;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignInPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    AuthenticationPage authenticationPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        authenticationPage = new AuthenticationPage();
        createAccountPage = new CreateAccountPage();
    }

    @Test(groups = {"sanity","smoke",  "regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.clickOnSignInLink();
        String expectedAuthenticationText = "AUTHENTICATION";
        String actualAuthenticationText = signInPage.getAuthenticationText();
        Assert.assertEquals(expectedAuthenticationText, actualAuthenticationText, "authentication text is not match");
    }

    @Test(dataProvider = "credential", dataProviderClass = TestData.class, groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password, String message) {
        homePage.clickOnSignInLink();
        signInPage.enterEmailForSignIn(username);
        signInPage.enterPasswordForSignIn(password);
        signInPage.clickOnSignInButton();
        String actualMessage = authenticationPage.getErrorMessage();
        String expectedMessage = message;
        Assert.assertEquals(actualMessage, expectedMessage, "display wrong message");

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnSignInLink();
        signInPage.enterEmailForSignIn("priya1234@gmail.com");
        signInPage.enterPasswordForSignIn("patel123");
        signInPage.clickOnSignInButton();
        Assert.assertTrue(createAccountPage.signOutLinkDisplayed());

    }
    @Test(groups = "regression")
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignInLink();
        homePage.clickOnSignInLink();
        signInPage.enterEmailForSignIn("patel2222@gmail.com");
        signInPage.enterPasswordForSignIn("abc123456");
        signInPage.clickOnSignInButton();
        createAccountPage.clickOnSignOutLink();
        Assert.assertTrue(homePage.signInLinkDisplayed());


    }


}
