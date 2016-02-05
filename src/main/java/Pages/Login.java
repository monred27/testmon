package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by monred on 05/02/2016.
 */
public class Login {

    WebDriver driver = new WebDriver();



    public void login(WebDriver driver){

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

        username.sendKeys("simonfathers");
        password.sendKeys("password");
        loginButton.click();

    }

}
