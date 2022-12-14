package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class baseClass
{

	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		
		Reporter.log("Launching Browser", true);
		Thread.sleep(1000);
		
	
		
	}
}
