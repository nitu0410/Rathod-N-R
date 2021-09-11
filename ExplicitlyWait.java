package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("nitin");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nitin");
		
		
		

	}

}
