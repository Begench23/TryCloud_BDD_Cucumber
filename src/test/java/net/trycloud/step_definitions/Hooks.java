package net.trycloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.trycloud.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {


    @After
    public void tearDownn(Scenario scenario) {

        if (scenario.isFailed()) {
            WebDriver driver = Driver.getDriver();
            byte[] bytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(bytes, "image/png", scenario.getName());
        }
        Driver.closeDriver();

    }


}
