package testMgg;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class data_provider_ex2 {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String username , String pass) throws IOException {
	driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
	
	email.sendKeys(username);
	password.sendKeys(pass);
	loginbtn.click();
	Reporter.log("passed ", true);
	
	
  }
@Test  
public void ss() throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile,new File( "C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\scrennshots\\"+currentdatetimr()+".jpeg"));
}
 
public static String currentdatetimr() {
	// TODO Auto-generated method stub
	return new SimpleDateFormat("dd-MM-yy HH-mm-ss").format(new Date());
}
@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "951170704", "yash1234" },
      new Object[] { "yashahire54@gmail.com", "69180575" },
      new Object[] { "yashahire54@gmail.com", "05756918" },
      new Object[] { "9511700704", "y@123123" },
      
      
    };
  }
}
