package testMgg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class basic_2 {
  
	WebDriver driver;;
	@Test(priority = 1)
  public void f() {
		WebElement usernam = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		usernam.sendKeys("9511700704");
		password.sendKeys("Ya@123123");
		login.click();
		
	  
  }
	
	@Test(priority = 2)
	public void title () {
		System.out.println(driver.getTitle());
		
	}
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.get("https://www.facebook.com/");
  }
 

  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


}
