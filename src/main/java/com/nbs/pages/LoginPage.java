package com.nbs.pages;

import com.nbs.enums.WaitType;
import com.nbs.reports.ExtentLogger;
import com.nbs.utils.PageActionsUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXTBOX_USERNAME = By.name("username");
    private static final By TXTBOX_PASSWORD = By.name("password");
    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");

    private LoginPage setUserName(String username){
        ExtentLogger.pass("username entered successfully");
        PageActionsUtils.sendKeys(TXTBOX_USERNAME,username);
        return this;
    }

    private LoginPage setPassword(String password){
        ExtentLogger.pass("password entered successfully");
        PageActionsUtils.sendKeys(TXTBOX_PASSWORD,password);
        return this;
    }

    private HomePage clickLoginBtn(){
        ExtentLogger.info("login button clicked successfully");
        PageActionsUtils.click(BTN_LOGIN, WaitType.CLICKABLE);
        return new HomePage();
    }

    public HomePage loginToApplication(String username,String password){
        return setUserName(username).setPassword(password).clickLoginBtn();
    }
}
