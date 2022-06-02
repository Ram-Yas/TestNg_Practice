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

    @FindBy(id = "menuHotels")
    public WebElement hotelMenu;

    @FindBy (xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelList;

    @FindBy (xpath = "//a[@href='/admin/HotelAdmin/Create']")
    public WebElement addHotel;

    @FindBy (xpath = "(//input[@class='form-control input-lg required'])[1]")
    public WebElement codeText;

    @FindBy (xpath = "//div[@class='bootbox-body']\n")
    public WebElement registrationSuccesfullyText;

    @FindBy (xpath = "    //button[@data-bb-handler='ok']\n")
    public WebElement okButtonEnd;

}
