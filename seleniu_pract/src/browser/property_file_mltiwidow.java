package browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class property_file_mltiwidow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\src\\properties\\prop1");
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		String mainwindow = driver.getWindowHandle();
		
		
		WebElement services = driver.findElement(By.xpath(prop.getProperty("services")));
		//services.click();
		Actions action = new Actions(driver);
		action.moveToElement(services).perform();
		
		/*Set<String> childwindows = driver.getWindowHandles();
		Iterator<String> itr = childwindows.iterator();
		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}*/
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert ('windows switch succesfully')");*/
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\scrennshots\\"+currentdatetime()+".jpeg"));
		
			}

	public static String currentdatetime() {
		
		return new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
	}

}
