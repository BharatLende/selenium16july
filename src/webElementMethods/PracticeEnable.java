package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeEnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.discoveryplus.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		 Thread.sleep(1000);
		 WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		 getOTPButton.click();
		 System.out.println(getOTPButton.isEnabled());
		
	}

}
