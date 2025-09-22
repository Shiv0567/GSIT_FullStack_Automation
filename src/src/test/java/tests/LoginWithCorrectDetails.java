package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import drivers.DriverManager;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.SignUpLoginPage;
import pages.LoggedInPage;

public class LoginWithCorrectDetails extends BaseTest



{
	
	
	@Test(dataProvider="loginData",dataProviderClass=DataProviders.class)
	public void testLogin(Map<String,String>data)
	{
		WebDriver driver = DriverManager.getDriver();
		
		 logger.info("TESTCASE 2 : LOGIN USER WITH  CORRECT EMAIL AND  PASSWORD ");
		
		
	    HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.homePageIsDisplayed(),  "Expected Home Page to be visible but it is not");
		logger.info("Home Page is displayed successfully");
		
	
		
		
	    homePage.clickSignUpORLogin();
	    logger.info("Navigated to Signup/Login page");
	    SignUpLoginPage loginPage = new SignUpLoginPage(driver);
	    Assert.assertTrue(loginPage.isLogin(), "Expected login section to be visible but it is not");
	    logger.info("Login section is visible");
		    
		loginPage.enterEmail(data.get("username"));
		loginPage.enterPassword(data.get("password"));
		loginPage.clickOnLoginButton();
		logger.info("fill details and clicked on login button");
	
		LoggedInPage myAccount = new LoggedInPage(driver);
		 Assert.assertTrue(myAccount.isUserLoogedIn(), "Expected user should login, but it is not ");
		 logger.info("User logged in successfully: {}", myAccount.getLoggedInUserName());
		 myAccount.clickDeleteAcc();
         logger.info("Clicked on Delete Account button");
         DeleteAccountPage DelPage = new DeleteAccountPage(driver);
         logger.info("Account has been deleted successfully");
         DelPage.continueClick();
         

	}
	
	
	

}
