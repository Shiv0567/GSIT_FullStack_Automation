package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import drivers.DriverManager;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsFormTest extends BaseTest



{
	
	@Test(dataProvider="contactusData",dataProviderClass = DataProviders.class)
	public void testContactUs(String name, String email, String subject, String message, String filePath)
	{
        WebDriver driverRef = DriverManager.getDriver();
        
        logger.info("TESTCASE 6  CONTACT US FORM");

      
        HomePage homePage = new HomePage(driverRef);
        Assert.assertTrue(homePage.homePageIsDisplayed(), "Expected Home Page to be visible but it is not.");
        logger.info("Home Page is displayed successfully");

        homePage.clickOnContactUs();
        logger.info("Navigated to Contact Us page");

        
        ContactUsPage contactUs = new ContactUsPage(driverRef);
        Assert.assertTrue(contactUs.isContactUs(), "Expected Contact Us Page to be visible but it is not.");
        logger.info("Contact Us Page is displayed successfully");

   
        contactUs.enterName(name);
        contactUs.enterEmail(email);
        contactUs.enterSubject(subject);
        contactUs.enterInputMessage(message);
        
        
        
        
        if (filePath != null && !filePath.trim().isEmpty()) 
        {
            contactUs.upload(filePath);
        }
        logger.info("Entered contact details in the form");
        
        
        

        contactUs.clickOnSubmit();
        contactUs.contactUsAlert(); 
        logger.info("Submitted the form and handled alert");

        Assert.assertTrue(contactUs.isContactUsFormSubmit(),"Expected form to be submitted successfully, but validation failed.");
        logger.info("Contact form submitted successfully");
        contactUs.clickOnHome();
        Assert.assertTrue(homePage.homePageIsDisplayed(),"Expected Home Page to be visible after navigating back, but it is not.");
        logger.info("Successfully navigated back to Home Page");
	}
	
	

	
	
	
	
	
	
}
