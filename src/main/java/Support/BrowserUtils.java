package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by monred on 0r5/02/2016.
 */
public class BrowserUtils {

    private static WebDriver driver  = null;


    public static WebDriver getDriver(String browser){
        if(browser == "mozilla")
            driver = new FirefoxDriver();
        else {
            throw new IllegalArgumentException(browser);
        }
        return driver;
        }

    /*public WebDriver setDriver( String browser , String appUrl){

        if(browser == "mozilla")
        driver = new FirefoxDriver();
        driver.get(appUrl);
        return driver;
    }*/


}
