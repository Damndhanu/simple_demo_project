package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        HomePage home = new HomePage(driver);
        home.clickLogin();

        LoginPage login = new LoginPage(driver);
        login.login("yourEmail@gmail.com", "yourPassword");

        home.clickLogout();
    }
}
