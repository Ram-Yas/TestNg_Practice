package tests.fhctripHotel;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FhctripHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreateHotel {

    @Test
    public void createHotel() {
        FhctripHotelPage hotel = new FhctripHotelPage();
        Driver.getDriver().get(ConfigReader.getProperty("fhcTripUrl"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(hotel.usernameText,ConfigReader.getProperty("fhcTripUsername"))
                        .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("fhcTripPassword"))
                        .sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
        //hotel.loginButton.click();

    }
}
