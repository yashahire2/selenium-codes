package browser;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v107.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class mouse_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement dynamicclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement button = driver.findElement(By.xpath("//span[text()='Buttons']"));
		
		boolean butnpresence = rightclick.isDisplayed();
		if(butnpresence) {
			System.out.println("trrue");
		}
		boolean selectedbtn = rightclick.isSelected();
		boolean enabled = rightclick.isEnabled();
		
		Actions action = new Actions (driver);
		action.moveToElement(button);
		action.doubleClick(doubleclick).perform();
		
		action.contextClick(rightclick).perform();
		
		action.click(dynamicclick).perform();
		
		/*driver.get("https://demoqa.com/droppable");
		WebElement interaction = driver.findElement(By.xpath("//div[text()='Interactions']"));
		action.moveToElement(interaction).perform();
		
		WebElement dragable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(dragable, dropable).perform();
		
		driver.get("https://www.naukri.com/");
		WebElement services = driver.findElement(By.xpath("//div[text()='Services']"));
		action.moveToElement(services).perform();*/
		
		
		
		
	}

}
