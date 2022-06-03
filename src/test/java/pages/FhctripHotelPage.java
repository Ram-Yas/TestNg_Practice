package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhctripHotelPage {

    public FhctripHotelPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement usernameText;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement passwordText;


    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

}
