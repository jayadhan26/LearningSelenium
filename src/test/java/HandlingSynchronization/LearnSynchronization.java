package HandlingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSynchronization {
public static void main(String[] args) throws InterruptedException {
	 
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/");
	
	WebElement WelcomeTxt = driver.findElement(By.xpath("//h3"));
	
	System.out.println(WelcomeTxt.getText());
	
	WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
	
	LoginBtn.click();
	Thread.sleep(1500);
	
	driver.close();
	
	
}
}
