package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepTwoPage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement checkoutButton(){
        return waits.visibilityOfElement(By.className("cart_button"));
    }

    public WebElement nomeDoProduto(){
        return waits.visibilityOfElement(By.className("inventory_item_name"));
    }
}
