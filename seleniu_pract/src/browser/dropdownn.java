package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\src\\properties\\prop1");
		Properties prop = new Properties();
		prop.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("dropdownurl"));
		driver.manage().window().maximize();
		
		WebElement oldselect = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select colorselect = new Select(oldselect);
		//colorselect.selectByIndex(1);
		//colorselect.selectByValue("6");
		colorselect.selectByVisibleText("Blue");
		
		WebElement dyDD = driver.findElement(By.xpath("//div[text()='Select Option']"));
		dyDD.click();
		
		WebElement o2g1 = driver.findElement(By.xpath("//div//div//div//div//div//div[text()='Group 2, option 1']"));
		o2g1.click();
		
		

	}

}
