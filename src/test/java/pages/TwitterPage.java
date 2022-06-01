package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TwitterPage {

    public TwitterPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//div[@class='css-18t94o4 css-1dbjc4n r-1sw30gj r-sdzlij r-1phboty r-rs99b7 r-18kxxzh r-1q142lx r-eu3ka r-5oul0u r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr r-lif3th'])[1]")
    public WebElement twitterCookies;

    @FindBy (xpath = "//a[@data-testid='signupButton']")
    public WebElement signUp;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy (xpath = "//input[@name='phone_number']")
    public WebElement phoneNumber;

    @FindBy (id="SELECTOR_1")
        public WebElement month;

    @FindBy (id="SELECTOR_2")
    public WebElement day;

    @FindBy (id="SELECTOR_3")
    public WebElement year;

    @FindBy (xpath = "(//div[@class='css-901oao r-1awozwy r-18jsvk2 r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")
    public WebElement nextButton;





}
