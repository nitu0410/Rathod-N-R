import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = "D:\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.google.co.in");
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getTitle());
 driver.navigate().to("https://www.facebook.com"); 
 String facebook = "https://www.facebook.com";
 driver.navigate().to(facebook);
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getTitle());
 driver.navigate().back();
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getTitle());
 driver.navigate().forward();
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getTitle());
 driver.navigate().refresh();
 driver.close();

	}


		
	}

		
	