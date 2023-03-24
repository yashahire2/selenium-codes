package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hey yash')");
		//driver.switchTo().alert().accept();
		
		WebElement alert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert.click();
		driver.switchTo().alert().accept();
		
		WebElement timealert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timealert.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.switchTo().alert().accept();
		
		
	}

}
