package net.trycloud.utilities;

import net.trycloud.pages.LoginPages;
import org.openqa.selenium.By;

public class TryCloudUtils {


    public static void login() {

        //go to website
        LoginPages login = new LoginPages();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //enter username and  password
        login.userName.sendKeys(ConfigurationReader.getProperty("username"));
        login.password.sendKeys(ConfigurationReader.getProperty("password"));

        //click the login button
        login.loginButton.click();
    }

    public static void login(String username, String password) {

        //go to website
        LoginPages login = new LoginPages();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //enter username and  password
        login.userName.sendKeys(username);
        login.password.sendKeys(password);

        //click the login button
        login.loginButton.click();
    }



}
