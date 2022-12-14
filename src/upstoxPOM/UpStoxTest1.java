package upstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//create a object of logi page
		
		UpStoxLoginPage1 login =new UpStoxLoginPage1(driver);
		login.enterUserID();
		login.enterpassword();
		login.ClickOnSignInButton();
		
		Thread.sleep(1000);
		//create a object of passcode page
		
		 UpStoxPssCodePage passcode =new  UpStoxPssCodePage(driver);
		 
		 passcode.enterpassCode();
		 
		 //Thread.sleep(4000);
		//ctreate object of Welcome Page
		 
		// UpStoxWelcomePage welcome=new UpStoxWelcomePage();
		 //welcome.clickOnNoIamGoodButton();
		 
		 //Thread.sleep(1000);
	      // create	object of home page
		 
		 //UpstoxHomePage home =new  UpstoxHomePage(driver);
		 //home.validateUserID();
		 //home.clickOnFundsButton();
		 
		 //Thread.sleep(1000);
		 //create object of funds page
		 
		 //UpStoxFundsPage funds=new  UpStoxFundsPage(driver);
		 //funds.getMyFunds();
		 
		 //Thread.sleep(1000);
		 
		 //home.logout();
		

	}

}
