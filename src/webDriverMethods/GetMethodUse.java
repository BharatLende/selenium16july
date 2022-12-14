package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class GetMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("http://www.facebook.com/");
	
	driver.get("http://vctcpune.com/");
	
	driver.manage().window().minimize();
	Thread.sleep(1000);
	
	
	driver.manage().window().maximize();
	
	driver.close();//Close the current tab of present in browser oppened by selenium tool.
	
		driver.quit();
	
	
	

	}

}
