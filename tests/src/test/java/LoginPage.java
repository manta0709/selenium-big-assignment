import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {
    private By userFieldBy = By.xpath("//input[@name='username']");
    private By passwordFieldBy = By.xpath("//input[@name='password']");
    private By loginButtonBy = By.xpath("//div//button[@id='loginbutton']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.deviantart.com/users/login");
    }

    public WebElement getUserField() {
        return this.waitAndReturnElement(userFieldBy);
    }

    public WebElement getPasswordField() {
        return this.waitAndReturnElement(passwordFieldBy);
    }

    public WebElement getLoginButton() {
        return this.waitAndReturnElement(loginButtonBy);
    }

    public MainPage loginAs(String user, String password) {
        this.waitAndReturnElement(userFieldBy).sendKeys(user);
        this.waitAndReturnElement(loginButtonBy).click();
        this.waitAndReturnElement(passwordFieldBy).sendKeys(password);
        this.waitAndReturnElement(loginButtonBy).click();

        return new MainPage(this.driver);
    }
}