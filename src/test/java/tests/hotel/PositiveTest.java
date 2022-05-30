package tests.hotel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PositiveTest {

    @Test
    public void PositiveLoginTest() throws InterruptedException, IOException {

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));

        hotelMyCampPage.loginPageButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(hotelMyCampPage.usernameEntry)
                .sendKeys(ConfigReader.getProperty("hotelTrueUsername"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("hotelTruePassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, ConfigReader.getProperty("expectedUrl"));

        //Take screenshot to be sure

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");

        String tarih = date.format(dtf);

        File screenshotFullOfPage = new File("target/screenshots/"+tarih+".jpeg");

        File temp = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(temp,screenshotFullOfPage);

        Driver.closeDriver();



    }
}
