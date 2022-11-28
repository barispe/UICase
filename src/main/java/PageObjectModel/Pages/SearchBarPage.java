package PageObjectModel.Pages;

import Log.Log;
import Utilities.PageConstants.SearchBarConstants;
import org.openqa.selenium.WebDriver;

public class SearchBarPage extends SearchBarConstants {
    Log log=new Log();

    public SearchBarPage(WebDriver driver) {
        super(driver);
    }

    public void typeProductNameInSearchBarText(String Text){
        click(SearchBarTextLocator);
        type(SearchBarTextLocator,Text);
        log.info("Product name is typed in search bar.");
    }

    public ProductsPage clickSearchButton(){
        click(SearchButtonLocator);
        log.info("Product name is searched.");
        return new ProductsPage(driver);
    }
}
