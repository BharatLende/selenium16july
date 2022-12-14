package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFiirstSeleniumCode 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.get("http://www.vctcpune.com/");
		driver.get("http://www.facebook.com/");

	}

}
