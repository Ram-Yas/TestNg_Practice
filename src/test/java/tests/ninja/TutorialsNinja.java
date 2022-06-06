package tests.ninja;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NinjaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TutorialsNinja {

    @Test
    public void test01() {

        ///*
        //    ~ click on Phones & PDAs
        //    ~ get the brandName of phones
        //    ~ click on add to button for all elements
        //    ~ click on black total added cart button
        //    ~ get the names of list from the cart
        //    ~ compare the names from displaying list and cart list
        //*/
        NinjaPage ninjaPage = new NinjaPage();
        //    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home

        Driver.getDriver().get(ConfigReader.getProperty("tutorialsNinjaUrl"));
        //    ~ click on Phones & PDAs
        ninjaPage.phonesPdaButton.click();

        //    ~ click on add to button for all elements
        for (WebElement each: ninjaPage.addToCart
             ) {
            each.click();
        }
        ReusableMethods.waitFor(3);

        //    ~ click on black total added cart button
        ninjaPage.blackButton.click();

        //    ~ get the names of list from the cart
        List<String> brandNamesText = new ArrayList<>();
        for (WebElement each : ninjaPage.brandnames
             ) {
            brandNamesText.add(each.getText());
        }



        List<String> cartNamesText = new ArrayList<>();
        for (WebElement each : ninjaPage.namesFromCart
        ) {
            cartNamesText.add(each.getText());
        }

        System.out.println(cartNamesText);
        //    ~ compare the names from displaying list and cart list
        Assert.assertTrue(brandNamesText.containsAll(cartNamesText));
     //   Assert.assertEquals(brandNamesText.stream().sorted(),cartNamesText.stream().sorted(Comparator.comparing(t-> t)));


    }
}
