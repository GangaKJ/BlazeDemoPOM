package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ConfirmationPage;
import pageObjects.HomePage;
import pageObjects.PurchasePage;
import pageObjects.ReservePage;
import utils.BaseTest;

public class BlazeDemoTest extends BaseTest {
	
	@Test(priority=1)
    public void completeFlightBookingFlow() 
	{
        HomePage home = new HomePage(driver);
        home.selectCities("Boston", "New York");
        home.clickFindFlights();

        ReservePage reserve = new ReservePage(driver);
        reserve.chooseFirstFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.fillFormAndPurchase("Ganga Tester", "123 Lane", "Chennai", "TN", "600001", "4111111111111111");

        ConfirmationPage confirm = new ConfirmationPage(driver);
        String message = confirm.getConfirmationMessage();

        Assert.assertEquals(message, "Thank you for your purchase today!");
    }
	
}
