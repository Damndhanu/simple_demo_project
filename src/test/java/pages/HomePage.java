package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Electronics")
    WebElement electronicsMenu;

    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    public void clickLogin(){
        loginLink.click();
    }

    public void clickElectronics(){
        electronicsMenu.click();
    }

    public void clickLogout(){
        logoutLink.click();
    }
}
