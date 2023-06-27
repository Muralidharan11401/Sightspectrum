package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Muralidharan");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("S");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[9]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("exp")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("datepicker")).sendKeys("05-11-1996");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[20]/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("tool")).click();
		Thread.sleep(2000);
		
WebElement commands = driver.findElement(By.id("selenium_commands"));
		
		Select select1 = new Select(commands);
		select1.selectByVisibleText("Switch Commands");
		
		Thread.sleep(2000);		
		
	}

}
