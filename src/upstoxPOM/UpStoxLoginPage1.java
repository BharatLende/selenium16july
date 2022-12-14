package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage1 {

	
		// variable declaration(Globally)--> no of elements = no of variable
		//1. Data number should be declared globally with level privatebusing @findBy Annotation
			
			@FindBy(name="userId")private WebElement UserID;	
			
			@FindBy(xpath="//input[@name='password']")private WebElement password;
			@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signInButton;
			
			//2. initialize within a constructor with access level public using pagefactory
			
			public UpStoxLoginPage1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);

	}
			//3. Utilize witin amethod with access level public
			
		public void enterUserID()
			{
				UserID.sendKeys("6VBZ93");
			}
			public void enterpassword()
			{
			password.sendKeys("Uup%6336");
			}
			public void ClickOnSignInButton()
			{
				signInButton.click();
			}
			

}
