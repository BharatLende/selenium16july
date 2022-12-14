package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void testing()
  {
	  String a=null;
	  
	  Assert.assertNotNull(a,"a is Null Tc is fail");
  }
}
