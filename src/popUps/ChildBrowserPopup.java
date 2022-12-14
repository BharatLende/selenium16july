package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public ChildBrowserPopup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		
		// clicking on 'new window' button -->will open new child browser.
		
		driver.findElement(By.name("NewWindow")).click();
		
//to switch child page we need ids so.....
	//to get windows id -->use method 'driver.getwindowHandles()'
		
		Set<String> allPageId = driver.getWindowHandles();
		System.out.println(allPageId);//printing all ids.
		
		Iterator<String> it = allPageId.iterator();
		//getting all page IDs
		
		String IdOfmainPage = it.next();
	    String IdOfChildPage = it.next();
	    
	    // we need to switch to child page 
	    
	    driver.switchTo().window(IdOfChildPage);//my focus change from main page to child page
		
	    driver.manage().window().maximize();
	    
	    //driver.close();close current browser
	    //driver.quit();cloce all browser
	    
	    // current focus on child page --> action will be done on child page now.
	    
	   // driver.findElement(By.name("(//i[@class=' mw-icon the7-mw-icon-search-bold'])[3]")).sendKeys("hi");
	    driver.findElement(By.id("the7-search")).sendKeys("good evining");
	    
	    //if we want to do action again om main page then we want to switch focus from child page to main page.
	    
	    driver.switchTo().window(IdOfmainPage);
	    String mytext = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
	    
	    System.out.println("my text is "+mytext);
	    
	    //complete
	}

}