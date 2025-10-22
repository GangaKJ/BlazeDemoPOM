package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {
	WebDriver driver;

    private By inputName = By.id("inputName");
    private By address = By.id("address");
    private By city = By.id("city");
    private By state = By.id("state");
    private By zipCode = By.id("zipCode");
    private By creditCardNumber = By.id("creditCardNumber");
    private By purchaseBtn = By.cssSelector("input[type='submit']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }
// actions
    public void fillFormAndPurchase(String name, String addr, String cityName, String stateName, String zip, String card) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(creditCardNumber).sendKeys(card);
        driver.findElement(purchaseBtn).click();
    }

}
