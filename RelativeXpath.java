package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//relative x path syntax is     //tagname[@attributename='value'
		WebElement heading = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		System.out.println(heading.getText());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9404067556");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
