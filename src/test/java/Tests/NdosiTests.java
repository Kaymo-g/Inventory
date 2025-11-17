package Tests;

import Utils.ReadFromFile;
import Utils.TakeScreenshots;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {


    public void verifyHomePageIsDisplayedTests() {

        homePage.verifyHomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
        takeScreenshots.takesSnapShot(driver, "LearningMaterialPage");
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmailTest() {
        loginPage.enterLoginEmail(readFromFile.username);
    }

    @Test(dependsOnMethods = "enterLoginEmailTest")
    public void enterPasswordTests() {
        loginPage.enterPasswordId(readFromFile.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLogin();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyWelcomeHeading() {
        learningMaterialPage.verifyHeading();
    }

    @Test(dependsOnMethods = "verifyWelcomeHeading")
    public void clickWebAutomationAdvanceTab() throws InterruptedException {
        learningMaterialPage.clickWebAutomationAdvanceTab();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvanceTab")
    public void verifyWebAutomationAdvancePageIsDisplayedTest() {
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Tablet");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectDeviceBrandTest() throws InterruptedException {
        webAutomationAdvancePage.selectTabletBrand("Samsung");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectDeviceBrandTest")
    public void selectColorTest() {
        webAutomationAdvancePage.selectColor("blue");
    }

    @Test(dependsOnMethods = "selectColorTest")
    public void selectStorage128Test() {
        webAutomationAdvancePage.selectStorage128();
    }

    @Test(dependsOnMethods = "selectStorage128Test")
    public void selectQuantityTest() throws InterruptedException {
        webAutomationAdvancePage.selectQuantity("2");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectQuantityTest")
    public void enterDeliveryAddressTest() {
        webAutomationAdvancePage.enterDeliveryAddress("27 Parklands Main, Cape Town");
    }

    @Test(dependsOnMethods = "enterDeliveryAddressTest")
    public void clickNextButtonTest() {
        webAutomationAdvancePage.clickNextButton();
    }

    @Test(dependsOnMethods = "clickNextButtonTest")
    public void verifyDeviceSummaryTitleIsDisplayedTest() {
        webAutomationAdvancePage.verifyDeviceSummaryTitleIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyDeviceSummaryTitleIsDisplayedTest")
    public void selectShippingExpressTest() {
        webAutomationAdvancePage.selectShippingExpress();
    }

    @Test(dependsOnMethods = "selectShippingExpressTest")
    public void selectWarrantyTest() {
        webAutomationAdvancePage.selectWarranty();
    }

    @Test(dependsOnMethods = "selectWarrantyTest")
    public void enterDiscountCodeTest() {
        webAutomationAdvancePage.enterDiscountCode("SAVE10");
    }

    @Test(dependsOnMethods = "enterDiscountCodeTest")
    public void clickApplyDiscountTest() throws InterruptedException {
        webAutomationAdvancePage.clickApplyDiscount();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "clickApplyDiscountTest")
    public void verifyPriceBreakdownTitleIsDisplayedTest() throws InterruptedException {
        webAutomationAdvancePage.verifyPriceBreakdownTitleIsDisplayed();
        takeScreenshots.takesSnapShot(driver, "Price Breakdown");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "verifyPriceBreakdownTitleIsDisplayedTest")
    public void clickInventoryBackButtonTest() throws InterruptedException {
        webAutomationAdvancePage.clickInventoryBackButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickInventoryBackButtonTest")
    public void clickNextButton2Test() throws InterruptedException {
        webAutomationAdvancePage.clickNextButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickNextButton2Test")
    public void clickAddToCartButtonTest() throws InterruptedException {
        webAutomationAdvancePage.clickAddToCartButton();
        Thread.sleep(2000);
    }

//    @Test(dependsOnMethods = "clickAddToCartButtonTest")
//    public void clickCartItemDecreaseTest() throws InterruptedException {
//        webAutomationAdvancePage.clickCartItemDecrease();
//        Thread.sleep(4000);
//    }

    @Test(dependsOnMethods = "clickAddToCartButtonTest")
    public void selectDeviceTypeLaptopTest() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("laptop");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeLaptopTest")
    public void selectLaptopBrandTest() throws InterruptedException {
        webAutomationAdvancePage.selectLaptopBrand("macbook pro");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectLaptopBrandTest")
    public void selectStorage256Test() {
        webAutomationAdvancePage.selectStorage256();
    }

    @Test(dependsOnMethods = "selectStorage256Test")
    public void selectColorGoldTest() throws InterruptedException {
        webAutomationAdvancePage.selectColor("gold");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectColorGoldTest")
    public void selectQuantitySecondItemTest() throws InterruptedException {
        webAutomationAdvancePage.selectQuantity("1");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "selectQuantitySecondItemTest")
    public void enterDeliveryAddressSecondItemTest() {
        webAutomationAdvancePage.enterDeliveryAddress("27 Parklands Main, Cape Town");
    }

    @Test(dependsOnMethods = "enterDeliveryAddressSecondItemTest")
    public void clickNextButtonSecondItemTest() throws InterruptedException {
        webAutomationAdvancePage.clickNextButton();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickNextButtonSecondItemTest")
    public void verifyDeviceSummaryTitleIsDisplayedSecondItemTest() {
        webAutomationAdvancePage.verifyDeviceSummaryTitleIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyDeviceSummaryTitleIsDisplayedSecondItemTest")
    public void selectShippingStandardTest() {
        webAutomationAdvancePage.selectShippingStandard();
    }

    @Test(dependsOnMethods = "selectShippingStandardTest")
    public void selectWarrantyNoneTest() {
        webAutomationAdvancePage.selectWarrantyNone();
    }

    @Test(dependsOnMethods = "selectWarrantyNoneTest")
    public void enterDiscountCodeSecondItemTest() {
        webAutomationAdvancePage.enterDiscountCode("SAVE20");

    }

    @Test(dependsOnMethods = "enterDiscountCodeSecondItemTest")
    public void clickApplyDiscountSecondItemTest() throws InterruptedException {
        webAutomationAdvancePage.clickApplyDiscount();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickApplyDiscountSecondItemTest")
    public void clickAddToCartButtonSecondItemTest() throws InterruptedException {
        webAutomationAdvancePage.clickAddToCartButton();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickAddToCartButtonSecondItemTest")
    public void clickReviewCartButtonTest(){
        webAutomationAdvancePage.clickReviewCartButton();
    }
    @Test(dependsOnMethods = "clickReviewCartButtonTest")
    public void clickPlaceOrderButtonTest(){
        webAutomationAdvancePage.clickPlaceOrderButton();
    }
    @Test(dependsOnMethods = "clickPlaceOrderButtonTest")
    public void clickViewInvoiceButtonTest() throws InterruptedException {
        webAutomationAdvancePage.clickViewInvoiceButton();
        Thread.sleep(3000);
    }
    @Test(dependsOnMethods = "clickViewInvoiceButtonTest")
    public void clickCloseInvoiceHistoryTest() throws InterruptedException {
        webAutomationAdvancePage.clickCloseInvoiceHistory();
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
