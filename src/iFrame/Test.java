package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.switchTo().frame("courses-iframe");//selenium first focus on main page
		WebElement myElement = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]"));
		
		//if i reward back frame to main page we need use method like parent
		//driver.switchTo().parentFrame();:child frame to immediate parent
		//driver.switchTo().defaultContent();:child frame to main pae
		
	    System.out.println(myElement.getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).click();
		
	
	}

}
