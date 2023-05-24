package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public SwitchWindow() {

	}

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.linkText("Open New Window"));
		
	
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		for (String windowHandle : windowHandles)
		{
			if(!windowHandle.equals(driver.getWindowHandle()));
			{
				driver.switchTo().window(windowHandle);
				
				break;
				
			}
		}
		
		
		driver.close();
		
		driver.switchTo().window(driver.getWindowHandle());
		
		
		
	
		
		

	}

}
