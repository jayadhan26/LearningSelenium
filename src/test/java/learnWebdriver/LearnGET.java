package learnWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGET {
     public static void main(String[] args) {
    	//Step 1 : open the browser
		WebDriver driver  = new ChromeDriver();
		//Step 2 : Nav to application via url
		driver.get("https://www.flipkart.com/");
		//Step 3 : close the Browser
		driver.close();
		
		
	}
}
 
