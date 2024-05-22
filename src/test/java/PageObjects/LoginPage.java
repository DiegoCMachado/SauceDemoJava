package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement username(){
        return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement password() {return waits.visibilityOfElement(By.id("password"));}

    public WebElement loginButton(){
        return waits.visibilityOfElement(By.id("login-button"));
    }
}
