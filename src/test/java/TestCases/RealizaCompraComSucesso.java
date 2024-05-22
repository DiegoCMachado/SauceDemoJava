package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizaCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();

    private InventoryTask inventoryTask = new InventoryTask(driver);
    private InventoryItemTask inventoryItemTask = new InventoryItemTask(driver);
    private CartTask cartTask = new CartTask(driver);
    private LoginTask loginTask = new LoginTask(driver);
    private CheckouStepOneTask checkouStepOneTask = new CheckouStepOneTask(driver);
    private CheckoutStepTwoTask checkoutStepTwoTask = new CheckoutStepTwoTask(driver);


    @Test
    public void realizarCompraComSucesso(){
        try {
            Report.createTest("Realizar Compra Com Sucesso!", ReportType.SINGLE);

            loginTask.username();
            loginTask.password();
            loginTask.loginButton();
            inventoryTask.getItem();
            inventoryItemTask.cartButton();
            inventoryItemTask.checkoutButton();
            cartTask.checkoutButton();
            checkouStepOneTask.firstName();
            checkouStepOneTask.lastName();
            checkouStepOneTask.postalcode();
            checkouStepOneTask.register();
            checkoutStepTwoTask.checkoutButton();

        }catch (Exception e){
            Report.log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }
}
