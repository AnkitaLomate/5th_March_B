package verificationUsingTestNG;

//import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void myMethod() 
  {
	//  String s=null;
	  String m="hi";
	  
//	  Assert.assertNull(s, "Value is not null TC is Failed");
//	  Reporter.log("Value is null TC is passed", true);
	  
	  Assert.assertNotNull(m, "Value is null TC is failed");
	  Reporter.log("Value is not null TC is passed ", true);
  }
}
