import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaticPage extends PageBase {
    String url;

    By elementBy;

    public StaticPage(WebDriver driver, String url, By checkLoadedElemBy) {
        super(driver);
        this.elementBy = checkLoadedElemBy;
        this.driver.get(url);
    }

    public String getElementText() {
        return waitAndReturnElement(elementBy).getText();
    }
}
