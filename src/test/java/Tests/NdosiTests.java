package Tests;

import Utils.ReadFromFile;
import Utils.TakeScreenshots;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base{


    public void verifyHomePageIsDisplayedTests(){
        homePage.verifyHomePageIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
        takeScreenshots.takesSnapShot(driver, "LearningMaterialPage");
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail(){
        loginPage.enterLoginEmail(readFromFile.username);
    }

    @Test(dependsOnMethods = "enterLoginEmail")
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
    public void verifyWebAutomationAdvancePageIsDisplayedTest(){
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
    public void selectColorTest(){
        webAutomationAdvancePage.selectColor("blue");
    }

   @Test(dependsOnMethods = "selectColorTest")
    public void selectStorageTest(){
        webAutomationAdvancePage.selectStorage();
    }

    @Test(dependsOnMethods = "selectStorageTest")
    public void selectQuantityTest() throws InterruptedException {
        webAutomationAdvancePage.selectQuantity("+3");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "selectQuantityTest")
    public void enterDeliveryAddressTest(){
        webAutomationAdvancePage.enterDeliveryAddress("27 Parklands Main, Cape Town");
    }
    @Test(dependsOnMethods = "enterDeliveryAddressTest")
    public void clickNextButtonTest(){
        webAutomationAdvancePage.clickNextButton();
    }

    @Test(dependsOnMethods = "clickNextButtonTest")
    public void verifyDeviceSummaryTitleIsDisplayedTest(){
        webAutomationAdvancePage.verifyDeviceSummaryTitleIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyDeviceSummaryTitleIsDisplayedTest")
    public void selectShippingExpressTest(){
        webAutomationAdvancePage.selectShippingExpress();
    }

    @Test(dependsOnMethods = "selectShippingExpressTest")
    public void selectWarrantyTest(){
        webAutomationAdvancePage.selectWarranty();
    }

    @Test(dependsOnMethods = "selectWarrantyTest")
    public void enterDiscountCodeTest(){
        webAutomationAdvancePage.enterDiscountCode("SAVE10");
    }

    @Test(dependsOnMethods = "enterDiscountCodeTest")
    public void clickApplyDiscountTest(){
       webAutomationAdvancePage.clickApplyDiscount();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
