package PageObjectModel.Pages;

import Log.Log;
import Utilities.PageConstants.ProductDetailPageConstants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class ProductDetailPage extends ProductDetailPageConstants {
    Log log=new Log();
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void windowHandle(){
        List<String> pages = new ArrayList<>(driver.getWindowHandles());
        int pageCount = pages.size();
        driver.switchTo().window(pages.get(pageCount-1));
        log.info("Window is handled.");
    }

    public void assertProductDetailPageIsDirected(){
        Assertions.assertTrue(isDisplayed(ProductIdLocator),"Product detail page is not directed correctly");
        log.info("Product detail page is directed.");
    }
    
    public void rollAndClickAddToCartButton() throws InterruptedException {
        wait(10);
        rollUntilFindElementAndClick(AddToCartButtonLocator);
        wait(10);
        log.info("Scrolled down to click AddToCart Button");
    }

    public void assertAddCartButtonIsClicked() throws InterruptedException {
        wait(10);
        Assertions.assertTrue(isDisplayed(ProductIsAddedToCartTitleLocator),"Product is not added to cart");
        log.info("AddToCart Button is clicked");
    }

    public void clickCloseButton(){
        click(CloseButtonLocator);
        log.info("Pop-up is closed");
    }

}
