package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement order(){
        return waits.visibilityOfElement(By.className("complete-header"));
    }

}
