package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.InventoryItemPage;
import PageObjects.CartPage;
import PageObjects.InventoryPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InventoryItemTask {
    private WebDriver driver;
    private InventoryItemPage inventoryItemPage;
    private CartPage cartPage;

    public InventoryItemTask(WebDriver driver) {
        this.driver = driver;
        inventoryItemPage = new InventoryItemPage(driver);
        cartPage = new CartPage(driver);
    }

    public void cartButton() {
        inventoryItemPage.cartButton().click();
    }

    public void checkoutButton() {
        inventoryItemPage.checkoutButton().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = cartPage.totalPrice().getText();
            Assertions.assertEquals("29.99", textoExtraido);
            Report.log(Status.PASS, "Item adicionado ao carrinho com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Item não localizado!", Screenshot.fullPageBase64(driver));
        }
    }
}