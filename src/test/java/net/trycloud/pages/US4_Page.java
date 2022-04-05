package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US4_Page {
    public US4_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='files']")
    public WebElement fileModule;

    @FindBy(xpath = "(//th[@id='headerSelection'])[1]")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//tbody[@id='fileList']//input[@type='checkbox']")
    public List<WebElement> allCheckBoxes;
}