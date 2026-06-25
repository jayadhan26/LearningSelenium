package learnWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElement{
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	// Identify web element based on Id attribute and its value(User Name)
	
	 WebElement UNtxtfld = driver.findElement(By.id("user-name"));
	 Thread.sleep(1000);
	 UNtxtfld.sendKeys("standard_user");
	 Thread.sleep(1000);
	 
	 //Identify web element based on Id attribute and its value(PassWord)
	 WebElement Pass = driver.findElement(By.id("password"));
	 Thread.sleep(1000);
	 Pass.sendKeys("secret_sauce");
	 Thread.sleep(1000);
	 
	 
	 WebElement Login = driver.findElement(By.id("login-button"));
	 Thread.sleep(1000);
	 Login.click();
	 Thread.sleep(5000);
	 
	 
	 
	 driver.close();
	}
}
