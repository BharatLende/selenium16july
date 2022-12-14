package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//create object of login page
		
		UpStoxLoginPage1 login= new UpStoxLoginPage1(driver);
		
		login.enterUserID();//call login methods
		//Thread.sleep(1000);
		
		login.enterpassword();
		login.ClickOnSignInButton();
		
		//passcode
		Thread.sleep(1000);
		
		UpStoxPssCodePage passcode =new  UpStoxPssCodePage(driver);
		 
		 passcode.enterpassCode();
		 Thread.sleep(4000);
		 
		 UpStoxWelcomePage welcome= new  UpStoxWelcomePage(driver);
		 welcome.clickOnNoIamGoodButton();
		 Thread.sleep(1000);
		 
		 UpstoxHomePage home=new UpstoxHomePage(driver);
				 
                   home.validateUserID();
                   home.clickOnFundsButton();
                   Thread.sleep(1000);
                   
          UpStoxFundsPage funds =new UpStoxFundsPage(driver);
          funds.getMyFunds();
          Thread.sleep(1000);
          
          home.logout();
          
                   
	}

}
