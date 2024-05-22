package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;

    private static WebDriver getManagerDriver(TypeDriver type){
        switch (type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case HEADLESS:
                WebDriverManager.chromedriver().setup();
                ChromeOptions headless = new ChromeOptions();
                headless.addArguments("--headless");
                headless.addArguments("--Window size(1360,768");
                driver = new ChromeDriver(headless);
                break;

           default:
                break;


        }
        return driver;
    }

    public static WebDriver getDriver(TypeDriver type){
        if(driver == null){
            driver = getManagerDriver(type);
        }
        return driver;
    }
    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
