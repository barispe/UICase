package PageObjectModel.Pages;

import Log.Log;
import Utilities.PageConstants.LoginPageConstants;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginPageConstants {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    Log log= new Log();

    public void typeEmail(){
        type(EmailInputTextLocator,"perveroglubaris@gmail.com");
        log.info("Mail is typed");
    }

    public void clickLogInButton(){
        click(LogInButtonLocator);
    }

    public void typePassword(){
        type(PasswordInputTextLocator,"Federer123");
    }

    public void clickLoginButtonAfterPassword(){
        click(LoginButtonAfterPasswordLocator);
        log.info("Password is typed and login button is clicked.");
    }

}
