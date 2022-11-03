package com.nbs.driver;

import com.nbs.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

// takes care of starting the browser

public final class Driver {

    private Driver() {
    }

    public static void initDriver() {  // method should do only 1 thing at a time
        if (DriverManager.getDriver() == null) {
            String browser = ConfigFactory.getConfig().browser();
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
        }
    }

    public static void tearDown() {
        if (DriverManager.getDriver() != null) {   // shortcut: ifn, ifnn
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
