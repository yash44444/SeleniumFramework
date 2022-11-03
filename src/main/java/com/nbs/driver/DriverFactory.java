package com.nbs.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.nbs.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// takes care of logic of which browser to launch

public final class DriverFactory {

   private DriverFactory(){}

    public static WebDriver getDriver(String browserName){
        WebDriver driver;
        String browser = ConfigFactory.getConfig().browser();
        if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
}
