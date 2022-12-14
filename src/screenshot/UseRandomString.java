package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UseRandomString {

	private static String random;

	public UseRandomString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		String randoam=RandomString.make(3);
		File dest=new File("D:\\Bharat\\Screenshot\\fs"+random+".jpg");
		FileHandler.copy(scr, dest);
		
		
		
		
	}

}
