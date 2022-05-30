package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99DrapAndDropPage {

    public Guru99DrapAndDropPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@class='button button-orange'])[6]")
    public WebElement salesButton;

    @FindBy (xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankButton;

    @FindBy (xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement fiveThousondButton;

    @FindBy (xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement fiveThousondButton2;

    @FindBy (xpath = "(//li[@class='placeholder'])[1]")
    public WebElement debitAccountArea;

    @FindBy (id = "amt7")
    public WebElement debitAmountArea;

    @FindBy (id = "loan")
    public WebElement creditAccountArea;

    @FindBy (xpath = "(//ol[@class='field13 ui-droppable ui-sortable'])[2]")
    public WebElement creditAmountArea;

    @FindBy (xpath = "(//p[@class='fc-button-label'])[1]")
    public WebElement cookies;

    @FindBy (xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectButton;

}
