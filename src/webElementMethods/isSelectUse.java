package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
	   
		WebElement checkBox1=driver.findElement(By.id("checkBoxOption1"));
		System.out.println(checkBox1.isSelected());
		
		
		checkBox1.click();
		System.out.println(checkBox1.isSelected());
		
	}

}
