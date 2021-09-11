package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//starts with xpath locator
		
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("9404067556");
		driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("123456");
		//driver.findElement(By.xpath("//button[starts-with(@name,'log')]")).click();
		
		
		//xpath text() function locator
//		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
//		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//div[@id=\"container\"]//following::input[1]")).sendKeys("abd456");
		driver.findElement(By.xpath("//div[@id=\"container\"]//following::input[2]")).sendKeys("123456");
		driver.findElement(By.xpath("//div[@id=\\\"container\\\"]//following::button")).click();
	}

}
