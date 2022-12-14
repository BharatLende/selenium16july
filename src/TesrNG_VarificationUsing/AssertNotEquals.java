package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void testing()
  {
	  String a="Pune";
	  String b="Pune1";
	  
	  //Both are not same (Equal) then Tc is pass
	  
	  Assert.assertNotEquals(a,b,"a and b are same then Tc is fail");
  }
}
