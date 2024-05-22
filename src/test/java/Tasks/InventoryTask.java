package Tasks;

import PageObjects.InventoryItemPage;
import PageObjects.InventoryPage;
import org.openqa.selenium.WebDriver;

public class InventoryTask {
    private WebDriver driver;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;

    public InventoryTask(WebDriver driver) {
        this.driver = driver;
        inventoryPage = new InventoryPage(driver);
        inventoryItemPage = new InventoryItemPage(driver);
    }

    public void getItem() {
        inventoryPage.itemName().click();
    }
}
