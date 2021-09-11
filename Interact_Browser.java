import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interact_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("olympic 2021");
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9404067556");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9404067556");
		WebElement nextBtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		nextBtn.click();
		

}
}
