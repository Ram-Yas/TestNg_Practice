package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReactShoppingPage {

    public ReactShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//p[@class='sc-124al1g-4 eeXMBo']")
    public List<WebElement> urunler;

    @FindBy (xpath = "//button[@class='sc-124al1g-0 jCsgpZ']")
    public List<WebElement> addToCart;
}
