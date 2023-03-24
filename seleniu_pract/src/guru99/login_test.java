package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class login_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		WebElement loginId = driver.findElement(By.name("uid"));
		loginId.sendKeys("Userld");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Password");
		
		WebElement login = driver.findElement(By.name("btnLogin"));
		login.click();

	}

}
