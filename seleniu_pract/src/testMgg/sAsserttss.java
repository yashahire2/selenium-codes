package testMgg;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(testMgg.listnerss.class)
public class sAsserttss {
	
	public WebDriver driver ; 
	public	SoftAssert sassert;
	public Properties prop ;
	public	FileInputStream fis;


@Test
  public void f() throws IOException {
	  
	  driver = new ChromeDriver();
	  sassert = new SoftAssert();
	  fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\src\\properties\\prop1");
	  prop = new Properties();
	  prop.load(fis);
	  driver.get(prop.getProperty("url1"));
	  driver.manage().window().maximize();
	  Reporter.log("succefully navigates to url");
  }
  
@Test (dependsOnMethods = "f")
  public void title () {
	  String actual_title = prop.getProperty("title");
	  Assert.assertEquals(actual_title, driver.getTitle());
	  Reporter.log("title verified");
	  
  }

@Test(dependsOnMethods = "title")
public void logo() {
	WebElement logo = driver.findElement(By.xpath("//div[@class='av-column-2 my-auto']//div[@class='logo']"));
	sassert.assertEquals(logo.isDisplayed(), "logo is displayed");
	Reporter.log("logo verified", false);
}

@Test
	public void ss() throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\scrennshots"+curretdatetime()+".jpeg"));
}

public static String curretdatetime() {
	// TODO Auto-generated method stub
	return new SimpleDateFormat("dd-MM-yy  HH-mm-ss ").format(new Date());
}
  
  
  
  
  
  
  
  
  
  
  
}
