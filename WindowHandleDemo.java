package Window;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String mainwindow = driver.getWindowHandle();
		
		Set<String>childwindows=driver.getWindowHandles();
		
		Iterator<String>iterator=childwindows.iterator();
		while(iterator.hasNext()) {
			String childwindow = iterator.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
			driver.switchTo().window(childwindow);
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.tagName("a")).click();
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo().window(mainwindow);
			
		}
		
		}
		driver.quit();

	}
	

}
