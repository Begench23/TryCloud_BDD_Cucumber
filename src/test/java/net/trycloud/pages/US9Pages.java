package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9Pages {

    public US9Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement detailsSelect;

    @FindBy(xpath = "//a[@data-id = 'commentsTabView']")
    public WebElement commentsTab;

    @FindBy(xpath = "//div[@data-placeholder = 'New comment …']")
    public WebElement commentsMessage;

    @FindBy(xpath = "//input[@class = 'submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement myMessage;
}
