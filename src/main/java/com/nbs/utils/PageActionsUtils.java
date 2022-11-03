package com.nbs.utils;

import com.nbs.config.ConfigFactory;
import com.nbs.driver.DriverManager;
import com.nbs.enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActionsUtils {

    public static void click(By by, WaitType waitType){    // By is equal to driver.findElement
        WebElement element = null;
        if(waitType == WaitType.PRESENCE) {
            element = waitUntilElementPresent(by);
        } else if(waitType == WaitType.CLICKABLE) {
            element = waitUntilElementPresent(by);
        } else if (waitType == WaitType.VISIBLE) {
            element = waitUntilElementPresent(by);
        }
        element.click();
    }

    public static void sendKeys(By by,String value){
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
    }

    public static WebElement waitUntilElementPresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;
    }

    public static WebElement waitUntilElementClickable(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }

    public static WebElement waitUntilElementVisible(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }
}
