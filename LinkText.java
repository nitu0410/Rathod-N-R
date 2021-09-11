package Find_Locator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//driver.findElement(By.linkText("English (UK)")).click();
//driver.findElement(By.partialLinkText(" ")).click();
List <WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());
//driver.findElements(By.tagName("image"));
//System.out.println(links.size());

	}

}
