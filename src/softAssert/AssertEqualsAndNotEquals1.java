package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals1 {
	
	SoftAssert soft=new SoftAssert();
	
  @Test
  public void myTest1() 
  {
	  String a="indrajit";
	 // String b="jagtap";
	  String c="indrajit";
	  
	  soft.assertEquals(a, c,"value is not matching TC is failed");
	  
	  soft.assertNotEquals(a, c,"value is matching TC is failed");
	  
	  soft.assertAll();
  }
  
  @Test
  public void myTest2() 
  {
	  boolean d=true;
	 // boolean e=false;
	  
	  soft.assertTrue(d, "value is not true TC is failed");
	  
	  soft.assertFalse(d, "value is true TC is failed");
	  
	  soft.assertAll();
  }
}
