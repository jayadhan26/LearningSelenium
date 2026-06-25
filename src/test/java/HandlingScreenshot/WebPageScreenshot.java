package HandlingScreenshot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {
   public static void main(String[] args) throws IOException 
   {
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	
	driver.get("https://www.saucedemo.com/");
	
	
	//TypeCast
	
	   TakesScreenshot  ts = (TakesScreenshot)driver;
	   
	//CaptureSS and store in tem Path
	   
	   File tempath = ts.getScreenshotAs(OutputType.FILE);
	   
	// Create permanent path
	    
	   File pertpath = new File("./src/test/resources/TestScreenshot/screenshot.png");
	   
	//copy SS from tem to per
	   
	  FileHandler.copy(tempath, pertpath);
	  
	   
	
}
}
