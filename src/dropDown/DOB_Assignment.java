package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Assignment {

	public DOB_Assignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		
		// for click on create new account use method click()
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bharat");
		
		//WebElement day = driver.findElement(By.id("day"));
		//Select sday=new Select(day);
		//sday.selectByValue("14");
		//Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth=new Select(month);
		smonth.selectByVisibleText("11");
		Thread.sleep(2000);
		
		//WebElement year = driver.findElement(By.id("year"));
		//Select syear= new Select(year);
		//syear.selectByVisibleText("1991");
	
	}

}
