import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://seleniumhq.org/");
}
}
