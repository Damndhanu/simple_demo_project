package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Cell phones")
    WebElement cellPhones;

    public void clickCellPhones(){
        cellPhones.click();
    }
    @FindBy(linkText = "Smartphone")
    WebElement Smartphone;

    public void clickSmartphone(){
        Smartphone.click();
    }

}
