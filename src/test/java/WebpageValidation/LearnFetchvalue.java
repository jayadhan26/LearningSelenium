package WebpageValidation;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFetchvalue {
	 
	public static void main(String[] args)  throws MalformedURLException, InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		WebElement element = driver.findElement(By.cssSelector(".login_logo"));
		
		if(element.isDisplayed())
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		//Text
		String actualTxt = element.getText(); 
		String expTxt = "Swag Labs";
		System.out.println(actualTxt);
		if(expTxt.equals(expTxt))
		{
			System.out.println("Text is Equal");
		}
		else
		{
			System.out.println("Text is not equal");
		}
		
		
		
		
		
		
		// TagName
		String actTagname = element.getTagName(); 
		String expTagname = "input";
		System.out.println(actTagname);
		if(actTagname.equals(expTagname))
		{
			System.out.println("Tagname is Equal");
		}
		else
		{
			System.out.println("Tagename is not equal");
		}
		
		
		
		
		//Attribute
		String actAttri = element.getAttribute("class"); 
		String expAttri = "login_logo";
		System.out.println(actAttri);
		if(actAttri.equals(expAttri))
		{
			System.out.println("Attribute is Equal");
		}
		else
		{
			System.out.println("Attribute is not equal");
		}
		
		
		
		
		//CssSelector
		String ActCss = element.getCssValue("font-family"); 
		String expCss = "DM Mono,sans-serif";
		System.out.println(ActCss);
		if(ActCss.equals(expCss))
		{
			System.out.println("CssSelector is Equal");
		}
		else
		{
			System.out.println("CssSelector is not equal");
		}
		
		
		
		
		
		//Size
		Dimension actsize = element.getSize();
		int actwidth = actsize.getWidth();
		int actheight = element.getSize().getHeight();
		System.out.println(actsize);
		System.out.println(actwidth);
		System.out.println(actheight);
		
		int expWidth = 100;
		int expHeigth = 200;
		
		if(actwidth==expWidth && actheight==expHeigth )
		{
			System.out.println("Width and height is Equal to expected");
		}
		else
		{
			System.out.println(" Width and height is not Equal to expected");
		}
		
		
		
		
		
		
		
		//Location
		Point actloc = element.getLocation();
		int actX = actloc.getX();
		int actY = actloc.getY();
		System.out.println(actloc);
		System.out.println(actX);
		System.out.println(actY);
		
		int expX = 0;
		int expY = 0;
		
		if(actX==expX && actY==expY)
		{
			System.out.println("Points are eqaul to expected");
		}
		else
		{
			System.out.println("Points are not eqaul to expected");
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

		