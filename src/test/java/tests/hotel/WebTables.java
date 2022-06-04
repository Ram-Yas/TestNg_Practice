package tests.hotel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class WebTables {
    //Bir class oluşturun : C02_WebTables
    //● login( ) metodun oluşturun ve oturum açın.
    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //○ Username : manager
    //○ Password : Manager1!
    //● table( ) metodu oluşturun
    //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //● printRows( ) metodu oluşturun //tr
    //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //○ 4.satirdaki(row) elementleri konsolda yazdırın.
    HotelMyCampPage hotelMyCampPage;

    @Test (priority = 1)
    public void roomAdmin() {

        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("hotelRoomAdminUrl"));
        hotelMyCampPage.usernameEntry.sendKeys(ConfigReader.getProperty("hotelTrueUsername"));
        hotelMyCampPage.userPasswordEntry.sendKeys(ConfigReader.getProperty("hotelTruePassword"));
        hotelMyCampPage.loginAdminRoom.click();
    }

    @Test (priority = 2)
    public void table() {
        //● table( ) metodu oluşturun
        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        hotelMyCampPage = new HotelMyCampPage();
        System.out.println("Tablonun sutun sayisi = "+hotelMyCampPage.baslikSutun.size());

        for (WebElement each: hotelMyCampPage.baslikSutun
             ) {
            System.out.println(each.getText());
        }

        System.out.println(hotelMyCampPage.tumBody.getText());
    }

    @Test (priority = 3)
    public void printRows() {
        //● printRows( ) metodu oluşturun //tr
        //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        hotelMyCampPage = new HotelMyCampPage();
        System.out.println("body'de bulunan satir sayisi : "+hotelMyCampPage.bodySatirlar.size());
        //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each : hotelMyCampPage.bodySatirlar
             ) {
            System.out.println(each.getText());
        }
        //○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("Tablodaki 4.satir \n"+hotelMyCampPage.dorduncuSatir.getText());
    }
}
