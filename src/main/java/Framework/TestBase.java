package Framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager{
    private static WebDriver driver;

    public static WebDriver getDriver(){
        driver = getDriver(TypeDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        getDriver().get(Paths.BASE_URL);
    }

    @AfterEach
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        Report.close();
        quitDriver();
    }
}
