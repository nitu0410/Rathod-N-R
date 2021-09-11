package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FollowingSibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div//input[@id='userName']")).sendKeys("rathod");
//		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div//input[@id='userEmail']")).sendKeys("nitu0410@gmail.com");
//		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div//input[@id='currentAddress']")).sendKeys("beed");
// 
		String caddress = driver.findElement(By.xpath("//textarea[@id='permenentAddress']//preceding::label[1]")).getText();
		System.out.println(caddress);
		WebElement Links = driver.findElement(By.xpath("span[text()='Dynamic Properties']"));
		Actions action = new Actions(driver);
		action.moveToElement(Links).build().perform();	
 
 
 
 
 
 //preceding and preceding-sibling method
 
 driver.get("https://kite.zerodha.com/");

	}

}
