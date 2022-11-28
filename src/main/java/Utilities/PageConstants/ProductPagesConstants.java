package Utilities.PageConstants;

import Log.Log;
import PageObjectModel.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPagesConstants extends BasePage {
    Log log = new Log();
    public ProductPagesConstants(WebDriver driver) {
        super(driver);
    }
    public final By WeFoundNumbersOfProductLabelLocator = By.className("searchResultSummaryBar-AVnHBWRNB0_veFy34hco");
    public final By AddToCartButton = By.xpath("//div[@class='moria-ProductCard-gzPKzw fvIA sy2gkt6utdp']");
    public final By FirstProduct = By.xpath("(//li[@type='comfort'])[1]");
    public final By ThirdProduct = By.xpath("(//li[@type='comfort'])[3]");
}
