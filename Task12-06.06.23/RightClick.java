package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions builder = new Actions(driver);
		
		builder.contextClick(ele).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();		
		

	}

}
