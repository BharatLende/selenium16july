package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

		WebElement hideButton = driver.findElement(By.id("alertbtn"));
		
		//scrolling into view
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",hideButton);
		System.out.println(hideButton.getText());
	}

}

//complete