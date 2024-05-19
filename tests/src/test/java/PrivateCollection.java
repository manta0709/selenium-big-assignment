import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrivateCollection extends PageBase {
    By contents = By.xpath("//a[contains(@href,'/art/')]");

    public PrivateCollection(WebDriver driver) {
        super(driver);
        driver.get("https://www.deviantart.com/sqatteruser/private-collections");
    }

    public List<WebElement> getContents() {
        waitUntilVisible(contents);
        return this.driver.findElements(contents);
    }

    public void downloadContents() {
        for (int i = 0; i < 2; i++) {
            List<WebElement> elems = getContents();
            elems.get(i).click();
            ArtworkPage artworkPage = new ArtworkPage(driver);
            artworkPage.downloadImage();
            driver.navigate().back();
            waitUntilVisible(contents);
        }
    }
}