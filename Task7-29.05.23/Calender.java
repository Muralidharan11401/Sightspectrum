package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(2000);
	
	 driver.findElement(By.id("datepicker2")).sendKeys("05/01/2023"+Keys.ENTER);
	 
	driver.findElement(By.id("datepicker1")).click();
	
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'7')]")).click();
	

		
	}

}
