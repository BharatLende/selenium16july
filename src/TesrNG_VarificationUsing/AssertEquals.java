package TesrNG_VarificationUsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void testing()
  {
	  String a="Pune";
	  String b="Pune";
	  
	  //Both are same (Equal) then Tc is pass
	  
	  Assert.assertEquals(a,b,"a and b are not same then Tc is fail");
  }
}
