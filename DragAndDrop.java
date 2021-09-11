package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange' and text()=5000]"));
		WebElement destination = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		actions.dragAndDrop(source, destination).perform();

	}

}
