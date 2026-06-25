package learnWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidation_url {
      public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String expec_url = "https://code.claude.com/docs/en/overview";
		
		String act_url = "https://www.flipkart.com/";
		
		if(expec_url.equals(act_url))
		{
			System.out.println("The URL Verification Passed");
		}
		else
		{
			System.out.println("The URL Verification Failed");
		}
		
	}
}
