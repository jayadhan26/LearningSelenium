package RegistrationWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoWebShop {
  public static void main(String[] args) throws InterruptedException {
	   
	  ChromeDriver driver = new ChromeDriver();
	  
	  
	  driver.get("https://share.google/GqMsVAzcXT79OW9Br");
	  
	  driver.manage().window().maximize();
	   Thread.sleep(1500);
	  
	 WebElement reg = driver.findElement(By.xpath("//a[@class='ico-register']"));//1
	 reg.click();
	 Thread.sleep(1500);
	  
	  
	WebElement gen = driver.findElement(By.xpath("//input[contains(@id,'male')]"));//2
	gen.click();
	Thread.sleep(1500);
	
	
	WebElement FN = driver.findElement(By.xpath("//input[@id='FirstName']"));//3
	FN.sendKeys("Jayadhan");
	Thread.sleep(1000);
	
	WebElement LN = driver.findElement(By.xpath("//input[@name='LastName']"));//4
	LN.sendKeys("S");
	Thread.sleep(1500);
	
	WebElement Em = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
	Em.sendKeys("jayadhan52@gmail.com");
	Thread.sleep(1500);
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));
	pass.sendKeys("260969");
	
	WebElement conpass = driver.findElement(By.xpath("//input[contains(@id,'Confirm')]"));
	conpass.sendKeys("260969");
	Thread.sleep(1500);
	
	WebElement regButton = driver.findElement(By.xpath("//input[@value='Register']"));
	regButton.click();
	
	WebElement cont = driver.findElement(By.xpath("//input[@value='Continue']"));
	cont.click();
	
	WebElement LogO = driver.findElement(By.xpath("//a[@class='ico-logout']"));
	LogO.click();
	
	
	
	
	  
	  
	  
	  
}
}
