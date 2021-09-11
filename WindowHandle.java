package Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		WebElement TabBtn = driver.findElement(By.xpath("//button[text()='New Tab']"));
		//WebElement NewWin = driver.findElement(By.xpath("//button[text()='New Window']"));
		WebElement NewWinMsg = driver.findElement(By.xpath("//button[text()='New Window Message']"));
		NewWinMsg.click();
		
		String Mainwindow = driver.getWindowHandle();
		Set<String> Childwindows = driver.getWindowHandles();
		Iterator<String> iterator = Childwindows.iterator();
		
		while (iterator.hasNext()) {
			String Childwindow = iterator.next();
			if (!Mainwindow.equalsIgnoreCase(Childwindow)) {
				driver.switchTo().window(Childwindow);
				
			}
		}
		
		
		
		//System.out.println(driver.getCurrentUrl());
//		String Sampleheading = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
//		System.out.println(Sampleheading);
		
		String mewwinm = driver.findElement(By.xpath("//html//body//text()")).getText();
		System.out.println(mewwinm);
//		String newwindowmessage = driver.findElement(By.xpath("//*[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']//ancestor::html")).getAttribute("body");
//		System.out.println(newwindowmessage);
		
		driver.close();
		driver.switchTo().window(Mainwindow);
		driver.close();
		//driver.quit();
		
		
		

	}

}
