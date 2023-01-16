package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Elements
public class P01_login {
    WebDriver driver;
    public P01_login(WebDriver driver){
        this.driver = driver;
    }

    public WebElement login_button(){
        // return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"))
        return driver.findElement(By.name("btnLogin"));
    }

    public WebElement userID(){
        // return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"))
        return driver.findElement(By.name("uid"));
    }

    public WebElement Password(){
        // return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"))
        return driver.findElement(By.name("password"));
    }
    public WebElement homeTitle(){
        return driver.findElement(By.className("heading3"));
    }
    public WebElement mngrID(){
        return driver.findElement(By.className("heading3"));
    }
}
