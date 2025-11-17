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

    @FindBy(id = "quantity")
    WebElement quantity_id;

    @FindBy(id = "address")
    WebElement deliveryAddress_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;

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


}
