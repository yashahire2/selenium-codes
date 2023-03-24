package testMgg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class xecell  {
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\selenium pract.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheet("pract");
	  System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	  System.out.println("name 2= "+sheet.getRow(3).getCell(0).getStringCellValue());
	  System.out.println("name 1= "+sheet.getRow(2).getCell(0).getStringCellValue());
	  System.out.println("");
	  System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	  System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
	  
	  Row row = sheet.createRow(7);
	  org.apache.poi.ss.usermodel.Cell cell = row.createCell(0);
	  cell.setCellValue("hello !!! i'm backkkk");
	  FileOutputStream fis2 = new FileOutputStream("C:\\Users\\admin\\Desktop\\selenium pract.xlsx");
	  workbook.write(fis2);
	  fis2.close();
	  
	  }
}
