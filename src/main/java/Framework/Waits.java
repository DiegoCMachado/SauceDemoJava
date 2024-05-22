package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriver driver;
    private WebDriverWait wait;

    public Waits(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    public WebElement visibilityOfElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    public WebElement loadElement(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
