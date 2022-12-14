package TestNg_KeyWord;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut
{
  @Test(timeOut=200)
  public void A() throws InterruptedException 
  {Thread.sleep(300);
	  Reporter.log("A method is running",true);
  }
  
  @Test
  public void B() 
  {
	  Reporter.log("B method is running",true);
  }
  
  @Test(enabled=false)
  public void D() 
  {
	  Reporter.log("D method is running",true);
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("C method is running",true);
  }

}
