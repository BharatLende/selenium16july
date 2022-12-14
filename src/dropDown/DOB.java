package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {

	public DOB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
	
		
		WebElement day = driver.findElement(By.id("day"));
		Select d =new Select(day);
		d.selectByVisibleText("14");
		
		
		
		
		
		
		
	}

}
