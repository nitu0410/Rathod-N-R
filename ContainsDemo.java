package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// xpath by contains method (syntax is //tagname[contains(@attribute,'value')]
//		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_e')]")).sendKeys("9404067556");
//		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_p')]")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[contains(@class,'_4')]")).click();
		
		//xpath by AND & OR method
		
		driver.findElement(By.xpath("//input[@type='text' or @name=email]")).sendKeys("9404067556");
		driver.findElement(By.xpath("//input[@id='pass' or @name=email]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='pass' or @name='login']")).click();
	}

}
