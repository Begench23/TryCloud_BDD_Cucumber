package net.trycloud.step_definitions;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.US4_Page;
import net.trycloud.utilities.BrowserUtils;
import net.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Us4_stepDefinition {
    US4_Page page=new US4_Page();
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String fileModule) {
        page.fileModule.click();

    }
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {
      String expectedTitle="Files - Trycloud QA.";
      String actualTitle= Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        page.firstCheckBox.click();

    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement each :page.allCheckBoxes ) {
            Assert.assertTrue(each.isSelected());
        }
    }
}
