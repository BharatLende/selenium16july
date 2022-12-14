package upstoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.CommonlyUseMethod;

public class ScrollAndScreenshotOfHomePage
{
	//Variable declaration
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement UserId;
	
	@FindBy(id="funds")private WebElement funds;
	
	@FindBy(xpath="//div[text()='Logout']")private WebElement logOutButton;
	
	
	//2.
	public ScrollAndScreenshotOfHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  validateUserID(String ExpUN,WebDriver driver) throws IOException
	{
		String actualUserID= UserId.getText();
		//String expectedUserID ="Bharat L.";
		
		//scroll to UserID
		
		CommonlyUseMethod.scrollintoView(driver,UserId);
		
		//take a screenshot
		
		CommonlyUseMethod.takescreenShot(driver, actualUserID);
		
		if(actualUserID.equals(ExpUN))
		{
			System.out.println("actual and expected usrID are matching TC pass");
		}
		else
		{
			System.out.println("actual and expected usrID are not matching TC fail");
		}
	}
		
		public void clickOnFundsButton()
		{
			funds.click();
			
		}
		
		public void logout() throws InterruptedException
		{
			UserId.click();
			Thread.sleep(1000);
			
			logOutButton.click();
		}
	}




