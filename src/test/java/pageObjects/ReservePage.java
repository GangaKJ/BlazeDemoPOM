package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservePage {
	WebDriver driver;

    // Selecting the flights
    private By chooseFlightBtn = By.xpath("//table/tbody/tr[1]/td[1]/input");
    private By chooseFlightBtn2=By.xpath("//tbody/tr[2]/td[1]/input[1]");
    private By chooseFlightbtn3=By.xpath("//tbody/tr[3]/td[1]/input[1]");

    public ReservePage(WebDriver driver) {
        this.driver = driver;
    }

    // actions
    
    public void chooseFirstFlight() {
        driver.findElement(chooseFlightBtn).click();
    }
    public void chooseSecondFlight() {
        driver.findElement(chooseFlightBtn2).click();
    }

    public void choosethirdFlight() {
        driver.findElement(chooseFlightbtn3).click();
    }
    
}
