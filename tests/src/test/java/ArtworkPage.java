import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArtworkPage extends PageBase {
    By downloadButton = By.xpath("//a[@download]");

    public ArtworkPage(WebDriver driver) {
        super(driver);
    }

    public void downloadImage() {
        waitAndReturnElement(downloadButton).click();
        waitUntilVisible(downloadButton);
    }
}
