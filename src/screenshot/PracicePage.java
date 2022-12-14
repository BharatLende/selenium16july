package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PracicePage {

	public PracicePage() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		File Practice = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\Bharat\\P.png");
		
		FileHandler.copy(Practice, destination);
	}

}
