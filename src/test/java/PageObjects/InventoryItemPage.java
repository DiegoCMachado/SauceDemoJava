package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {
    private WebDriver driver;
    private Waits waits;

    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement cartButton() {
        return waits.visibilityOfElement(By.className("btn_inventory"));
    }

    public WebElement checkoutButton() {
        return waits.visibilityOfElement(By.id("shopping_cart_container"));
    }
}
