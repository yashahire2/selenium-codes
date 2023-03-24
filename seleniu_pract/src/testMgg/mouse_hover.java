package testMgg;

import org.testng.annotations.Test;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouse_hover {
	WebDriver driver ;
  @Test(priority = 0)
  public void setup()  {
	 
	
	  driver = new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority = 2)
  public void hover() {
	  WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
	  
	  Actions action = new Actions(driver);
	  action.moveToElement(services).perform();
	  
	   }
 
  @Test(priority = 3)
  public void ss () throws IOException {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File srcfile = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcfile, new File("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\scrennshots\\"+currentdatetime()+".jpeg"));
  }

  public static String currentdatetime() {
		
		return new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
	}
 
	  
  }
  
  
  
 

