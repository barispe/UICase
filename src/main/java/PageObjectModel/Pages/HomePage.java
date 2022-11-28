package PageObjectModel.Pages;

import Log.Log;
import Utilities.PageConstants.HomePageConstants;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends HomePageConstants {
    SearchBarPage searchBarPage;
    Log log= new Log();
    public HomePage(WebDriver driver) {
        super(driver);
        searchBarPage = new SearchBarPage(driver);
    }

    public void acceptCookies(){
        Boolean display = true;
        while (display){
            if (isDisplayed(AcceptCookies)){
                click(AcceptCookies);
                display = false;
            }else{
                break;
            }
        }
    }
    public void moveAndClickLoginUserButton(){
        moveToElement(LogInGenelButtonLocator);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(60));
        w.until(ExpectedConditions.elementToBeClickable(LogInButtonLocator));
        click(LogInButtonLocator);
        log.info("Mouse is moved and User Login is clicked");
    }
    public void moveAndClickLogout(){
        moveToElement(LogInGenelButtonLocator);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        click(logoutBtn);
        log.info("logout button is clicked.");
    }
    public void moveAndClickProfile(){
        moveToElement(LogInGenelButtonLocator);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeClickable(profileBtn));
        click(profileBtn);
        log.info("Profile button is clicked.");
    }
    /**
     * @method "searchBarPage" is to call search bar section to reach methods in search bar.
     */
    public SearchBarPage searchBarPage(){
        return this.searchBarPage;
    }

    public CartPage clickToMyCartButton(){
        scrollToTopOfPage();
        click(MyCartButtonLocator);
        return new CartPage(driver);
    }

    public void assertUserLoggedIn(){
        String myAccount = getText(MyAccountButtonTitleLocator);
        Assertions.assertNotEquals("", myAccount);
        log.info("User is logged in.");
    }

    public void returnToHome(){
        click(header);
        Assertions.assertTrue(isDisplayed(MyCartButtonLocator));
        log.info("Returned to homepage");

    }
    public void changeBirthdayNewDate(String newDate){
        click(datePicker);
        driver.findElement(datePicker).sendKeys(newDate);
        log.info("Birthday Updated");
        click(updateBirthday);

    }
    public void logout(){
        click(header);
        Assertions.assertTrue(isDisplayed(MyCartButtonLocator));
        log.info("Logged Out");

    }
}
