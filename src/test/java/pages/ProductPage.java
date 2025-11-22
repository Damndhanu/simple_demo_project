package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='add-to-wishlist-button-43']")
    WebElement wishlistBtn;


//    @FindBy(css = "div.bar-notification.success")
//    WebElement successMsg;

    public void addToWishlist() {
        wishlistBtn.click();
    }

//    public boolean verifyWishlistAdded() {
//        return successMsg.isDisplayed();
//    }
}
