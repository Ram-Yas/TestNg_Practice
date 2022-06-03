package tests.react;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ReactShoppingPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.text.CompactNumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ReactShoppingTest {




    @Test
    public void reactShoppingTest() {
        ReactShoppingPage reactShopping = new ReactShoppingPage();
        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("reactUrl"));

        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
        List<WebElement > urunlerListesi = reactShopping.urunler;
      //  urunlerListesi.stream().forEach(t-> System.out.println(t.getText()));
        System.out.println("Sitede "+urunlerListesi.size()+ " urun var");

        // 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String> urunIsimleri = new ArrayList<>();
        for (int i = 0; i < urunlerListesi.size(); i++) {
            System.out.println(i+1 +". urun "+ urunlerListesi.get(i).getText());
            urunIsimleri.add(urunlerListesi.get(i).getText());
        }

        System.out.println(urunIsimleri);
        // 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
                // (Her ürün 1 defadan fazla eklenemez!)

        // 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
        // 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
        // 7.Checkout'a tıklayın
    }
}
