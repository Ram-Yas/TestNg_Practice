package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@href='/Account/Logon']")
    public WebElement loginPageButton;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement usernameEntry;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement userPasswordEntry;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement loginSubmitButton;

    @FindBy (xpath = "//div[@id='datatable_ajax_wrapper']")
    public WebElement table;

    @FindBy(xpath = "//*[.='Username or password is incorrect, please correct them and try again']")
    public WebElement failedLogin;


}
