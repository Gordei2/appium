package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavedPage extends Page {
    private static final String savedItem = "//android.widget.TextView[@resource-id=\"org.wikipedia:id/item_title\" and @text=\"{SUBSTRING}\"]";

    public SavedPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkNoItem(String itemName) {
        var itemPath = getResultSearchElement(savedItem, itemName);
        return noElement(By.xpath(itemPath));
    }
}
