package NeoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class neoStoxHomePage
{
	@FindBy(xpath="(//a[text()='ok'])[2]") private WebElement okButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement closeButton;

	public neoStoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void handlePopUpPage(WebDriver driver)
	{
		okButton.click();
		Reporter.log("Clicking on Close Button of PopUp",true);
	}
}
