package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import drivers.DriverManager;
import pages.DeleteAccountPage;
import pages.AccountCreatedPage;
import pages.HomePage;
import pages.SignUpLoginPage;
import pages.LoggedInPage;
import pages.SignUpForm;




public class RegisterUserTest extends BaseTest

{
	
	@Test(dataProvider="signupData",dataProviderClass=DataProviders.class)
	  
    public void testUserRegistrationFlow(Map<String,String>data)
	
	{


		  logger.info("TESTCASE 1 : REGISTER USER");

		    WebDriver driver = DriverManager.getDriver();
		    HomePage homePage = new HomePage(driver);
		    Assert.assertTrue(homePage.homePageIsDisplayed(), "Expected Home Page to be visible but it is not");
		    logger.info("Home Page is displayed successfully");

		   
		    homePage.clickSignUpORLogin();
		    logger.info("Navigated to Signup/Login page");

		    
		    SignUpLoginPage loginPage = new SignUpLoginPage(driver);
		    Assert.assertTrue(loginPage.isSignup(), "Expected Signup section to be visible but it is not");
		    logger.info("Signup section is visible");

		   
		    loginPage.enterUsername(data.get("username"));
		    loginPage.enterEmailAddress(data.get("email"));
		    loginPage.clickOnSignUpButton();
		    logger.info("Performed signup with username: {} and email: {}",data.get("username"), data.get("email"));

		    
		    SignUpForm signupPage = new SignUpForm(driver);
		    Assert.assertTrue(signupPage.isEnterAccInfo(), "Expected Account Information section but it is not visible");
		    logger.info("Account Information section is visible");
		    
		    signupPage.selectTitle(data.get("title"));
		    signupPage.setPassword(data.get("password"));
		    signupPage.selectDay(data.get("day"));
		    signupPage.selectMonth(data.get("month"));
		    signupPage.selectYear(data.get("year"));
		    signupPage.enableNewsletterSignup();
		    signupPage.clickSpecialOffersCheckbox();
		    signupPage.enterFirstName(data.get("firstName"));
		    signupPage.enterLastName(data.get("lastName"));
		    signupPage.enterCompany(data.get("company"));
		    signupPage.enterAddress1(data.get("address1"));
		    signupPage.selectCountry(data.get("country"));
		    signupPage.enterState(data.get("state"));
		    signupPage.enterCity(data.get("city"));
		    signupPage.enterZipCode(data.get("zipcode"));
		    signupPage.enterMobileNo(data.get("mobileNo"));
		    signupPage.clickCreateAcc();
		    logger.info("Filled all account details and submitted the form");
 
		    AccountCreatedPage createAccPage = new AccountCreatedPage(driver);
		    Assert.assertTrue(createAccPage.isAccCretedMsg(), "Expected Account Created message but not found");
		    logger.info("Account has been created successfully");
		    createAccPage.continueClick();
		   
		    LoggedInPage myAccPage = new LoggedInPage(driver);
		    Assert.assertTrue(myAccPage.isUserLoogedIn(), "Expected user to be logged in but it is not");
		    logger.info("User logged in successfully:" +myAccPage.getLoggedInUserName());   
		    myAccPage.clickDeleteAcc();
		    logger.info("Clicked on Delete Account button");
		    DeleteAccountPage accDelPage = new DeleteAccountPage(driver);
		    Assert.assertTrue(accDelPage.isAccDeleted(), "Expected Account Deleted message but not found");
		    logger.info("Account has been deleted successfully");
		    accDelPage.continueClick();
		    
		    
		    
		
      
    }
	

}
	
	
	
	
	
	
	


