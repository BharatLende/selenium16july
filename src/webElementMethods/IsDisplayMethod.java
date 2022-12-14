package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {

	public IsDisplayMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
	
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		textBox.sendKeys("Good evining");
		
	    System.out.println("====================");
	    
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		
		hideButton.click();
		
		if(textBox.isDisplayed())
		{
			textBox.sendKeys("Good night");
		}
		else
		{
			System.out.println("text box is not display, plz check");
		}
	}

}
