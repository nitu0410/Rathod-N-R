package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoqa.com/buttons");
	driver.manage().window().maximize();
	
	
	// Actions class call
	Actions actions = new Actions(driver);
	WebElement DoubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	WebElement RightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
	
	actions.doubleClick(DoubleClickButton).perform();
	actions.contextClick(RightClickButton).perform();
	actions.click(DynamicClick).perform();
	

	}

}
