package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
	//1.Data m should be gobaly with access level private 
	
	@FindBy(id="userCode") private WebElement username;
	
	@FindBy(id="password")private WebElement password;

	@FindBy(id="submit-btn")private WebElement clickonsignButton;
	
	//2. initialize within constructore with access level public using pageFactory
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3. use
	
	public void enterusername(String un) 
	{
		username.sendKeys(un);
		
	}
	
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnSignButton()
	{
		clickonsignButton.click();
	}

}
