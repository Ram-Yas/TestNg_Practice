package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConcortHotelPage {
    public ConcortHotelPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[@href='/Account/Logon']")
    public WebElement loginPageButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameEntry;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement userPasswordEntry;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginSubmitButton;

    @FindBy (xpath = "//button[@id='details-button']")
    public WebElement advancedButton;

    @FindBy (xpath = "//a[@id='proceed-link']")
    public WebElement continueLink;

}
