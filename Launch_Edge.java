import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {

	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\microsoft edge driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.javatpoint.com/java-tutorial");
	driver.manage().window().maximize();
	driver.close();

	}

}
