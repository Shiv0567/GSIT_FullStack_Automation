package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import drivers.DriverManager;
import pages.HomePage;
import pages.SignUpLoginPage;
import pages.LoggedInPage;

public final class LogoutTest extends BaseTest

{
	
	
	public class logoutUserTest extends BaseTest{
		@Test
		@Parameters({"logoutEmail","logoutPassword"})
		public void logoutTest(String logoutMail, String logoutPassword)
		{
			
			
			WebDriver driverRef = DriverManager.getDriver();
			
			 logger.info("TESTCASE 4 : LOGOUT");
			
			HomePage homePage = new HomePage(driverRef);
			Assert.assertTrue(homePage.homePageIsDisplayed(),"Expected Home Page to be visible but it is not");
			logger.info("Home Page is displayed successfully");
			homePage.clickSignUpORLogin();
			logger.info("Navigated to Signup/Login page");
			
			
			
			
			
			
			SignUpLoginPage loginPage = new SignUpLoginPage(driverRef);
			Assert.assertTrue(loginPage.isLogin(),"Expected Login Page to be visible but it is not");
			logger.info("Login Page is displayed successfully");
			loginPage.enterEmail(logoutMail);
			loginPage.enterPassword(logoutPassword);
			loginPage.clickOnLoginButton();
	        logger.info("Entered credentials and clicked Login button");
			
	        
	       
	        
	        
	        LoggedInPage myAccPage = new LoggedInPage(driverRef);
			Assert.assertTrue(myAccPage.isUserLoogedIn()," Expected user to be logged in but validation failed");
			logger.info("User logged in successfully as: {}", myAccPage.getLoggedInUserName());
			myAccPage.clickOnLogout();
			logger.info("User clicked Logout button");
			
			
			
			

			
			
			Assert.assertTrue(loginPage.isLogin()," Expected to navigate back to Login Page after logout, but it did not");
			logger.info("Successfully navigated back to Login Page after logout");

			
		}

	
	
	

	}}
