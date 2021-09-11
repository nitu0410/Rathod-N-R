package Find_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Login_Gmail {

	private static Object nextBtn;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();
	WebElement Username = driver.findElement(By.id("username"));
	Username.sendKeys("nitu0410@gmail.com");
	WebElement nextBtn = driver .findElement(By.id("username"));
	nextBtn.click();
	}

}
