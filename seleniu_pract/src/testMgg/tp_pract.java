package testMgg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tp_pract {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("");
	  driver.findElement(By.xpath("")).sendKeys("");
	  
	  Actions action = new Actions(driver);
	  action.sendKeys("isa");
	  action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();;
  }
}
