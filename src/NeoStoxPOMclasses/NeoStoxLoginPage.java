package NeoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxLoginPage 
{

	@FindBy(id="//input[@id='MainContent_signinsignup_txt_mobilenumber']") private WebElement mobileNum;
	
	@FindBy(id="(//a[text()='Sign In'])[2]") private WebElement signInButton;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendMobileNum(WebDriver driver,String mobNum)
	{
	
	    mobileNum.sendKeys(mobNum);                         
	}
	
	public void clickOnSignInButton(WebDriver driver)
	{
		signInButton.click();
		Reporter.log("Clincking on Sign In Button",true);
	}

}
