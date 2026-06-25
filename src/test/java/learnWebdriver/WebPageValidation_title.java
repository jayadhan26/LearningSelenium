package learnWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidation_title {
      public static void main(String[] args) {
    	//Step 1 : Open the Browser
    	  WebDriver driver = new ChromeDriver();
    	  
    		//Step 2 : Nav to application via url
    	  driver.get("https://www.Selenium.dev/");

  		//Step 3 : Enter the expected Title
    	  String expec_title = "Selenium";
    	  

  		//Step 4 : Enter the actual Title
    	  String act_title = driver.getTitle();
    	  System.out.println(act_title);
    	  
    	 //Step 5 : Validate the title
    	  if(expec_title.equals(act_title))
    	  {
    		  System.out.println("Title Verified Pass.");
    	  }
    	  else
    	  {
    		  System.out.println("Title Verified Failed.");
    	  }
    	  
    	  
	}
}
