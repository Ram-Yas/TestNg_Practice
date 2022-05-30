package tests.hotel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class NegativeTest {


    @Test
    public void NegativeLoginTest() throws InterruptedException, IOException {

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));

        hotelMyCampPage.loginPageButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(hotelMyCampPage.usernameEntry)
                .sendKeys(ConfigReader.getProperty("hotelWrongUsername"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("hotelWrongPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);


        Assert.assertTrue(hotelMyCampPage.failedLogin.isDisplayed());

        //Take screenshot to be sure


        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");

        String tarih = date.format(dtf);

        File screenshotFullOfPage = new File("target/screenshots/" + tarih + ".jpeg");

        File temp = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(temp, screenshotFullOfPage);

        Driver.closeDriver();


    }


}
