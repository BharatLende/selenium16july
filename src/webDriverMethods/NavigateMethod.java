package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdrive.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		//driver.navigate().to("https://kite.zerodha.com/");
		//Thread.sleep(1000);
		
		//driver.navigate().back();
		//Thread.sleep(1000);
		//driver.navigate().forward();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
