package learnWebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	 
	public static void main(String[] args)  throws MalformedURLException, InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.navigate().to("https://www.meesho.com/");
		Thread.sleep(1500);
		
		driver.navigate().to(new URL("https://online.kfc.co.in/"));
		Thread.sleep(1500);
 		
		driver.navigate().back();
		Thread.sleep(1500);
		
		driver.navigate().forward();
		Thread.sleep(1500);
		
		driver.navigate().refresh();

		
		
		
		
				
				
	}

}