package commonMethods;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitUsingSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		// using dynamic wait---> Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		CommonlyUseMethod cc=new CommonlyUseMethod();
		//cc.takescreenShot(src, dest);................Pending	

	}

}
