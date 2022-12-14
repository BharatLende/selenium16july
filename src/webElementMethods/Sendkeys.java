package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Bharat");
		Thread.sleep(1000);
		
	}

}
