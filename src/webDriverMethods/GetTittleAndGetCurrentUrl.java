package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleAndGetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		String myString=driver.getTitle();
	    System.out.println("Title of webpage is "+myString );
	    
	    System.out.println(driver.getCurrentUrl());
	    String myUrl=driver.getCurrentUrl();
	    System.out.println("my current url is "+myUrl);

	}

}
