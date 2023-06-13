package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("sightspectrum");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
