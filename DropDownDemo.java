import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {
@Test
public void demo() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	
	Select day = new Select(driver.findElement(By.id("day")));
	Select month = new Select(driver.findElement(By.id("month")));
	Select year = new Select(driver.findElement(By.id("year")));
	
	day.selectByIndex(4);
	month.selectByVisibleText("Jan");
	year.selectByValue("1989");
	
	
}
}
