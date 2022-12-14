package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowAssinment {

	public ChildBrowAssinment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		
		Set<String> allPageId = driver.getWindowHandles();
		System.out.println(allPageId);
		
	   	Iterator<String> it = allPageId.iterator();
	   	String IdOfmainPage = it.next();
	   	String IdOfChildPgage = it.next();
		
		//we need to focus from main page to child browser then use
		//driver.switchTo().window();
		
		driver.switchTo().window(IdOfChildPgage);
		String childText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println("my Child page Text is "+childText);
		
		//switch focus from child page to main page 
		
		driver.switchTo().window(IdOfmainPage);
		String mainText = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']")).getText();
		System.out.println("my main page text is " +mainText);
		
		//complete
		
		
		
		

	}

}

