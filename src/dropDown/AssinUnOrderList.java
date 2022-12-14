package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssinUnOrderList {

	public AssinUnOrderList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(1000);
		
		

	}

}
