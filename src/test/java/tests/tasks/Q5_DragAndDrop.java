package tests.tasks;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q5_DragAndDrop  {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


    @Test
    public void dhtmlgoodiesTest() {
        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodiesUrl"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.copanhagen, dhtmlgoodiesPage.denmark).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.usa).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKore).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();
        actions.dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();
    }
}