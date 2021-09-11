package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//xpath by children and descendant
		driver.findElement(By.xpath("//form[@id='userForm']//child::div[1]//input")).sendKeys("Rathod nitin");
		driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::div[2]//input")).sendKeys("nitu0410@gmail.com");
	
		driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//descendant::textarea")).sendKeys("Beed");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("wadwani");
		
		
		
	}

}
