package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.CheckoutStepTwoPage;
import PageObjects.CheckoutStepOnePage;
import Utils.FakerGenerator;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckouStepOneTask {

    private WebDriver driver;
    private CheckoutStepOnePage checkoutStepOnePage;
    private CheckoutStepTwoPage checkoutStepTwoPage;

    public CheckouStepOneTask(WebDriver driver) {
        this.driver = driver;
        checkoutStepOnePage = new CheckoutStepOnePage(driver);
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
    }

    public void firstName(){
        checkoutStepOnePage.firstName().sendKeys(FakerGenerator.getFirstName());
    }

    public void lastName(){
        checkoutStepOnePage.lastName().sendKeys(FakerGenerator.getLastName());
    }

    public void postalcode(){
        checkoutStepOnePage.postcode().sendKeys(FakerGenerator.getPostalCode());
    }

    public void register(){
        checkoutStepOnePage.register().click();
        validateNextPage();
    }

    public void validateNextPage() {
        try {
            String textoExtraido = checkoutStepTwoPage.nomeDoProduto().getText();
            Assertions.assertEquals("Sauce Labs Backpack", textoExtraido);
            Report.log(Status.PASS, "Produto identificado com sucesso!", Screenshot.fullPageBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, "Produto não localizado!", Screenshot.fullPageBase64(driver));
        }
    }
}
