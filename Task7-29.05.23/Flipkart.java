package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Power Banks")).click();
		Thread.sleep(2000);
		
		WebElement LowPrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div/div/section[2]/div[4]/div[1]/select"));
		
		Select select1 = new Select(LowPrice);
		select1.selectByIndex(2);
		 Thread.sleep(3000);
		 
		 WebElement HighPrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div/div/section[2]/div[4]/div[3]/select"));
			
			Select select2 = new Select(HighPrice);
			select2.selectByIndex(0);
			 Thread.sleep(1000);
			 
			 
		 
		 
		 
		
	
		
		
		
		


	}

}
