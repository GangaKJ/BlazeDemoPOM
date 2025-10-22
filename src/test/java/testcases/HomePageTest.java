package testcases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import utils.BaseTest;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	  public void testValidCitySelection() {
	    HomePage home = new HomePage(driver);
	    home.selectCities("Boston", "New York");
	    home.clickFindFlights();
	  }

	  @Test(priority=2)
	  public void testSameCitySelection() {
	    HomePage home = new HomePage(driver);
	    home.selectCities("Boston", "London");
	    home.clickFindFlights();
	  }
	  
	  @Test(priority=3)
	  public void testCitySelection()
	  {
		  HomePage home=  new HomePage(driver);
		  home.selectCities("San Diego", "Cairo");
		  home.clickFindFlights();
	  }
	  

}
