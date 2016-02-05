package PageTests;

import Pages.Login;
import Support.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by monred on 05/02/2016.
 */
public class LoginTest {

    private WebDriver webDriver;


    @BeforeClass
    public void loadWebpage() {
        webDriver = BrowserUtils.getDriver("mozilla");
        webDriver.get("http://vmt-www02.durrants.uat/");
    }


    @Test
    public void whenILogInIExpectASuccess() {

        Login login = new Login(webDriver);
        login.login();
    }

}
