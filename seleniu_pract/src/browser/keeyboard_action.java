package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keeyboard_action {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\seleniu_pract\\src\\properties\\prop1");
		Properties prop = new Properties();
		prop.load(fis);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("keyboardurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions( driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div//span[text()='Buttons']")));
		
		WebElement fullname = driver.findElement(By.xpath("//div//input[@id='userName']"));
		action.sendKeys(fullname, "yash ahire").perform();
		action.keyDown(Keys.TAB).perform();
		
		action.sendKeys("yashahire@gmail.com").perform();
		action.keyDown(Keys.TAB).perform();
		
		action.sendKeys("moshi pune 412`105").perform();
		//select all
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.build().perform();
		
		//action.keyUp(Keys.CONTROL).perform();
		
		
		//action.sendKeys(Keys.CONTROL);
		
		//action.build().perform();
		action.keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.build().perform();
		action.keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.TAB).perform();
		action.keyDown(Keys.ENTER).perform();
		
		
		action.keyDown(Keys.F5).perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("history.go(0)");
		
		
	
		
		
		
		
		
		

	}

}
