package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;
import java.util.List;

public class NinjaPage {

    public NinjaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesPdaButton;

    @FindBy (xpath = "//h4")
    public List<WebElement> brandnames;

    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement blackButton;

    @FindBy (xpath = "//div[@class='button-group']")
    public List<WebElement> addToCart;

    @FindBy (xpath = "//*[@class='text-left']")
    public List<WebElement> namesFromCart;
}
