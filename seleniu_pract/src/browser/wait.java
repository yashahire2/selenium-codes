package browser;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//WebElement after = driver.findElement(By.xpath("//button [@id ='enableAfter']"));
	
		//after.click();
		
		//flaunt wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(TimeoutException.class)
				;
		
		driver.get("https://amazon.in");
		System.out.println(driver.getTitle()+" = title");
		driver.manage().window().maximize();
			
				WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		wait.until(ExpectedConditions.visibilityOf(mob));
		mob.click();
		
		WebElement apple = driver.findElement(By.xpath("//div//span[text()='Apple']"));
		apple.click();
		
		WebElement todaysdeal = driver.findElement(By.xpath("//div [@id = 'nav-xshop']//a[@data-csa-c-slot-id = 'nav_cs_5']"));
		todaysdeal.click();
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcfile, new file);
		
		
	
	}

}
