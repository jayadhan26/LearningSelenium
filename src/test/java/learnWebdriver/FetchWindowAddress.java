package learnWebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchWindowAddress {
public static void main(String[] args) {
	    
	WebDriver driver = new ChromeDriver();
	
     driver.get("https://www.youtube.com");
     
     
     //Fetch the parent address
     String ParentAdd = driver.getWindowHandle();
     
     System.out.println(ParentAdd);
     
     //switch to new window
     driver.switchTo().newWindow(WindowType.WINDOW);
     
     driver.navigate().to("https://www.amazon.in/");
     
     //fetch all the address (Parent and child)
     Set <String> allAdd = driver.getWindowHandles();
     
     System.out.println(allAdd);
     
     // to close all prefer to use QUIT
     
     driver.quit();
     }
}
