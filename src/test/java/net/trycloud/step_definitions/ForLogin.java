package net.trycloud.step_definitions;

import io.cucumber.java.en.Given;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.TryCloudUtils;

public class ForLogin {


    @Given("user logins to the home page as default")
    public void userLoginsToTheHomePageAsDefault() {

        TryCloudUtils.login();

    }

    @Given("user logins to the home page as your {string}")
    public void userLoginsToTheHomePageAsYour(String username) {

        TryCloudUtils.login(username, ConfigurationReader.getProperty("password"));
    }
}
