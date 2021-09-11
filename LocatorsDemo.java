package Find_Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("email")).sendKeys("9404067556");
		//driver.findElement(By.id("pass")).sendKeys("9404067556");
		
		//driver.findElement(By.name("email")).sendKeys("9404067556");
		//driver.findElement(By.name("pass")).sendKeys("9404067556");
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(5000);
//		driver.findElement(By.className("inputtext")).sendKeys("9404067556");
//		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("9404067556");
//		
		//Thread.sleep(5000);
		
		
//		driver.navigate().to("https://kite.zerodha.com");
//		driver.findElement(By.id("userid")).sendKeys("940406");
//		driver.findElement(By.id("password")).sendKeys("9404067556");
//		driver.findElement(By.className("button-orange")).click();
//	
		
		driver.get("https://login.5paisa.com/");
		WebElement username = driver.findElement(By.id("loginUser"));
		username.sendKeys("53617830");
	
		WebElement password = driver.findElement(By.id("loginPwd"));
		password.sendKeys("Nitin0410@");
		WebElement dob = driver.findElement(By.id("loginDob"));
		dob.sendKeys("04011989");
		WebElement loginbtn = driver.findElement(By.id("LoginSubmit"));
		loginbtn.click();
		WebElement profilebtn = driver.findElement(By.id("ProfileOpen"));
		profilebtn.click();
		WebElement logout = driver.findElement(By.className("logout"));
		logout.click();
		

	}

}
