package NeoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class neoStoxPasswordPage 
{

	@FindBy(id="txt_accesspin") private WebElement passwordfield;
	@FindBy(xpath="//a[text()='Submit']") private WebElement submitButton;
	
	public neoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPassword(WebDriver driver,String pass)
	{
		passwordfield.sendKeys(pass);
		Reporter.log("Enetring pasword",true);
	}
  
   public void clickOnSubmitButton(WebDriver driver)
   {
	   submitButton.click();
	   Reporter.log("Click on submit Button",true);
   }
   
   
}