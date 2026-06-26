package HandlingKeyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnkeyboardOperation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		// Actions Class Create Object
		Actions actionobj = new Actions(driver);

		/*
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * 
		 */

		actionobj.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, "book", Keys.ENTER).perform();

	}
}
