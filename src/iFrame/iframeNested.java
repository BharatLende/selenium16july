package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeNested {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		WebElement nestedFrame = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println("main page string is "+nestedFrame.getText());
		
		driver.switchTo().frame("frame1");
		String parentFrame = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(parentFrame);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));

		String childFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(childFrame);
		
		driver.switchTo().defaultContent();
		
		System.out.println(nestedFrame.getText());

	}

}
