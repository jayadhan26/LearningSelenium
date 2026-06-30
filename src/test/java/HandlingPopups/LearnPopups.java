package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPopups {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//Simple Popup
	WebElement Js1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	Js1.click();
	driver.switchTo().alert().accept();
	
	//Confirm Popup
	WebElement Js2 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	Js2.click();
	driver.switchTo().alert().dismiss();
	
	//Prompt popup
	WebElement Js3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	Js3.click();
	driver.switchTo().alert().sendKeys("Okkk"); 
	driver.switchTo().alert().accept();
	
	
	
	
	
	
}
}
