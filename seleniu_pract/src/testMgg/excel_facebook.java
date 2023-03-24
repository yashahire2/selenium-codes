package testMgg;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class excel_facebook {
  
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet ;
	FileInputStream file1;
	
	@Test
  public void f() throws IOException {
  
  file1 = new FileInputStream("C:\\Users\\admin\\Desktop\\selenium pract.xlsx");
  workbook = new XSSFWorkbook(file1);
  sheet = workbook.getSheet("facebook");
  driver = new ChromeDriver();
  
  String url = sheet.getRow(0).getCell(1).getStringCellValue();
   driver.get(url);
  System.out.println(url);
   
  String email = sheet.getRow(1).getCell(1).getStringCellValue();
  WebElement mail = driver.findElement(By.xpath(email));
  System.out.println(email);
  String sendemail = sheet.getRow(1).getCell(2).getRawValue();
  System.out.println(sendemail);
  mail.sendKeys(sendemail);
  
  String pass = sheet.getRow(2).getCell(1).getStringCellValue();
  System.out.println(pass);
  WebElement sendpass = driver.findElement(By.xpath(pass));
  String sendpassword = sheet.getRow(2).getCell(2).getStringCellValue();
  System.out.println(sendpassword);
  sendpass.sendKeys(sendpassword);
  
  String login_btn = sheet.getRow(3).getCell(1).getStringCellValue();
  WebElement login = driver.findElement(By.xpath(login_btn));
 // login.click();
  
  
  TakesScreenshot ts = (TakesScreenshot)driver;
  File srcfile = ts.getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(srcfile, new File("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\scrennshots\\"+currentdatetime()+".jpeg"));
  
  
  }

	public static String currentdatetime() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("dd-MM-yy  HH-ss-mm ").format(new Date());
	}
	
	@Test(dependsOnMethods = "f")
  public void alert () {
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert ('login succesfulluy')");

	
	}
	
	

}
