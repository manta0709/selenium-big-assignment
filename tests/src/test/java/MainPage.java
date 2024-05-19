import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class MainPage extends PageBase {

    By profileMenu = By.xpath("//a[contains(@class, 'user-link')]");

    By logoutButton = By.xpath("//button[contains(@class, 'reset-button') and descendant::form]");

    By loginButton = By.xpath("//a[contains(@href, 'login')]");

    By dailyChallengesButton = By.xpath("//a[contains(@href,'daily')]");

    By h1 = By.xpath("//header/div/span");

    public MainPage(WebDriver driver) {
        super(driver);
    }    
    
    public String getTitleText() {
        return this.driver.getTitle();
    }

    public WebElement getLogoutButton() {
        hoverProfileMenu();
        return waitAndReturnElement(logoutButton);
    }

    public WebElement getLoginButton() {
        return waitAndReturnElement(loginButton);
    }

    public void hoverProfileMenu() {
        actions.moveToElement(waitAndReturnElement(profileMenu)).build().perform();
    }

    public void logout() {
        actions.moveToElement(waitAndReturnElement(profileMenu)).build().perform();
        actions.moveToElement(waitAndReturnElement(logoutButton)).build().perform();
        waitAndReturnElement(logoutButton).click();
    }

    public WebElement getDailyChallengesButton() {
        return waitAndReturnElement(dailyChallengesButton);
    }

    public void clickDailyChallenges() {
        getDailyChallengesButton().click();
    }

    public String getH1Text() {
        return waitAndReturnElement(h1).getText();
    }
}