package testMgg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;


public class Assert_equlas {
	WebDriver driver;
	@Test
	public void tile() {
		String ACTUAL = "Utkarshaa Academy";
		String EXPEDTED = driver.getTitle();
		Assert.assertEquals(ACTUAL, EXPEDTED);
		  
  }
	
	@Test
	public void ss () throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("path"+CurrentDateTime()+".jpeg"));
		
	}
	
  public static String CurrentDateTime() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("dd-MM-yy HH-mm-ss").format(new Date());
	}
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://utkarshaaacademy.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(options);
  }

  @AfterClass
  public void afterClass() throws IOException {
	  FileInputStream fis = new FileInputStream("");
	  Properties prop = new Properties();
	  prop.load(fis);
	  prop.getProperty("");
	  
  
  }

  @AfterTest
  public void afterTest() {
  
  }

}
