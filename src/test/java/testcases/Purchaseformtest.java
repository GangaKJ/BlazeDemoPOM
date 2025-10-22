package testcases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.PurchasePage;
import pageObjects.ReservePage;
import utils.BaseTest;

public class Purchaseformtest extends BaseTest{
	
	public void goToPurchasePage() {
		
	    HomePage home = new HomePage(driver);
	    home.selectCities("Boston", "New York");
	    home.clickFindFlights();

	    ReservePage reserve = new ReservePage(driver);
	    reserve.chooseFirstFlight();
	  }

	  @Test(priority=1)
	  public void testEmptyNameField() {
	    goToPurchasePage();
	    PurchasePage form = new PurchasePage(driver);
	    form.fillFormAndPurchase("", "123 Lane", "Chennai", "TN", "600001", "4111111111111111");
	  }

	  @Test(priority=2)
	  public void testInvalidCardNumber() {
	    goToPurchasePage();
	    PurchasePage form = new PurchasePage(driver);
	    form.fillFormAndPurchase("Ganga", "123 Lane", "Chennai", "TN", "600001", "invalid");
	  }

	  @Test(priority=3)
	  public void testValidDataSubmission() {
	    goToPurchasePage();
	    PurchasePage form = new PurchasePage(driver);
	    form.fillFormAndPurchase("Ganga", "123 Lane", "Chennai", "TN", "600001", "4111111111111111");
	  }
	

}
