package browser;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");

		WebElement checkboxx = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		checkboxx.click();
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		fname.sendKeys("yash");
		 Actions action = new Actions(driver);
		 action.keyDown(Keys.TAB).perform();
		 action.sendKeys("ahire").perform();
		 action.keyDown(Keys.TAB).perform();
		 action.sendKeys("yash@gmail.com").perform();
		 
		 
		
		
	}

}
