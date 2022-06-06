package tests.hotel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ConcortHotel {
    ConcortHotelPage concortHotel;
    @Test
    public void login() {
        concortHotel = new ConcortHotelPage();
        //Bir class oluşturun : D18_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://qa-environment.concorthotel.com/admin/HotelRoomAdmin adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("concortHotelUrl"));
        concortHotel.advancedButton.click();
        concortHotel.continueLink.click();
        concortHotel.loginPageButton.click();
        Actions actions = new Actions(Driver.getDriver());

        concortHotel.usernameEntry.sendKeys(ConfigReader.getProperty("hotelTrueUsername")+ Keys.ENTER);
        concortHotel.userPasswordEntry.sendKeys(ConfigReader.getProperty("hotelTruePassword")+Keys.ENTER);
        concortHotel.loginSubmitButton.sendKeys(Keys.ENTER);
        Driver.getDriver().get(ConfigReader.getProperty("concortHotelRoomAdminUrl"));
        //○ Username : manager ○ Password : Manager2!

    }

    @Test
    public void table() {
        //● table( ) metodu oluşturun
        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.

    }

//● printRows( ) metodu oluşturun //tr
//○ table body’sinde bulunan toplam satir(row) sayısını bulun.
//○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
//○ 4.satirdaki(row) elementleri konsolda yazdırın.
//● printCells( ) metodu oluşturun //td
//○ table body’sinde bulunan toplam hücre(cell) sayısını bulun.
//○ Table body’sinde bulunan hücreleri(cells) konsolda yazdırın.
//● printColumns( ) metodu oluşturun
//○ table body’sinde bulunan toplam sutun(column) sayısını bulun.
//○ Table body’sinde bulunan sutunlari(column) konsolda yazdırın.
//○ 5.column daki elementleri konsolda yazdırın.

}
