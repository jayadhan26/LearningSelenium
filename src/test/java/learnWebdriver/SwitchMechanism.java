package learnWebdriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMechanism {
  public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver = new ChromeDriver();
	 
	driver . navigate().to("https://www.meesho.com");
	Thread.sleep(1500);
	
	driver.switchTo(). newWindow(WindowType.TAB);
	Thread.sleep(1500);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
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
