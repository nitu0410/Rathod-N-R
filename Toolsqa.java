package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nitin");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Rathod");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nitu0410@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9404067556");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//option[@value='0']")).click();
		driver.findElement(By.xpath("//option[@value='1989']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--004']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,400)");
//		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).click();
//		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).sendKeys("Mechanical Engineering");
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		//driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\nitu0\\OneDrive\\Desktop\\SID_2812.jpg");
		
		
	}

}
