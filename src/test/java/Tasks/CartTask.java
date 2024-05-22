package Tasks;

import PageObjects.CartPage;
import org.openqa.selenium.WebDriver;

public class CartTask {

    private WebDriver driver;
    private CartPage cartPage;

    public CartTask(WebDriver driver) {
        this.driver = driver;
        cartPage = new CartPage(driver);
    }

    public void checkoutButton(){
        cartPage.checkoutButton().click();
    }
}
