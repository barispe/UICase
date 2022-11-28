package PageObjectModel.Pages;

import Log.Log;
import Utilities.PageConstants.ProductPagesConstants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends ProductPagesConstants {
    Log log=new Log();
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @method "assertProductPageIsDirected" is confirm that page is directed by finding element.
     */
    public void assertProductPageIsDirected(){
        Assertions.assertTrue(isDisplayed(WeFoundNumbersOfProductLabelLocator),"Products page is not directed");
        log.info("Product page is directed.");
    }

    public ProductDetailPage chooseOneProduct() throws InterruptedException {
        click(FirstProduct);
        wait(5);
        log.info("One of products is chosen.");
        return new ProductDetailPage(driver);
    }
    public ProductDetailPage chooseThirdProduct() throws InterruptedException {
        click(ThirdProduct);
        wait(5);
        log.info("One of products is chosen.");
        return new ProductDetailPage(driver);
    }
    public void moveAndClickProduct(){
        moveToElement(FirstProduct);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
        w.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
        click(AddToCartButton);
        log.info("Mouse is moved and click to User LogIn Button.");
    }
}
