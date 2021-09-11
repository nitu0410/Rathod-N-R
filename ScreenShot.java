import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public void screenshotdemo() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\nitu0\\eclipse-workspace\\Selenium\\ScreenShot\\abc.jpeg"));
		
	}

}
