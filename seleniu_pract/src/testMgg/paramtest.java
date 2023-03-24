package testMgg;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramtest {
  @Test (invocationCount = 5)
  @Parameters ({"val1" , "val2"})
  public void add(int v1 , int v2) {
	  int ad = v1 + v2 ;
	  System.out.println(ad);
	  Reporter.log("failed", true);
	  
  }
  @Test
  @Parameters({"val1" , "val2"})
  public void suub (int v1 , int v2) {
	  int sub =v1- v2;
	  System.out.println(sub);
	  
  }
}
