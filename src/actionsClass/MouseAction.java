package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public MouseAction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
 // Mouse action --> Double click
		
 //1. Create object of action class pass driver object as a argument.
		
		Actions act=new Actions(driver);
		
 //2. By using one of the action class methods,perform desired action.
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(1000);
		
		act.moveToElement(doubleClickButton).perform();
		act.doubleClick();
		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		act.doubleClick(doubleClickButton).perform();
		
		//Mouse action--> contextclick-->(Right Click)
		
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(1000);
		act.moveToElement(rightClickButton).perform();
		act.contextClick().perform();
		
		act.moveToElement(rightClickButton).contextClick().build().perform();
		
		act.contextClick(rightClickButton).perform();
		
		//complete
	
	}

}
