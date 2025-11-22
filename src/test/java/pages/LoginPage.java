package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(css = "input[value='Log in']")
    WebElement loginBtn;

    public void login(String user, String pass){
        email.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
    }

}
