package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		driver.manage().window().maximize();
		
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		System.out.println(checkbox2.isSelected());//for multiple times use
		
		checkbox2.click();
		System.out.println(checkbox2.isSelected());
	}

}
