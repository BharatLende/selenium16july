package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public AlertPopUp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		//when open link then click on alerts and inspect word 'click me'
		        //or
		//clicking on pop up button it will show alert popup		  
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		
		//we need to switch selenium focus from main page to popup
		//use method driver.switchTo().alert();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();//when use this method then click on popup 'alert ok' button		
		String mytext = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		System.out.println(mytext);
		
		//complete
		
	}

}
