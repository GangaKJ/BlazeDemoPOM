package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;

    private By fromPort = By.name("fromPort");
    private By toPort = By.name("toPort");
    private By findFlightsBtn = By.cssSelector("input[type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // actions
    public void selectCities(String from, String to) {
    	
    	WebElement fromDropdown = driver.findElement(fromPort);
    WebElement toDropdown = driver.findElement(toPort);

        // Step 2: Create Select objects
        Select selectFrom = new Select(fromDropdown);
        Select selectTo = new Select(toDropdown);

        // Step 3: Select the cities
        selectFrom.selectByVisibleText(from);
        selectTo.selectByVisibleText(to);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }

}
