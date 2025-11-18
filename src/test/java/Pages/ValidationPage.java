package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ValidationPage {

    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement brand_id;

    @FindBy(id = "color")
    WebElement color_id;

    @FindBy(id = "storage-128GB")
    WebElement storage128_id;

    @FindBy(id = "storage-256GB")
    WebElement storage256_id;

    @FindBy(id = "quantity")
    WebElement quantity_id;

    @FindBy(id = "address")
    WebElement deliveryAddress_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;

    @FindBy(id = "shipping-express")
    WebElement shippingExpress_id;

    @FindBy(id = "shipping-standard")
    WebElement shippingStandard_id;

    @FindBy(id = "warranty-none")
    WebElement warrantyNone_id;

    @FindBy(id = "warranty-1yr")
    WebElement warranty_id;

    @FindBy(id = "discount-code")
    WebElement discountCode_id;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscount_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCartButton_id;

    @FindBy(id = "review-cart-btn")
    WebElement reviewCartButton_id;

    @FindBy(id = "cart-item-remove-1763438796770.5173")
    WebElement removeItemButton_id;



    public ValidationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyInventoryHeaderIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id));
        inventoryHeader_id.isDisplayed();
    }

    public void selectDeviceType(String deviceType) {

        deviceTypeDropDown_id.sendKeys(deviceType);
    }

    public void selectTabletBrand(String deviceBrand) {

        brand_id.sendKeys(deviceBrand);
    }

    public void selectLaptopBrand(String laptopBrand) {
        brand_id.sendKeys(laptopBrand);
    }

    public void selectColor(String color) {

        color_id.sendKeys(color);
    }

    public void selectStorage128() {

        storage128_id.click();
    }
    public void selectStorage256() {

        storage256_id.click();
    }

    public void selectQuantity(String quantity) {
        quantity_id.clear();
        quantity_id.sendKeys(quantity);
    }

    public void enterDeliveryAddress(String address) {
        deliveryAddress_id.sendKeys(address);
    }

    public void clickNextButton() {
        nextButton_id.click();
    }
    public void selectShippingExpress() {
        shippingExpress_id.click();
    }

    public void selectShippingStandard() {
        shippingStandard_id.click();
    }

    public void selectWarranty() {
        warranty_id.click();
    }

    public void selectWarrantyNone() {
        warrantyNone_id.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCode_id.clear();
        discountCode_id.sendKeys(discountCode);
    }

    public void clickApplyDiscount() {
        applyDiscount_id.click();
    }
    public void clickAddToCartButton() {
        addToCartButton_id.click();
    }

    public void clickReviewCartButton() {
        reviewCartButton_id.click();
    }
    public void clickRemoveItemButton() {
        removeItemButton_id.click();
    }
}
