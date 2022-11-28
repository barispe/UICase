package PageObjectModel.Pages;
import Log.Log;
import Utilities.PageConstants.CartPageConstants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


public class CartPage extends CartPageConstants {
    Log log=new Log();
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void assertCartPageIsDirected(){
        Assertions.assertTrue(isDisplayed(CartHeaderTitle),"NOT At the cart page");
        log.info("At the cart page");
    }

    public void increaseProductCount() throws InterruptedException {
        String firstprice = driver.findElement(totalPrice).getText();
        click(increaseProductCount);
        Thread.sleep(1000);
        String lastprice = driver.findElement(totalPrice).getText();
        Assertions.assertNotSame(lastprice, firstprice);
        log.info("Product count increased first price is : " + firstprice + "last price is : " + lastprice);
        
    }
    }

