package TestNg_KeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods
{
  @Test
  public void D() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("A method is running",true);
  }
  
  @Test
  public void B() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("B method is running",true);
  }
  
  @Test(dependsOnMethods={"B","C"},invocationCount=3) 
  public void A()
  {
	  Reporter.log("D method is running",true);
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("C method is running",true);
  }

}
