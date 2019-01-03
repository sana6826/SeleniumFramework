package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLogin_Page {

	
static WebDriver driver;


By email = By.name("identifier");
By next1 = By.xpath("//*[@id=\"identifierNext\"]/content/span");
By password = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
By next2 = By.xpath("//*[@id=\"passwordNext\"]/content/span");
public GmailLogin_Page(WebDriver driver)
{
	this.driver= driver;
}

public void Login(String username,String pass) throws InterruptedException
{
	driver.findElement(email).sendKeys(username);
	driver.findElement(next1).click();
	String url =driver.getCurrentUrl();
	System.out.println("The Current URL is :"+url);
	Thread.sleep(3000);
	//driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
	System.out.println("password is :"+pass);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(next2).click();
	System.out.println(driver.getCurrentUrl());
}


}
