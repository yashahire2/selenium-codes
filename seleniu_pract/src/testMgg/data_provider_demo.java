package testMgg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data_provider_demo {
  @Test(dataProvider = "add")
  public void f(Integer n, Integer s) {
	  
	  Integer o = n+s;
	  System.out.println(o);
  }

  @DataProvider
  public Object[][] add() {
    return new Object[][] {
      new Object[] { 1, 5 },
      new Object[] { 2, 20 },
      new Object[] { 20, 20 },
      new Object[] { 223, 20 },
      new Object[] { 2123, 20 },
      new Object[] { 2657 , 80 },
       
    };
  }
}
