package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends BasePage


{

	public ContactUsPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	By PageHeading =  By.xpath("//h2[normalize-space()='Get In Touch']");
	By name = By.cssSelector("input[data-qa='name']");
	By email = By.cssSelector("input[data-qa='email']");
	By subject =  By.cssSelector("input[data-qa='subject']");
	By inputMessage = By.cssSelector("textarea[data-qa='message']");
	By uploadFile = By.cssSelector("input[name='upload_file']");
	By submit= By.cssSelector("input[data-qa='submit-button']");
	By successPopUp = By.cssSelector("div.status.alert.alert-success");
	By homeButton = By.xpath("//span//parent::a[@href='/']");
	
	
	
	
    public boolean isContactUs() 
    {
        return isElementVisible(PageHeading);
    }


    public void enterName(String name) 
    {
        type(this.name, name);
    }


    public void enterEmail(String email) 
    {
        type(this.email, email);
    }

   
    public void enterSubject(String subject) 
    {
        type(this.subject, subject);
    }

  
    public void enterInputMessage(String inputMessage) 
    {
        type(this.inputMessage, inputMessage);
    }

    
    public void upload(String file) 
    {
        type(uploadFile, file);
    }

    public void clickOnSubmit() 
    {
        click(submit);
    }

    public void contactUsAlert() 
    {
        acceptAlert();
    }

   
    public boolean isContactUsFormSubmit() 
    {
        return isElementVisible(successPopUp);
    }

    
    public void clickOnHome() 
    {
        click(homeButton);
    }
	

}
