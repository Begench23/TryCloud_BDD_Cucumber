package net.trycloud.step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.trycloud.pages.US9Pages;
import org.junit.Assert;

public class US9_step_definition {

    US9Pages us9Pages = new US9Pages();

    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {
       us9Pages.filesButton.click();
    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        us9Pages.actionIcon.click();
    }

    @When("user choose the Details option")
    public void user_choose_the_option() {
        us9Pages.detailsSelect.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        us9Pages.commentsTab.click();
        us9Pages.commentsMessage.sendKeys("Hello world!");
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        us9Pages.submitButton.click();

        String actualMessage = us9Pages.myMessage.getText();
        String expectedMessage = "Hello world!";
        Assert.assertEquals("My expected text is not the same as actual one",expectedMessage,actualMessage);
    }
}
