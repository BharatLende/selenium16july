package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivissionPopUp {

	public HiddenDivissionPopUp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		//when open site then click on login button then open another login window inspect that login button.
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("I phone 14");
		
		//here we inspect thar cross sign and click on that then it will be canclled.
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		//complete
		
	}

}
