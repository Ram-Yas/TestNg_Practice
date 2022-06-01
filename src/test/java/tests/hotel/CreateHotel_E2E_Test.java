package tests.hotel;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CreateHotel_E2E_Test {

    @Test
    public void createHotel() {

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
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        //8. Save butonuna tıklayın.
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.
    }
}
