package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		
		// simple alert
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button"));
		
		Thread.sleep(2000);
		element.click();		
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		
		// confirm alert
		
				WebElement confrim = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button"));
				
				confrim.click();
				driver.switchTo().alert().accept();
		
				Thread.sleep(2000);
		
		// prompt alert
		
		WebElement promptAlert = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button"));
//		
		
		
		promptAlert.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Text");
		
		driver.switchTo().alert().accept();
		
		
		
		
	
		
		
	}

}
