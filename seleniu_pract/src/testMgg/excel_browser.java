package testMgg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excel_browser {
	
	FileInputStream file1;
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	FileInputStream file1 = new FileInputStream("C:\\Users\\admin\\Desktop\\selenium pract.xlsx");
	workbook = new XSSFWorkbook(file1);
	sheet = workbook.getSheet("web");
	
	driver = new ChromeDriver();
	
	String url = sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	driver.get(url);
	
	FileOutputStream update = new FileOutputStream("C:\\Users\\admin\\Desktop\\selenium pract.xlsx");
	Row row = sheet.createRow(4);
	Cell cell = row.createCell(1);
	
	cell.setCellValue(driver.getTitle());
	workbook.write(update);
	update.close();
	
	
	
	
	
	
	  
  
  
	  
	  
	  
  }
}
