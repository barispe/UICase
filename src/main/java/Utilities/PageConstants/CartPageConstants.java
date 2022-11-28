package Utilities.PageConstants;

import PageObjectModel.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageConstants extends BasePage {
    public CartPageConstants(WebDriver driver) {
        super(driver);
    }
    public By CartHeaderTitle = By.className("basket_headerTop_15H0U");
    public By increaseProductCount = By.xpath("(//a[@aria-label='Ürünü Arttır'])[1]");
    public By totalPrice = By.id("basket_payedPrice");

}
