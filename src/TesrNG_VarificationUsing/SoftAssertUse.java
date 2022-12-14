package TesrNG_VarificationUsing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse
{
	SoftAssert soft =new SoftAssert();
	
  @Test
  public void testing()
  {
	  String a="abc";
	  String b=null;
	  
	  // if a and b not equal and b is null then Tc is pass
	  
	  soft.assertNotEquals(a,b,"a and b is equal Tc is failed");
	  soft.assertNull(b,"b is not null Tc is failed");
  }
}
