package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUseMethod
{
	// Screenshot Method
	public static void takescreenShot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Bharat\\Screenshot");
		FileHandler.copy(src,dest);
	}
	
	// scroolinto view
	
	public static void scrollintoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
	}
	
	//wait	
}
