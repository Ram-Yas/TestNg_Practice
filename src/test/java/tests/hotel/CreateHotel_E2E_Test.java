package tests.hotel;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreateHotel_E2E_Test {

    @Test
    public void createHotel() throws InterruptedException {

        HotelMyCampPage hotelMyCamp = new HotelMyCampPage();
        //1. Tests packagenin altına class olusturun: CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        hotelMyCamp.loginPageButton.click();
        //a. Username : manager
        hotelMyCamp.usernameEntry.sendKeys(ConfigReader.getProperty("hotelTrueUsername"));
        //b. Password : Manager1!
        hotelMyCamp.userPasswordEntry.sendKeys(ConfigReader.getProperty("hotelTruePassword"));
        //5. Login butonuna tıklayın.
        hotelMyCamp.loginSubmitButton.click();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCamp.hotelMenu.click();
        hotelMyCamp.hotelList.click();
        hotelMyCamp.addHotel.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(hotelMyCamp.codeText,ConfigReader.getProperty("hotelNewCode"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelNewName"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelNewAdresse"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelNewPhone"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelNewEmail"))
                .sendKeys(Keys.TAB).sendKeys(Keys.END)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();

Thread.sleep(2000);
        //8. Save butonuna tıklayın.
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        String actualAddAlert = hotelMyCamp.registrationSuccesfullyText.getText();
        String expectedAddAlert = ConfigReader.getProperty("hotelmycampAddHotelAlertText");

        Assert.assertEquals(actualAddAlert,expectedAddAlert);

        //10. OK butonuna tıklayın.
        hotelMyCamp.okButtonEnd.click();

        Driver.closeDriver();
    }
}
