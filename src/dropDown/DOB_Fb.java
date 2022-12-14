package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		
		// for click on create new account use method click()
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bharat");
		
		
		WebElement day = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg']"));
        Select sday=new Select(day);
        sday.selectByValue("14");
        Thread.sleep(1000);
        
      // WebElement month = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
       //Select smonth=new Select(month);
       //smonth.selectByVisibleText("Nov");
        
	}

}
