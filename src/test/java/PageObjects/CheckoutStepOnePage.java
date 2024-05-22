package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckoutStepOnePage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement firstName(){
        return waits.visibilityOfElement(By.id("first-name"));
    }

    public WebElement lastName(){
        return waits.visibilityOfElement(By.id("last-name"));
    }

    public WebElement postcode(){
        return waits.visibilityOfElement(By.id("postal-code"));
    }

    public WebElement register(){
        return waits.visibilityOfElement(By.className("cart_button"));
    }
}
