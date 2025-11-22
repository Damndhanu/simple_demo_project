package tests;

import pages.HomePage;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        HomePage home = new HomePage(driver);
        home.clickLogin();

        LoginPage login = new LoginPage(driver);
        login.login("dhanushstar6@gmail.com", "Dhanu@123");
    }
}
