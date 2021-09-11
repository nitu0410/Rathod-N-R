package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
	//	username.sendKeys("Rathod N R");
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
	//	email.sendKeys("nitu0410@gmail.com");
		//driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		//address.sendKeys("Flat no7 J J residency canol road Beed");
//		address.sendKeys(Keys.CONTROL);
//		address.sendKeys("a");
//		address.sendKeys(Keys.CONTROL);
//		address.sendKeys("c");
//		address.sendKeys(Keys.TAB);
//		WebElement permanantaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
//		permanantaddress.sendKeys(Keys.CONTROL);
//		permanantaddress.sendKeys("v");
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
		
//		
		WebElement permanantaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(username, "Rathod N R").perform();
		actions.sendKeys(email, "nitu0410@gmail.com").perform();
		actions.sendKeys(address, "flat no7 j j residency beed").perform();
		
		
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB).perform();
		//actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		
		

	}

}
