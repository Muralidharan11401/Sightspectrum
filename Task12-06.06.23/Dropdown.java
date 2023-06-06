package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);

		
        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Select select = new Select(day);
		select.selectByIndex(2);
		
        Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("Apr");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		
		Select select2 = new Select(year);
		select2.selectByValue("2012");
		 Thread.sleep(1000);
		 

	}
	
	

}
