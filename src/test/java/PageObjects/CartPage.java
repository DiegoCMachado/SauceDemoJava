package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;
    private Waits waits;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement checkoutButton(){
        return waits.visibilityOfElement(By.className("checkout_button"));
    }

    public WebElement totalPrice(){
        return waits.visibilityOfElement(By.className("inventory_item_price"));
    }
}
