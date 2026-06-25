package WebpageValidation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageValidation {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/");

		System.out.println("Home page Title is:" + driver.getTitle());

        //identify WE
		WebElement sign = driver.findElement(By.xpath("//i[@class='fa fa-lock'] "));
		
		
		// validate WE
		if (sign.isDisplayed() && sign.isEnabled()) {
			System.out.println(" Signup Pass");
		} else {
			System.out.println("Signup Fail");
		}
		
		// Perform Operation-click on it
		sign.click();
		Thread.sleep(1500);

		System.out.println("Signup page Title is: " + driver.getTitle());
		
		
		//Name 
		
		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));// 2
		
		if (	 Name.isDisplayed()&& Name.isEnabled()) {
			System.out.println(" User name Pass");
		} else {
			System.out.println("User name Fail");
		}
		Name.sendKeys("Jay");
		Thread.sleep(1500);
		
		
		
		
       //Email		
 
		WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));// 3

		 
		if (email.isDisplayed()&& email.isEnabled()) {
			System.out.println("Email Pass");
		} else {
			System.out.println("Email Fail");
		}
        email.sendKeys("jayadhan13@gmail.com");
        Thread.sleep(1500);
		
		
		//SignUp Button 

		WebElement signup = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));// 4
		if (signup.isDisplayed()&& signup.isEnabled()) {
			System.out.println("Sign Pass");
		} else {
			System.out.println("Sign Fail");
		}

		signup.click();
		Thread.sleep(1500);
		
		
		

		System.out.println("Create account page Title is: " + driver.getTitle());

		WebElement radio = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		if (radio.isDisplayed() && radio.isEnabled()) {
			System.out.println("Radio Button Pass");
		} else {
			System.out.println("Radio Button Fail");
		}
		
		if (radio.isSelected()) {
			System.out.println("Radio Button not selected");
		} else {
			System.out.println("Radio Button   Selected");
		}
		Thread.sleep(1500);
		
		
		radio.click();
		
		//Recheck
		
		if (radio.isDisplayed() && radio.isEnabled()) {
			System.out.println("Radio Button Pass");
		} else {
			System.out.println("Radio Button Fail");
		}
		
		if (radio.isSelected()) {
			System.out.println("Radio Button not selected");
		} else {
			System.out.println("Radio Button   Selected");
		}
		

		
	
		//sname
		
		WebElement sname = driver.findElement(By.xpath("//input[@class='form-control']"));
		if(sname.isDisplayed()&& sname.isEnabled())
		{
			System.out.println("sname Pass");
		}
		else
		{
			System.out.println("sname Fail");
		}
		sname.sendKeys("Jayadhan");
		Thread.sleep(1500);
		
	   
		//Email
		WebElement Email = driver.findElement(By.xpath("//input[@data-qa='email']"));
		if(Email.isDisplayed() && Email.isEnabled())
		{
			System.out.println("Email Passed");
		}
		else
		{
			System.out.println("Email Failed");
		}
		Email.sendKeys("jayadhan00@gmail.com");
		Thread.sleep(1500);
		
		
		
		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		if(Pass.isDisplayed() && Pass.isEnabled())
		{
			System.out.println("Password Pass");
		}
		else
		{
			System.out.println("Password Fail");
		}
		Pass.sendKeys("260969");
		Thread.sleep(1500);
		
		
		
		//CustomTimeStamp
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String customtime = sdf.format(new Date());
		Thread.sleep(1500);
		
		
	
        
		//Screenshot 
		
		 TakesScreenshot  ts = (TakesScreenshot)driver;
		 
		 File Tempath = ts.getScreenshotAs(OutputType.FILE);
		 
		 File Perpath = new File("./src/test/resources/TestScreenshot/screenshot1"+customtime+".png");
		 
		 FileHandler.copy(Tempath,Perpath);
		 Thread.sleep(1500);
		 
		 
		 driver.close();
		 
		 
		
		
		

	}
}
