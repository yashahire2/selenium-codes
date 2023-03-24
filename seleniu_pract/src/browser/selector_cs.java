package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selector_cs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		
		

		/*//for 'id' , we use # and starting word(atrributes) of code 
			WebElement email = chrom.findElement(By.cssSelector("input#email"));
			email.sendKeys("9511700704");
			
			//there should be no gap in cssselector method
			WebElement pass = chrom.findElement(By.cssSelector("input[id='pass']"));
			pass.sendKeys("Ya@123123");
			
			//WebElement login =chrom.findElement(By.cssSelector("button[class='_42ft_4jy0_6lth_4jy6_4jy1selected_51sy']"));
			//login.click();
			WebElement login =chrom.findElement(By.cssSelector("button[name='login']"));
			login.click();
	*/		
	}

}
