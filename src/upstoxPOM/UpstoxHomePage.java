package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage
{
	//Variable declaration
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement UserId;
	
	@FindBy(id="funds")private WebElement funds;
	
	@FindBy(xpath="//div[text()='Logout']")private WebElement logOutButton;
	
	
	//2.
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  validateUserID()
	{
		String actualUserID= UserId.getText();
		String expectedUserID ="Bharat L.";
		
		if(actualUserID.equals(expectedUserID))
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

