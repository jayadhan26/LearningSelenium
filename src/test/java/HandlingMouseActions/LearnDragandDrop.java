package HandlingMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class LearnDragandDrop {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://vinothqaacademy.com/mouse-event/");

		Actions act = new Actions(driver);

		WebElement dragele = driver.findElement(By.id("dragItem"));

		WebElement dropele = driver.findElement(By.id("dropZone"));

		// perform Mouse Operation->Drag and drop

		act.dragAndDrop(dragele, dropele).perform();

		// Alternative Method
		// act.clickAndHold(dragele).release(dropele).perform();

		// Hover
		WebElement hover = driver.findElement(By.id("tooltipTarget"));
		act.moveToElement(hover).perform();

		// Slider
		act.dragAndDropBy(driver.findElement(By.id("handle_max")), 200, 0).perform();

		
		
		// Scrolling
		act.scrollByAmount(0, 500).perform();

		act.scrollToElement(hover).perform();

		act.scrollFromOrigin(ScrollOrigin.fromElement(hover), 0, 500).perform();

		
		
		
		
		
		
		
		
		
		
	}
}
