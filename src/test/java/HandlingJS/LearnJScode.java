package HandlingJS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJScode {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Steps to use JS code
	//Step 1(TypeCast)
	JavascriptExecutor jsobj = (JavascriptExecutor)driver;
	
	
	//Step 2 & 3
	jsobj.executeScript("window.location = arguments[0]","https://automationexercise.com/");	
	Thread.sleep(1000);
	
	
	//Refresh 
	jsobj.executeScript("history.go(0)");
	Thread.sleep(1000);
	
	//fetching title
	System.out.println(jsobj.executeScript("return document.title"));
	Thread.sleep(1000);
	
	//fetching URL
	System.out.println(jsobj.executeScript("return document.URL"));
	Thread.sleep(1000);
	
	//click login 
	jsobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
	Thread.sleep(1000);
	
	//enter value
	jsobj.executeScript("arguments[0].value='Jay'",driver.findElement(By.name("name")));
	Thread.sleep(1000);
	
	//enter email
	jsobj.executeScript("arguments[0].value='jayadhan03@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
	Thread.sleep(1000);
	
	//click sign up button
	jsobj.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[text()='Signup']")));
	Thread.sleep(1000);
	
	//enter email after sign up 
	jsobj.executeScript("arguments[0].value='jay123@gmail.com'",driver.findElement(By.id("email")));
	Thread.sleep(1000);
	
	
	//Scroll to address
	jsobj.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//h2/b[text()='Address Information']")));	
	Thread.sleep(1000);
	
	
	//Note:it will consider previous point for scrolling.
	jsobj.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
			
	//Note:it will consider origin point for scrolling.
	jsobj.executeScript("window.scrollTo(0,500)");
	
	
			
	
}
}
