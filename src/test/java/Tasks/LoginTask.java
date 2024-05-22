package Tasks;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void username(){
        loginPage.username().sendKeys("standard_user");
    }

    public void password(){loginPage.password().sendKeys("secret_sauce");}

    public void loginButton(){
        loginPage.loginButton().click();
    }
}
