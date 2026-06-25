package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSingleDropdown {
 public static void main(String[] args) {
	
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://www.amazon.in/");
	 
	 WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));
	 
	  Select selectobj = new Select(dropdown);
	  
	  
	  boolean status = selectobj.isMultiple();
	  if(status)
	  {
		  System.out.println("It is Multiple dropdown");
	  }
	  else
	  {
		  System.out.println("It is Single dropdown");
	  }
	  
	  
	  //Selection using Index
	  
	  selectobj.selectByIndex(20);
	  
	  selectobj.selectByValue("search-alias=baby");
	  
	  selectobj.selectByVisibleText("Grocery & Gourmet Foods");
	  
	  System.out.println("------------------------------------");
	  
	  //Fetch values
	  
	  List<WebElement> Alloption = selectobj.getOptions();
	  System.out.println(Alloption.size());
	  System.out.println("------------------------------------");

	  
	  
	  for(int i=0;i< Alloption.size();i++)
		{
			System.out.println(Alloption.get(i).getText());
		}
	  
	  
	  
	 
	 
	 
	 
}
}
