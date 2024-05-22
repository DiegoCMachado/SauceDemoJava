package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    private WebDriver driver;
    private Waits waits;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement itemName(){
        return waits.visibilityOfElement(By.id("item_4_title_link"));
    }


}