package net.trycloud.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.LoginPages;
import net.trycloud.utilities.Driver;
import net.trycloud.utilities.TryCloudUtils;
import org.junit.Assert;

public class LoginSteps {

    LoginPages loginPages = new LoginPages();

    @Given("user on the login page")
    public void userOnTheLoginPage() {

        Driver.getDriver().get("http://qa2.trycloud.net/");
    }


    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {

        loginPages.userName.sendKeys(username);
        loginPages.password.sendKeys(password);
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {

        loginPages.loginButton.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verifyTheUserShouldBeAtTheDashboardPage() {

        String expectedTitle = "Dashboard - Trycloud";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
