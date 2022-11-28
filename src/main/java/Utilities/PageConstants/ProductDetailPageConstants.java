package Utilities.PageConstants;

import PageObjectModel.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPageConstants extends BasePage {
    public ProductDetailPageConstants(WebDriver driver) {
        super(driver);
    }
    public final By ProductIdLocator = By.id("product-name");
    public final By AddToCartButtonLocator = By.id("addToCart");
    public final By ProductIsAddedToCartTitleLocator = By.xpath("//span[normalize-space()='Ürün sepetinizde']");
    public final By CloseButtonLocator = By.xpath("//div[@data-test-class='modal_overflow']//div//div//h1//a//*[name()='svg']");
    }
