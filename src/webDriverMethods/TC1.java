package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(10000);
		
		String expectedTitle= "Velocity|Best software testing center in Pune and Mumbai";
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title is matching test case is pass");
		}
		else
		{
			System.out.println("Title is not matching test case is fail");
		}
	}

}
