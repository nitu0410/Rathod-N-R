package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement alertbtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbtn.click();
		driver.switchTo().alert().accept();
		
		WebElement timeralerbtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timeralerbtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
		WebElement confrmbtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confrmbtn.click();
		
		String confrString = driver.switchTo().alert().getText();
		System.out.println(confrString);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement prombtn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prombtn.click();
		driver.switchTo().alert().sendKeys("nitin");
		driver.switchTo().alert().accept();
		
		
		//frame
		driver.navigate().to("https://www.demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		String Msg = driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]")).getText();
		System.out.println(Msg);

	}

}
