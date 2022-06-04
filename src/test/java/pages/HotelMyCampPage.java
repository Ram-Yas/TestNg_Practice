package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

            @FindBy (xpath ="//button[@class='btn btn-success uppercase']" )
            public WebElement loginAdminRoom;
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

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement okButtonEnd;

    @FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> baslikSutun;

    @FindBy (xpath = "//tbody")
    public WebElement tumBody;

    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> bodySatirlar;

    @FindBy (xpath = "//tbody//tr[4]")
    public WebElement dorduncuSatir;

}
