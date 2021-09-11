package tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement tooltipbtn = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		actions.moveToElement(tooltipbtn).perform();
		WebElement tooltipText = driver.findElement(By.xpath("//div[@id='buttonToolTip']"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(tooltipText)).isDisplayed();
		System.out.println(tooltipText.getText());
		WebElement Contrary = driver.findElement(By.xpath("//a[text()='Contrary']"));
		actions.moveToElement(Contrary).perform();
		WebElement ContraryText = driver.findElement(By.xpath("//*[@id='contraryTexToolTip']"));
		System.out.println(ContraryText.getText());
		
		

	
	}

}
