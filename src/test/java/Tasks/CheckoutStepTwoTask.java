package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckoutCompletePage;
import PageObjects.CheckoutStepTwoPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoTask {

    private WebDriver driver;
    private CheckoutStepTwoPage checkoutStepTwoPage;
    private CheckoutCompletePage checkoutCompletePage;

    public CheckoutStepTwoTask(WebDriver driver) {
        this.driver = driver;
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    public void checkoutButton(){
        checkoutStepTwoPage.checkoutButton().click();
        validateNextPage();
    }
    public void validateNextPage() {
        try {
            String textoExtraido = checkoutCompletePage.order().getText();
            Assertions.assertEquals("THANK YOU FOR YOUR ORDER", textoExtraido);
            Report.log(Status.PASS, "Compra finalizada com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Compra não finalizada!", Screenshot.fullPageBase64(driver));
        }
    }
}
