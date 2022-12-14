package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPssCodePage
{
	//Variable declare
	
	@FindBy(name="yob")private WebElement yob;
	
	// variable initialize
	
	public  UpStoxPssCodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpassCode()
	{
		yob.sendKeys("1991");
	}
	

}
