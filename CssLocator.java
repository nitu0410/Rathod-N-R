package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();


//driver.findElement(By.cssSelector("input#email")).sendKeys("9404067556");
//driver.findElement(By.cssSelector("input#pass")).sendKeys("nitu9404067556");
//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("9404067556");
//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("nitu9404067556");
//driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();

//driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("9404067556");
//driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("nitu9404067556");
//driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]")).click();


//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[name=\"email\"]")).sendKeys("9404067556");
//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[name=\"pass\"]")).sendKeys("nitu9404067556");
//driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[name=\"login\"]")).click();	

	driver.findElement(By.cssSelector("div>input[type=\"text\"]")).sendKeys("9404067556");
	driver.findElement(By.cssSelector("div>input[type=\"password\"]")).sendKeys("nitu9404067556");
	driver.findElement(By.cssSelector("div>button[name=\"login\"]")).click();
	driver.findElement(By.cssSelector("div>svg[class=\"a8c37x1j ms05siws hwsy1cff b7h9ocf4 fzdkajry\"]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("div[class=\"pzdrnzhu ihqw7lf3 jyxxhhb5\"]")).click();
	
	//driver.findElement(By.cssSelector("div[class=\"rq0escxv datstx6m k4urcfbm a8c37x1j\"]")).click();
	Thread.sleep(3000);
	
	//driver.findElement(By.cssSelector("div[class=\"notranslate _5rpu\"]")).sendKeys("Hi This is Rathod N.R.");
	//driver.findElement(By.cssSelector("div[aria-label=\"Press Enter to send\"]")).click();
//	driver.findElement(By.cssSelector("input[aria-label=\"Search Messenger\"]")).sendKeys("Arun Mate");
//	driver.findElement(By.cssSelector("a[href=\"/messages/t/100012233823751/\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("div[class=\"notranslate _5rpu\"]")).sendKeys("Hi This Is Rathod N.R.  this message is send by selenium");
//	driver.findElement(By.cssSelector("div[aria-label=\"Press Enter to send\"]")).click();
	
//	driver.findElement(By.cssSelector("input[aria-label=\"Search Messenger\"]")).sendKeys("Ravi Nangre");
//	driver.findElement(By.cssSelector("a[href=\"/messages/t/100000639249426/\"]")).click();
//	
//	driver.findElement(By.cssSelector("div[class=\"notranslate _5rpu\"]")).sendKeys("Hi This Is Rathod N.R.  this message is send by selenium");
//	driver.findElement(By.cssSelector("div[aria-label=\"Press Enter to send\"]")).click();
//	driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("Ravi Nangre");
//	driver.findElement(By.cssSelector("a[href=\"/search/top/?q=ravi%20nangre&__epa__=SEARCH_BOX&__eps__=comet.messenger&__stsd__=eyJwcmltYXJ5Ijp7InR5cGUiOiJUWVBFQUhFQURfUEVPUExFX0VOVElUSUVTIn19\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.cssSelector("a[href=\"https://www.facebook.com/ravi.nangre?__tn__=%3C\"]")).click();
//	driver.findElement(By.cssSelector("div[aria-label=\"Add Friend\"]")).click();
//	
	driver.findElement(By.cssSelector("input[aria-label=\"Search Messenger\"]")).sendKeys("sachin nimgaonkar");
	driver.findElement(By.xpath("//a[@href='/messages/t/100001630310084/']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hi This Is Rathod N.R.  this message is send by selenium");
	driver.findElement(By.xpath("//div[@aria-label='Press Enter to send']")).click();
	
	
	}

}
