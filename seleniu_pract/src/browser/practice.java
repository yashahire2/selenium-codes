package browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

public class practice {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		WebElement select = driver.findElement(By.xpath(""));
		Select choose = new Select(select);
		choose.selectByIndex(0);
		
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath(null)));
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.build().perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE );
		FileUtils.copyFile(srcfile, new File(""+currentdatetime()+".jpeg"));
		
		String mainwindow = driver.getWindowHandle();
		Set<String> chilwindows = driver.getWindowHandles();
		Iterator<String> itr = chilwindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
			}
			
		}
				
		FileInputStream fis = new FileInputStream("path");
		Properties prop = new Properties();
		prop.load(fis);
		prop.getProperty("");
		
		FileInputStream xcel = new FileInputStream("excelpath");
		XSSFWorkbook wkbook = new XSSFWorkbook();
		Sheet sheets =wkbook.getSheet("shhet1");
		 WebElement dd = driver.findElement(By.xpath(sheets.getRow(0).getCell(2).getStringCellValue()));
		 
		 FileOutputStream write = new FileOutputStream("path");
		 Row row = sheets.createRow(4);
		 org.apache.poi.ss.usermodel.Cell		 cell = row.createCell(7);
		 wkbook.write(write);
		 write.close();
		 
	}

	private static String currentdatetime() {
		// TODO Auto-generated method stub
		return null;
	}

}
