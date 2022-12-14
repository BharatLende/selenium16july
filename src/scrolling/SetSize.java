package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//how to get size
		Dimension defaultsize=driver.manage().window().getSize();
		System.out.println(defaultsize);
		
		//to set size we need to create object of dimension class and pass width and length
		
		Dimension d = new Dimension(1200,252);
		
		//by using dimension object set the size using setSizeMethod
		
		driver.manage().window().setSize(d);
		
		
		//to set the size we need tocteate object of Dimension class and pass width and height
		
		Dimension d1=new Dimension(900,600);
		
		
		

	}

}
