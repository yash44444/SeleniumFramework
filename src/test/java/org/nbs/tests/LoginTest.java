package org.nbs.tests;

import org.testng.annotations.*;
import com.nbs.pages.LoginPage;

public class LoginTest extends BaseTest {

    @DataProvider
    public static Object[][] getData(){
        return new Object[][]{
                {"Admin","admin123"}
        };
    }

    @Test(description = "To verify the title of the orangeHRM website",dataProvider = "getData")
    public void loginToApplication(String username, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication(username,password);
    }

}

