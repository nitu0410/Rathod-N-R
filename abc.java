package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='icon']//parent::div")).click();
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		driver.findElement(By.xpath("//li[@id='item-0']//following-sibling::li[1]")).click();
		//driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("aria-label=\"Toggle\"")).click();
		
		
		

	}

}
