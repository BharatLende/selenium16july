package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public KeyBoardAction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement userName = driver.findElement(By.xpath("//div[@id='email_container']"));
		
		//userName.sendKeys("hi hello");
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(UserName).sendKeys("Good evenin").build().perform();
		
		//act.sendKeys(userName,"Good night").perform();
		
		WebElement signUpPage = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		
		act.click(signUpPage).perform();
		
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		
		//how to handle drop down
		
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(2000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		//Thread.sleep(2000);
		//act.sendKeys(Keys.ARROW_UP).perform();
		
//By using for loop.
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		Thread.sleep(2000);
		
		act.keyDown(firstName,Keys.SHIFT).sendKeys("Velocity").build().perform();
		
		//complete
	}
	

}
