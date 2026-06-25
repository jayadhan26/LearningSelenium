package learnWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowManagement {
   
	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   Thread.sleep(1000);
		   
		   driver.manage().window().minimize();
		   Thread.sleep(1000);
		   
		   driver.manage().window().fullscreen();
		   Thread.sleep(1000);
		   
		   driver.manage().window().getSize();
		   Thread.sleep(1000);
		   
		   
		   driver.manage().window().getPosition();
		   Thread.sleep(1000);
		   
		   driver.manage().window().setSize(new Dimension(200,200));
		   Thread.sleep(1000);
		   
		   driver.manage().window().setPosition(new Point(0,500));
		   Thread.sleep(1000);
		   
		   driver . close();
		   
		   
		   
	}
}
