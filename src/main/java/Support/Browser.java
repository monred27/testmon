package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by monred on 0r5/02/2016.
 */
public class Browser {

    private WebDriver driver  = null;

    public WebDriver getDriver(){

        this.driver = new WebDriver();
        }

    public WebDriver setDriver( String browser , String appUrl){

        if(browser = "mozilla")
        driver = new FirefoxDriver();
        driver.get(appUrl);
        return driver;
    }


}
