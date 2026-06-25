package HandlingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnMultipleDropDown {
public static void main(String[] args) {

	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("file:///C:/Users/Jayadhan/Downloads/EmbededWebpage.html");
	
	WebElement Dd1 = driver.findElement(By.cssSelector("select[name='country2']"));
	
	Select selectobj = new Select(Dd1);
	
	//Validate the Dropdown is multiple or single 
	boolean status = selectobj.isMultiple();
	
	if (status) {
		System.out.println("It is multiple dropdown");
	} else {
		System.out.println("It is single dropdown");
	}
	
	System.out.println("-------------------------------------------");

	
	//Get All options 
	
	List<WebElement> allOptions = selectobj.getOptions();
	//Print the size of options
	System.out.println(allOptions.size());
	
	System.out.println("-------------------------------------------");
	
	//Print the options
	for(WebElement list :allOptions)
	{
	  System.out.println(list.getText());
	}
	
	System.out.println("-------------------------------------------");
	
	
	
	
	//Perform Selection by using different methods
	selectobj.selectByIndex(0);
	
	selectobj.selectByValue("ind");
	
	selectobj.selectByVisibleText("INDIA");
	
	     //select.selectByContainsVisibleText("IND");
	
	System.out.println("-------------------------------------------");
	
	
	
	//Fetching Values
	WebElement Firstopt = selectobj.getFirstSelectedOption();
	
	System.out.println("The first option is :" + Firstopt.getText());
	
	System.out.println("-------------------------------------------");

	
	List<WebElement> Allopts = selectobj.getAllSelectedOptions();	
	
	for(WebElement Options:Allopts)
	{
		System.out.println(Options.getText());
	}
	System.out.println("-------------------------------------------");
	
	
	//Wrapper
	WebElement wrapper = selectobj.getWrappedElement();
	 
	 System.out.println(wrapper.getText());
	 
	 System.out.println("-------------------------------------------");
	 
	 
	 
	//perform Deselection
	 
	 selectobj.deselectByIndex(0);
		
	 selectobj.deselectByValue("ind");
		
	 selectobj.deselectByVisibleText("INDIA");
			 
	 
	
	 
	
	driver.close();
	

	
	
	
	
}
}
 














/*




 
 
 

  

 
 
 
 
 
 
 
 


}
*/
