package HandlingRobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.http.WebSocket;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRobotclass {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//1 create object for Robot
        Robot Robj = new Robot();
        
    //2 
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
	
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
        
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
        
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
        
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
        
        Robj.keyPress(KeyEvent.VK_TAB);
        Robj.keyRelease(KeyEvent.VK_TAB);
        
    //Type a word 
       // Robj.keyPress(KeyEvent.VK_CAPS_LOCK);
       //Robj.keyRelease(KeyEvent.VK_CAPS_LOCK);
        Robj.keyPress(KeyEvent.VK_SHIFT);
        Robj.keyPress(KeyEvent.VK_C);
        Robj.keyRelease(KeyEvent.VK_C);
        Robj.keyRelease(KeyEvent.VK_SHIFT);
       
      
        Robj.keyPress(KeyEvent.VK_O);
        Robj.keyRelease(KeyEvent.VK_O);
        
    
        
        Robj.keyPress(KeyEvent.VK_M);
        Robj.keyRelease(KeyEvent.VK_M);
       
        
        
 
        Robj.keyPress(KeyEvent.VK_P);
        Robj.keyRelease(KeyEvent.VK_P);
   

        Robj.keyPress(KeyEvent.VK_U);
        Robj.keyRelease(KeyEvent.VK_U);
  
        
        
        Robj.keyPress(KeyEvent.VK_T);
        Robj.keyRelease(KeyEvent.VK_T);
        
        Robj.keyPress(KeyEvent.VK_E);
        Robj.keyRelease(KeyEvent.VK_E);
        
        Robj.keyPress(KeyEvent.VK_R);
        Robj.keyRelease(KeyEvent.VK_R);
        
        //Robj.keyPress(KeyEvent.VK_CAPS_LOCK);
        //Robj.keyRelease(KeyEvent.VK_CAPS_LOCK);
        
        
}
}
