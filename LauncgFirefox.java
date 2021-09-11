import org.openqa.selenium.firefox.FirefoxDriver;

public class LauncgFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = "D:\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", path);
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://facebook.com");
	}

}
