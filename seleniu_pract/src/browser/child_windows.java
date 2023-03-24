package browser;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class child_windows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		 String mainwindow = driver.getWindowHandle();
		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		services.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		Iterator<String>itr = childwindows.iterator();
		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!mainwindow.equalsIgnoreCase(childwindow));
			driver.switchTo().window(childwindow);
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert ('welcome yash')");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.quit();
		
		
	}

}
