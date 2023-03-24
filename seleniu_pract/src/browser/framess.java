package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		//driver.switchTo().frame("");
		WebElement frame1heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame1heading.getText());
		
		
	}

}
