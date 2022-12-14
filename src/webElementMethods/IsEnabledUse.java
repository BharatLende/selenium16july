package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:www.discoveryplus.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h6[text()='Sign In'][2]")).click();
		Thread.sleep(1000);
		
	WebElement getOTPButton = (WebElement) driver.findElements(By.xpath("//button[text()='Get OTP']"));
		Thread.sleep(1000);
		
		System.out.println(getOTPButton.isEnabled());	
		 getOTPButton.click();	
		 driver.findElement(By.id("mobileNumber")).sendKeys("9985414511");
		 System.out.println(getOTPButton.isEnabled());
		 getOTPButton.click();

	}

}
