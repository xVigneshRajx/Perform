package act;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	 static WebDriver driver;
		static Actions act;
	    static Robot robot;
		public static void openBrowser() {		
			driver = new ChromeDriver();
		}
		public static void webSite(String url) {
			driver.get(url);
		}
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
		public static void infoTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		public static void textInput(String text) throws InterruptedException, AWTException {
			WebElement textInput = driver.findElement(By.xpath(text));
			textInput.sendKeys("Jimmy");
			Thread.sleep(2000);
			act = new Actions(driver);
			act.doubleClick(textInput).build().perform();
	        textInput.sendKeys(Keys.LEFT_CONTROL+ "c");

	        robot = new Robot();
	        for(int i=0;i<2;i++){
	            robot.keyPress(KeyEvent.VK_TAB);
	            robot.keyRelease(KeyEvent.VK_TAB);
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	      
	        }
		}


}
