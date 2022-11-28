package StepDefinition;
import Log.Log;
import PageObjectModel.Pages.*;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
public class steps {
    WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;
    Log log;
    @Given("navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        log = new Log();
        log.info("---BDD Test is initialized---");
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();
        log.info("Navigated to website.");
    }
    @Given("user log in")
    public void user_log_in() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.moveAndClickLoginUserButton();
        loginPage.typeEmail();
        loginPage.clickLogInButton();
        loginPage.typePassword();
        loginPage.clickLoginButtonAfterPassword();
    }

    @Given("go to profile page")
    public void profilepage() {
        homePage = new HomePage(driver);
        homePage.moveAndClickProfile();

    }
    @And("change birthday to {string}")
    public void changebirthday(String date) {
        homePage = new HomePage(driver);
        homePage.changeBirthdayNewDate(date);


    }

    @And("confirm user is logged in")
    public void confirm_user_is_logged_in() {
        homePage = new HomePage(driver);
        homePage.assertUserLoggedIn();
    }
    @And("accept cookies")
    public void acceptCookies(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
    }
    @And("type {string}")
    public void type(String productName) {
        homePage = new HomePage(driver);
        homePage.searchBarPage().typeProductNameInSearchBarText(productName);
    }
    @And("search product")
    public void search_product() {
        homePage = new HomePage(driver);
        productsPage = homePage.searchBarPage().clickSearchButton();
    }
    @And("choose a product")
    public void choose_a_product() throws InterruptedException {
        productsPage = new ProductsPage(driver);
        productsPage.assertProductPageIsDirected();
        productDetailPage = productsPage.chooseOneProduct();
    }
    @And("choose third product")
    public void choose_third_product() throws InterruptedException {
        productsPage = new ProductsPage(driver);
        productDetailPage.windowHandle();
        productsPage.assertProductPageIsDirected();
        productDetailPage = productsPage.chooseThirdProduct();
    }
    @And("add product to cart")
    public void add_product_to_cart() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        log = new Log();
        productDetailPage.windowHandle();
        productDetailPage.assertProductDetailPageIsDirected();
        productDetailPage.rollAndClickAddToCartButton();
        productDetailPage.assertAddCartButtonIsClicked();
        productDetailPage.clickCloseButton();
        driver.close();
        productDetailPage.windowHandle();

    }

    @And("navigate to cart page")
    public void navigate_to_cart_page() {
        homePage = new HomePage(driver);
        log = new Log();
        cartPage = new CartPage(driver);
        cartPage = homePage.clickToMyCartButton();
        cartPage.assertCartPageIsDirected();
    }

    @And("increase product count")
    public void increase_product_count() throws InterruptedException {
        log = new Log();
        cartPage.increaseProductCount();
        log.info("Product Count increased and new total verified");

    }

    @And("return to homepage")
    public void returnHome(){
        homePage = new HomePage(driver);
        homePage.returnToHome();

    }
    @Then("logout")
    public void logout(){
        homePage = new HomePage(driver);
        homePage.moveAndClickLogout();

    }

    @Then("close all tabs")
    public void closeAllTabs(){
        log = new Log();
        log.info("---BDD TEST END, Closing all tabs---");
        Driver.closeAllTabs();
        Driver.quitDriver();
    }
}
