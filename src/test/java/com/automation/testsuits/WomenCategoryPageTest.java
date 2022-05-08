package com.automation.testsuits;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        homePage.clickOnWomanTab();
        String expectedWomenText = "WOMWN";
        String actualWomenText = womenCategoryPage.getVerifyWomenText();
        Assert.assertEquals(actualWomenText, expectedWomenText, "women text is not match");

    }

    @Test(dataProvider = "cart", dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        homePage.clickOnWomanTab();
        womenCategoryPage.clickOnProduct(product);
        productPage.enterQuantity(qty);
        productPage.selectSize(size);
        productPage.clickOnColur(colour);
        productPage.clickOnAddCart();
        String expectedAddToCartText="Product successfully added to your shopping cart";
        String actualAddToCartText=productPage.getVerifySuccessFullyAddedText();
        Assert.assertEquals(actualAddToCartText,expectedAddToCartText,"displayed message is wrong ");
        productPage.clickOnCloseWindowTab();

    }


}
