package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	WebDriver driver;

    private By confirmationTitle = By.tagName("h1");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationTitle).getText();
    }

}
