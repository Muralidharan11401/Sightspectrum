package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	

		public static void main(String[] args) throws IOException, InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.lambdatest.com/blog/perform-mouse-actions-in-selenium-webdriver/");
			driver.manage().window().maximize();
			
			
			Thread.sleep(2000);
			 
			WebElement elec = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/div/div/div[1]/a")); 
			Actions apple = new Actions(driver);
			apple.moveToElement(elec).perform();
			driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/ul/li[1]/a/div/div[2]/p")).click();
			
			
			
			
			
			Thread.sleep(5000);
			driver.close();

		}

	}


