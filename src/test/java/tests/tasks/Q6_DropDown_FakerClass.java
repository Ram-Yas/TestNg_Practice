package tests.tasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q6_DropDown_FakerClass  {

    //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
    //actions class kullanmayin twitteri deneyen instagram i denesin


    @Test
    public void twitterTest() {

        TwitterPage twitterPage = new TwitterPage();
        Driver.getDriver().get(ConfigReader.getProperty("twitterUrl"));

        twitterPage.twitterCookies.click();
        twitterPage.signUp.click();
        Faker faker = new Faker();
        twitterPage.name.sendKeys(faker.name().firstName());
        //twitterPage.month.sendKeys(faker.date().);





    }
}
