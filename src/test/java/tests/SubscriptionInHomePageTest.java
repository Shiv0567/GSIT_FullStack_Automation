package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;

public class SubscriptionInHomePageTest extends BaseTest

{
	@Test
	public void  testSubscription()
	{
		WebDriver driverRef = DriverManager.getDriver();
		
		 logger.info("TESTCASE 10  VERIFY SUBSCRIPTION IN HOME PAGE");

		HomePage homePage = new HomePage(driverRef);
		Assert.assertTrue(homePage.homePageIsDisplayed(),"Expected Home Page to be visible, but it is not.");
		logger.info("Home Page is displayed successfully");

		
		String email = "usersname3@gmail.com";
		homePage.enterSubscribeEmail(email);
		logger.info("Entered subscription email: {}", email);

		
		homePage.clickSubscribeButton();
		logger.info("Clicked on 'Subscribe' button");
		Assert.assertTrue(homePage.isSubscribe(),"Expected subscription success message to be visible, but it is not.");
		logger.info("Subscription success message displayed successfully for email: {}", email);
	    
	}

	
	
	
}

