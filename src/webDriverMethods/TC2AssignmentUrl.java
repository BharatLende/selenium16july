package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2AssignmentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String expectedUrl="https://www.facebook.com/";
		String actualUrl=driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("Url is matched test case is pass");
		}
		else
		{
			System.out.println("Url is not matched test case is fail");
		}
	}

}
