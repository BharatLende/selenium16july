package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxFundsPage 
{
	@FindBy(xpath="//a[@id='funds']")private WebElement MyFunds;
	
	public UpStoxFundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getMyFunds()
	{
		String funds=MyFunds.getText();
		System.out.println("Funds available to trade is "+funds);
		
	}

}
