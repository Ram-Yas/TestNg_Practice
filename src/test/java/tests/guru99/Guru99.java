package tests.guru99;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99DrapAndDropPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Guru99 {
    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */

    @Test
    public void test01() throws IOException, InterruptedException {

        Guru99DrapAndDropPage guru = new Guru99DrapAndDropPage();
        Driver.getDriver().get(ConfigReader.getProperty("guruUrl"));

        // cerezleri gecelim
        guru.cookies.click();
        Actions actions = new Actions(Driver.getDriver());
        //DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        actions.dragAndDrop(guru.bankButton, guru.debitAccountArea).perform();
        Thread.sleep(2000);

        //    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        actions.dragAndDrop(guru.salesButton, guru.creditAccountArea).perform();
        Thread.sleep(2000);

        //    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        actions.dragAndDrop(guru.fiveThousondButton, guru.debitAmountArea).perform();
        Thread.sleep(2000);

        //    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        actions.dragAndDrop(guru.fiveThousondButton2,guru.creditAmountArea).perform();
        Thread.sleep(2000);

        //    Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(guru.perfectButton.isDisplayed());

        //bir de ekran goruntusu alalim
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
