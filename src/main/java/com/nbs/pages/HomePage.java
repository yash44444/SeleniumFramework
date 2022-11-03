package com.nbs.pages;

import com.nbs.driver.DriverManager;

public class HomePage {

    public String getTitle(){
        return DriverManager.getDriver().getTitle();
    }
}
