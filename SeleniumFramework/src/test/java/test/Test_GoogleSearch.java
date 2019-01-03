package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Test_GoogleSearch gs= new Test_GoogleSearch();
		gs.googlesearch();
	}
public static void googlesearch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ckhanto\\Desktop\\Selenium_workspace\\SeleniumFramework\\drivers\\chdriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	Thread.sleep(3000);
	driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	System.out.println("Successful");
}

}
