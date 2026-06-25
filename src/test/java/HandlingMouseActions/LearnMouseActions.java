package HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseActions {
  public static void main(String[] args) {
	
	WebDriver  driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	Actions act = new Actions(driver);
	
	//Mouse hover
	WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
	act.moveToElement(ele1).perform();
	
	//click 
	WebElement ele2 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Des')]"));
	act.click(ele2).perform();
	
	//Double click
	WebElement ele3 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Not')]"));
	act.doubleClick(ele3).perform();
	
	//context Click 
	WebElement ele4 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Dig')]"));
	act.contextClick(ele4).perform();
	
	
	
	
	  
	  
	  
	  
}
}
