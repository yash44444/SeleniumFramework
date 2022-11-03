package org.nbs.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.nbs.pages.LoginPage;

public class HomePageTest {

    @DataProvider
    public static Object[][] getData(){
        return new Object[][]{
                {"Admin","admin123","OrangeHRM"}
        };
    }

    @Test(description = "To verify the title of the orangeHRM website",dataProvider = "getData")
    public void titleValidationTest(String username, String password,String expectedTitle){
        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage.loginToApplication(username,password).getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
