import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class StudioPage extends PageBase {
    //By inputField = By.xpath("//div[@role='presentation']/button");
    By inputField = By.xpath("//input[@style='display:none']");

    By studioTable = By.tagName("table");

    public StudioPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.deviantart.com/studio");
    }

    public void uploadFile(String path) {
        waitAndReturnElement(inputField).sendKeys(Paths.get(path).toAbsolutePath().toString());
    }

    public WebElement getStudioTable() {
        return waitAndReturnElement(studioTable);
    }
}
