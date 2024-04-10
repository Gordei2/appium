package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookmarkPage extends Page {
    private static final String elseMenu = "//android.widget.ImageView[@content-desc=\"Ещё\"]";
    private static final String removeList = "//android.widget.TextView[@resource-id=\"org.wikipedia:id/title\" and @text=\"Удалить список\"]";
    private static final String emptyTitle = "//android.widget.TextView[@resource-id=\"org.wikipedia:id/empty_title\"]";

    public BookmarkPage(WebDriver driver) {
        super(driver);
    }

    public void removeBookmark() {
        waitElementAndClick(By.xpath(elseMenu));
        waitElementAndClick(By.xpath(removeList));
        waitElementAndClick(By.xpath(okButton));
    }

    public void notNow() {
        waitElementAndClick(By.xpath(negativeButton));
    }

    public String getEmptyTitle() {
        return waitElementPresent(By.xpath(emptyTitle)).getText();
    }
}
