import org.openqa.selenium.WebDriver;

public class UploadPage extends PageBase{
    public UploadPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.deviantart.com/studio?new=1");
    }
}