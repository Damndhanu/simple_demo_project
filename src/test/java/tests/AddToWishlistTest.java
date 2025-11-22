package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddToWishlistTest extends BaseTest {

    @Test
    public void addProductToWishlist() {

        // Login
        HomePage home = new HomePage(driver);
        home.clickLogin();

        LoginPage login = new LoginPage(driver);
        login.login("dhanushstar6@gmail.com", "Dhanu@123");

        // Electronics -> Cell phones
        home.clickElectronics();
        ElectronicsPage electronics = new ElectronicsPage(driver);
        electronics.clickCellPhones();
        electronics.clickSmartphone();


        // Select first product
        ProductPage product = new ProductPage(driver);
        product.addToWishlist();

//        Assert.assertTrue(product.verifyWishlistAdded());
    }
}
