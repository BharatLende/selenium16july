package upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("userId")).sendKeys("6VBZ93");
		
		driver.findElement(By.name("password")).sendKeys("Uup%6336");
		
		driver.findElement(By.id("submit-btn")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("yob")).sendKeys("1991");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(""));
		
		Thread.sleep(1000);
		
		String actualUN = driver.findElement(By.xpath("")).getText();
		String expectedUN ="Bharat L";
		
		//validating actual and expected User name
		
		if(actualUN.equals(expectedUN))
		{
			
		System.out.println("UserName matching TC is Pass");
		}
		else
		{
			System.out.println("UserName not matching T is Fail");
		}
		
		//chech Funds
		
		driver.findElement(By.id("")).click();
		Thread.sleep(1000);
		
		String myFund = driver.findElement(By.xpath("")).getText();
		System.out.println("Fund available of trade is "+myFund);
		
		
	}

}
