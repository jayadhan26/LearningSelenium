package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutoSuggestion {
  public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=809000348074&hvpos=&hvnetw=g&hvrand=2501023763821682512&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061892&hvtargid=kwd-64107830&hydadcr=14452_2459470&gad_source=1");
	 
	 //Get input from user 
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter a product to search:");
	 String Searchvalue = s.next();
	 WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 searchbox.sendKeys(Searchvalue);
	 
	 
	 //Handle Auto
	    List<WebElement> Allsuggestion = driver.findElements(By.xpath("//div[text()='"+Searchvalue+"']"));
	   
	 //Print the suggested text value
	  for(int i=0;i<Allsuggestion.size();i++)
	  {
		  System.out.println(Allsuggestion.get(i).getText());
	  }
	 
	 
	 
	 
	 
	 
}
}
