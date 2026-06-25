package HandlingMultipleElements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTitle {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	 Scanner s = new Scanner(System.in);
	   
	   System.out.println("Enter a value to Find:");
	   
	   int n = s.nextInt();
	   
	   
	driver.get("https://vinothqaacademy.com/webtable/");
	
	// get a name column
	WebElement name = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
	
	System.out.println("Name of Third Row:"+name.getText());
	System.out.println("-----------------------------------------------------------------");
	
	//Fetch all the employee name 
	
	   List<WebElement> Allname = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
	   
	   for(WebElement list:Allname) 
	   {
		   System.out.println(list.getText());
	   }
	
	   
	   System.out.println("-----------------------------------------------------------------");
	   
	// Fetch 3rd row details 
	   List<WebElement> Rowelements = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]"));
	    
	   for(WebElement list1:Rowelements) 
	   {
		   System.out.println(list1.getText());
	   }
	   System.out.println("-----------------------------------------------------------------");
	
	   
	   
	   //User input for find a value 
	  WebElement name1 = driver.findElement(By.xpath("//table[@id='myTable']//tr["+n+"]/td[2]"));
		
		System.out.println("Name of Third Row:"+name1.getText());
	   
	   
	   
}
}
