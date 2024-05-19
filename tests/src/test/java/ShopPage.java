import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage extends PageBase {
    By searchBar = By.xpath("//div//form//input[@type='text']");
    By submitButton = By.xpath("//form//button");
    public ShopPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.deviantart.com/shop");
    }

    public void search(String text) {
        waitAndReturnElement(searchBar).sendKeys(text);
        waitAndReturnElement(submitButton).click();
    }
}