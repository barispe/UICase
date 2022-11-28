package Utilities.PageConstants;

import PageObjectModel.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageConstants extends BasePage {

    public HomePageConstants(WebDriver driver) {
        super(driver);
    }
    public By AcceptCookies = By.id("onetrust-accept-btn-handler");
    public By MyCartButtonLocator = By.id("shoppingCart");
    public By LogInGenelButtonLocator = By.className("sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq");
    public By LogInButtonLocator = By.id("login");
    public By MyAccountButtonTitleLocator = By.className("sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR");
    public By header = By.className("sf-Header-bdEp8Lo4YGOqf4MF1BGj");
    public By logoutBtn = By.xpath("//a[contains(text(),'Çıkış Yap')]");
    public By profileBtn = By.xpath("(//a[@title='Kullanıcı Bilgilerim'])[1]");
    public By datePicker = By.id("txtBirthDay");
    public By updateBirthday = By.xpath("(//button[@kind='secondary'][normalize-space()='Güncelle'])[1]");

}
