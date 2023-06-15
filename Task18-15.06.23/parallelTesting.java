package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTesting {
	
	@Test
	public void openGoogle() {
		//System.setProperty("webdriver.chrome.driver", "")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.quit();
	}
	@Test
	public void openBing() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		//driver.quit();
		
	}
	}


